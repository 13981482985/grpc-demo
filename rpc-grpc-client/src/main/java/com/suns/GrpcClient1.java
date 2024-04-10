package com.suns;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.Iterator;

public class GrpcClient1 {
    public static void main(String[] args) {
        // 1、创建通信的管
        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost", 9000).usePlaintext().build();

        try {
            // 2、创建代理的对象
            HelloServiceGrpc.HelloServiceBlockingStub helloService = HelloServiceGrpc.newBlockingStub(managedChannel); // 阻塞式

            // 3、完成RPC调用
            // 3.1 准备参数
            HelloProto.HelloRequest.Builder builder = HelloProto.HelloRequest.newBuilder();
            builder.setName("yang fu song");
            HelloProto.HelloRequest helloRequest = builder.build();

            HelloProto.HelloRequest1.Builder builder1 = HelloProto.HelloRequest1.newBuilder();
            builder1.addName("yangfusong");
            builder1.addName("张三");
            builder1.addName("王麻子");
            HelloProto.HelloRequest1 helloRequest1 = builder1.build();


            // 3.2 调用
            HelloProto.HelloResponse response = helloService.hello(helloRequest);// 一元RPC调用
            HelloProto.HelloResponse1 response1 = helloService.hello1(helloRequest1);


            // 3.3 输出响应
            System.out.println("result:"+response.getResult());
            System.out.println("result1:"+response1.getResult());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 关闭通道
            managedChannel.shutdown();
        }

    }
}
