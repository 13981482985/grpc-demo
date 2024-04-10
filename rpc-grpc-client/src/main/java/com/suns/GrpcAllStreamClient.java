package com.suns;


import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.concurrent.TimeUnit;

// 双向流式RPC
public class GrpcAllStreamClient {
    public static void main(String[] args) {
        // 1、创建通信的管
        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost", 9000).usePlaintext().build();
        try {
            // 2、创建代理的对象 异步的模式
            HelloServiceGrpc.HelloServiceStub helloServiceStub = HelloServiceGrpc.newStub(managedChannel);
            StreamObserver<HelloProto.HelloRequest> helloRequestStreamObserver = helloServiceStub.allStream(new StreamObserver<HelloProto.HelloResponse>() {
                @Override
                public void onNext(HelloProto.HelloResponse helloResponse) {
                    // 监听到 服务器的当前响应
                    System.out.println("监听到 服务器的当前响应");
                    System.out.println("响应内容："+helloResponse.getResult());
                }

                @Override
                public void onError(Throwable throwable) {

                }

                @Override
                public void onCompleted() {
                    System.out.println("监听到 服务器完成响应");

                }
            });

            // 流式发送给服务器参数
            for(int i=0; i<10; i++){
                HelloProto.HelloRequest.Builder builder = HelloProto.HelloRequest.newBuilder();
                builder.setName("yang:"+i);
                HelloProto.HelloRequest request = builder.build();
                helloRequestStreamObserver.onNext(request);
                Thread.sleep(1000);
            }
            helloRequestStreamObserver.onCompleted();

            managedChannel.awaitTermination(12, TimeUnit.SECONDS); // 异步 客户端需等待请求数据发送结束
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            managedChannel.shutdown();
        }
    }

}
