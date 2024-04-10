package com.suns.service;

import com.suns.TestProto;
import com.suns.TestServiceGrpc;
import io.grpc.stub.StreamObserver;

public class TestServiceImpl extends TestServiceGrpc.TestServiceImplBase {
    @Override
    public void testSuns(TestProto.TestRequest request, StreamObserver<TestProto.TestResponse> responseObserver) {
        String name = request.getName();
        System.out.println("name = "+name);
        responseObserver.onNext(TestProto.TestResponse.newBuilder().setResult("test is ok").build());
        responseObserver.onCompleted();
    }
}
