package com.suns;

import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class GrpcFutureClient {
    public static void main(String[] args) {
        // 1、创建通信的管
        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost", 9000).usePlaintext().build();
        try{
            TestServiceGrpc.TestServiceFutureStub testServiceFutureStub = TestServiceGrpc.newFutureStub(managedChannel);
            ListenableFuture<TestProto.TestResponse> responseListenableFuture = testServiceFutureStub.testSuns(TestProto.TestRequest.newBuilder().setName("yang test future").build());

            // 服务器同步阻塞操作
//            TestProto.TestResponse testResponse = responseListenableFuture.get();
//            System.out.println(testResponse.getResult());
            // 后续的操作...


            // 异步的操作
            Futures.addCallback(responseListenableFuture, new FutureCallback<TestProto.TestResponse>() {
                @Override
                public void onSuccess(TestProto.TestResponse testResponse) {
                    System.out.println("result:"+testResponse.getResult());
                    System.out.println("后续操作...");
                }

                @Override
                public void onFailure(Throwable throwable) {

                }
            },Executors.newCachedThreadPool());
            // 后续的操作...
            managedChannel.awaitTermination(12, TimeUnit.SECONDS);
        }catch (Exception e){

        }finally {

        }
    }
}
