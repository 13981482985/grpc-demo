package com.suns;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.concurrent.TimeUnit;


public class GrpcStreamServerClient {

    public static void main(String[] args) throws InterruptedException {
        // 1、创建通信的管
        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost", 9000).usePlaintext().build();
        try {
            // 2、创建代理的对象 异步的模式
            HelloServiceGrpc.HelloServiceStub helloServiceStub = HelloServiceGrpc.newStub(managedChannel);

            HelloProto.HelloRequest.Builder builder2 = HelloProto.HelloRequest.newBuilder();
            builder2.setName("服务端流式RPC调用");
            HelloProto.HelloRequest helloRequest2 = builder2.build();
            helloServiceStub.c2ss(helloRequest2, new StreamObserver<HelloProto.HelloResponse>() { // 这个方法是以异步的方式执行
                @Override
                public void onNext(HelloProto.HelloResponse helloResponse) {  // 监控服务端的onNext事件
                    System.out.println("监控到当前服务端的返回数据："+helloResponse.getResult()); // 服务端响应一条数据处理一条数据
                }

                @Override
                public void onError(Throwable throwable) { // // 监控服务端的onError事件
                    System.err.println("监控到服务端发生异常:"+throwable.getStackTrace());
                }

                @Override
                public void onCompleted() { // 监控服务端的onCompleted事件
                    // 如果需要服务端响应完所有数据再做处理 可以在这里进行业务处理
                    System.out.println("监控到服务端响应结束 在这里统一处理服务端返回的所有数据");
                }
            });
            managedChannel.awaitTermination(12, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            managedChannel.shutdown();
        }

    }

}
