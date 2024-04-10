package com.suns;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.52.1)",
    comments = "Source: Test.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TestServiceGrpc {

  private TestServiceGrpc() {}

  public static final String SERVICE_NAME = "TestService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.suns.TestProto.TestRequest,
      com.suns.TestProto.TestResponse> getTestSunsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "testSuns",
      requestType = com.suns.TestProto.TestRequest.class,
      responseType = com.suns.TestProto.TestResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.suns.TestProto.TestRequest,
      com.suns.TestProto.TestResponse> getTestSunsMethod() {
    io.grpc.MethodDescriptor<com.suns.TestProto.TestRequest, com.suns.TestProto.TestResponse> getTestSunsMethod;
    if ((getTestSunsMethod = TestServiceGrpc.getTestSunsMethod) == null) {
      synchronized (TestServiceGrpc.class) {
        if ((getTestSunsMethod = TestServiceGrpc.getTestSunsMethod) == null) {
          TestServiceGrpc.getTestSunsMethod = getTestSunsMethod =
              io.grpc.MethodDescriptor.<com.suns.TestProto.TestRequest, com.suns.TestProto.TestResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "testSuns"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.suns.TestProto.TestRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.suns.TestProto.TestResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TestServiceMethodDescriptorSupplier("testSuns"))
              .build();
        }
      }
    }
    return getTestSunsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TestServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TestServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TestServiceStub>() {
        @java.lang.Override
        public TestServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TestServiceStub(channel, callOptions);
        }
      };
    return TestServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TestServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TestServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TestServiceBlockingStub>() {
        @java.lang.Override
        public TestServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TestServiceBlockingStub(channel, callOptions);
        }
      };
    return TestServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TestServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TestServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TestServiceFutureStub>() {
        @java.lang.Override
        public TestServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TestServiceFutureStub(channel, callOptions);
        }
      };
    return TestServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class TestServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void testSuns(com.suns.TestProto.TestRequest request,
        io.grpc.stub.StreamObserver<com.suns.TestProto.TestResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTestSunsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getTestSunsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.suns.TestProto.TestRequest,
                com.suns.TestProto.TestResponse>(
                  this, METHODID_TEST_SUNS)))
          .build();
    }
  }

  /**
   */
  public static final class TestServiceStub extends io.grpc.stub.AbstractAsyncStub<TestServiceStub> {
    private TestServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TestServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TestServiceStub(channel, callOptions);
    }

    /**
     */
    public void testSuns(com.suns.TestProto.TestRequest request,
        io.grpc.stub.StreamObserver<com.suns.TestProto.TestResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTestSunsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TestServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<TestServiceBlockingStub> {
    private TestServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TestServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TestServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.suns.TestProto.TestResponse testSuns(com.suns.TestProto.TestRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTestSunsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TestServiceFutureStub extends io.grpc.stub.AbstractFutureStub<TestServiceFutureStub> {
    private TestServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TestServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TestServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.suns.TestProto.TestResponse> testSuns(
        com.suns.TestProto.TestRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTestSunsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_TEST_SUNS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TestServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TestServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_TEST_SUNS:
          serviceImpl.testSuns((com.suns.TestProto.TestRequest) request,
              (io.grpc.stub.StreamObserver<com.suns.TestProto.TestResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class TestServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TestServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.suns.TestProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TestService");
    }
  }

  private static final class TestServiceFileDescriptorSupplier
      extends TestServiceBaseDescriptorSupplier {
    TestServiceFileDescriptorSupplier() {}
  }

  private static final class TestServiceMethodDescriptorSupplier
      extends TestServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TestServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (TestServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TestServiceFileDescriptorSupplier())
              .addMethod(getTestSunsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
