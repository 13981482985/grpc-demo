package com.suns.service;

import com.google.protobuf.ProtocolStringList;
import com.suns.HelloProto;
import com.suns.HelloServiceGrpc;
import io.grpc.stub.StreamObserver;

public class HelloServiceImpl extends HelloServiceGrpc.HelloServiceImplBase {

    // 1、接收客户端提交得参数
    // 2、业务处理 service+dao 调对应的业务
    // 3、提供返回值
    @Override
    public void hello(HelloProto.HelloRequest request, StreamObserver<HelloProto.HelloResponse> responseObserver) {

        // 1、接收请求参数
        String name = request.getName();
        // 2、业务处理...
        System.out.println("name parameters:"+name);

        // 封装响应
        // 3.1、创建响应对象的构建者
        HelloProto.HelloResponse.Builder builder = HelloProto.HelloResponse.newBuilder();

        // 3.2、填充数据
        builder.setResult("hello method invoke");

        // 3.3、封装响应
        HelloProto.HelloResponse helloResponse = builder.build();
        responseObserver.onNext(helloResponse); // 处理完成后得响应消息 通过网络回传client
        responseObserver.onCompleted(); // 通知客户端 响应已经结束  如果不通知 客户端将一直拿不到返回结果，一直阻塞

    }

    @Override
    public void hello1(HelloProto.HelloRequest1 request, StreamObserver<HelloProto.HelloResponse1> responseObserver) {
        ProtocolStringList nameList = request.getNameList();
        System.out.println("name parameters:"+nameList);
        HelloProto.HelloResponse1.Builder builder = HelloProto.HelloResponse1.newBuilder();
        builder.setResult("ok");
        HelloProto.HelloResponse1 build = builder.build();
        responseObserver.onNext(build);
        responseObserver.onCompleted();
    }


    // TODO 服务端流式RPC
    @Override
    public void c2ss(HelloProto.HelloRequest request, StreamObserver<HelloProto.HelloResponse> responseObserver) {
        // 1、接收请求参数
        String name = request.getName();
        // 2、业务处理...
        System.out.println("name parameters:"+name);

        // 封装响应(流式)
        // 模拟在不同的时间返回不同的数据
        for (int i=0; i<9; i++){
            HelloProto.HelloResponse.Builder builder = HelloProto.HelloResponse.newBuilder();
            builder.setResult("处理的结果："+i);
            HelloProto.HelloResponse build = builder.build();
            responseObserver.onNext(build);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        responseObserver.onCompleted();
    }


    // TODO 客户端流式RPC
    @Override
    public StreamObserver<HelloProto.HelloRequest> cs2s(StreamObserver<HelloProto.HelloResponse> responseObserver) {
        return new StreamObserver<HelloProto.HelloRequest>() { // 监控客户端消息
            @Override
            public void onNext(HelloProto.HelloRequest helloRequest) {
                // 监控每条请求数据
                System.out.println("接收到当前的请求数据："+helloRequest.getName());
                // 业务处理 ...

            }

            @Override
            public void onError(Throwable throwable) {
                // 监控客户端的异常
                System.err.println("监控到客户端的异常");
            }

            @Override
            public void onCompleted() {
                System.out.println("接收到客户端的所有消息...");
                // 业务处理 ...
                HelloProto.HelloResponse.Builder builder = HelloProto.HelloResponse.newBuilder();
                builder.setResult("this is result");
                HelloProto.HelloResponse build = builder.build();
                responseObserver.onNext(build);
                responseObserver.onCompleted();
            }
        };
    }

    // TODO 双向流式RPC


    @Override
    public StreamObserver<HelloProto.HelloRequest> allStream(StreamObserver<HelloProto.HelloResponse> responseObserver) {
        return new StreamObserver<HelloProto.HelloRequest>() {
            @Override
            public void onNext(HelloProto.HelloRequest helloRequest) {
                System.out.println("监听到客户端发送的数据:"+helloRequest.getName());

                HelloProto.HelloResponse.Builder builder = HelloProto.HelloResponse.newBuilder();
                builder.setResult(helloRequest.getName()+"：的返回数据");
                HelloProto.HelloResponse helloResponse = builder.build();
                responseObserver.onNext(helloResponse);
            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onCompleted() {
                System.out.println("监听到客户端发送完所有的数据:");
                responseObserver.onCompleted();
            }
        };
    }
}
