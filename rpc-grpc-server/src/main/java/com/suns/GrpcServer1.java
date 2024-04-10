package com.suns;

import com.suns.service.HelloServiceImpl;
import com.suns.service.TestServiceImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class GrpcServer1 {
    public static void main(String[] args) throws IOException, InterruptedException {
        ServerBuilder<?> serverBuilder = ServerBuilder.forPort(9000); // 服务绑定端口
        serverBuilder.addService(new HelloServiceImpl()); // 发布服务
        serverBuilder.addService(new TestServiceImpl());
        // 创建服务对象
        Server server = serverBuilder.build();
        server.start();
        server.awaitTermination();
    }
}
