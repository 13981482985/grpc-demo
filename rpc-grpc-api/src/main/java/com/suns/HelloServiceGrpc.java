package com.suns;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.52.1)",
    comments = "Source: Hello.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class HelloServiceGrpc {

  private HelloServiceGrpc() {}

  public static final String SERVICE_NAME = "HelloService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.suns.HelloProto.HelloRequest,
      com.suns.HelloProto.HelloResponse> getHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "hello",
      requestType = com.suns.HelloProto.HelloRequest.class,
      responseType = com.suns.HelloProto.HelloResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.suns.HelloProto.HelloRequest,
      com.suns.HelloProto.HelloResponse> getHelloMethod() {
    io.grpc.MethodDescriptor<com.suns.HelloProto.HelloRequest, com.suns.HelloProto.HelloResponse> getHelloMethod;
    if ((getHelloMethod = HelloServiceGrpc.getHelloMethod) == null) {
      synchronized (HelloServiceGrpc.class) {
        if ((getHelloMethod = HelloServiceGrpc.getHelloMethod) == null) {
          HelloServiceGrpc.getHelloMethod = getHelloMethod =
              io.grpc.MethodDescriptor.<com.suns.HelloProto.HelloRequest, com.suns.HelloProto.HelloResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "hello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.suns.HelloProto.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.suns.HelloProto.HelloResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HelloServiceMethodDescriptorSupplier("hello"))
              .build();
        }
      }
    }
    return getHelloMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.suns.HelloProto.HelloRequest1,
      com.suns.HelloProto.HelloResponse1> getHello1Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "hello1",
      requestType = com.suns.HelloProto.HelloRequest1.class,
      responseType = com.suns.HelloProto.HelloResponse1.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.suns.HelloProto.HelloRequest1,
      com.suns.HelloProto.HelloResponse1> getHello1Method() {
    io.grpc.MethodDescriptor<com.suns.HelloProto.HelloRequest1, com.suns.HelloProto.HelloResponse1> getHello1Method;
    if ((getHello1Method = HelloServiceGrpc.getHello1Method) == null) {
      synchronized (HelloServiceGrpc.class) {
        if ((getHello1Method = HelloServiceGrpc.getHello1Method) == null) {
          HelloServiceGrpc.getHello1Method = getHello1Method =
              io.grpc.MethodDescriptor.<com.suns.HelloProto.HelloRequest1, com.suns.HelloProto.HelloResponse1>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "hello1"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.suns.HelloProto.HelloRequest1.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.suns.HelloProto.HelloResponse1.getDefaultInstance()))
              .setSchemaDescriptor(new HelloServiceMethodDescriptorSupplier("hello1"))
              .build();
        }
      }
    }
    return getHello1Method;
  }

  private static volatile io.grpc.MethodDescriptor<com.suns.HelloProto.HelloRequest,
      com.suns.HelloProto.HelloResponse> getC2ssMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "c2ss",
      requestType = com.suns.HelloProto.HelloRequest.class,
      responseType = com.suns.HelloProto.HelloResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.suns.HelloProto.HelloRequest,
      com.suns.HelloProto.HelloResponse> getC2ssMethod() {
    io.grpc.MethodDescriptor<com.suns.HelloProto.HelloRequest, com.suns.HelloProto.HelloResponse> getC2ssMethod;
    if ((getC2ssMethod = HelloServiceGrpc.getC2ssMethod) == null) {
      synchronized (HelloServiceGrpc.class) {
        if ((getC2ssMethod = HelloServiceGrpc.getC2ssMethod) == null) {
          HelloServiceGrpc.getC2ssMethod = getC2ssMethod =
              io.grpc.MethodDescriptor.<com.suns.HelloProto.HelloRequest, com.suns.HelloProto.HelloResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "c2ss"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.suns.HelloProto.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.suns.HelloProto.HelloResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HelloServiceMethodDescriptorSupplier("c2ss"))
              .build();
        }
      }
    }
    return getC2ssMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.suns.HelloProto.HelloRequest,
      com.suns.HelloProto.HelloResponse> getCs2sMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "cs2s",
      requestType = com.suns.HelloProto.HelloRequest.class,
      responseType = com.suns.HelloProto.HelloResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.suns.HelloProto.HelloRequest,
      com.suns.HelloProto.HelloResponse> getCs2sMethod() {
    io.grpc.MethodDescriptor<com.suns.HelloProto.HelloRequest, com.suns.HelloProto.HelloResponse> getCs2sMethod;
    if ((getCs2sMethod = HelloServiceGrpc.getCs2sMethod) == null) {
      synchronized (HelloServiceGrpc.class) {
        if ((getCs2sMethod = HelloServiceGrpc.getCs2sMethod) == null) {
          HelloServiceGrpc.getCs2sMethod = getCs2sMethod =
              io.grpc.MethodDescriptor.<com.suns.HelloProto.HelloRequest, com.suns.HelloProto.HelloResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "cs2s"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.suns.HelloProto.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.suns.HelloProto.HelloResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HelloServiceMethodDescriptorSupplier("cs2s"))
              .build();
        }
      }
    }
    return getCs2sMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.suns.HelloProto.HelloRequest,
      com.suns.HelloProto.HelloResponse> getAllStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "allStream",
      requestType = com.suns.HelloProto.HelloRequest.class,
      responseType = com.suns.HelloProto.HelloResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.suns.HelloProto.HelloRequest,
      com.suns.HelloProto.HelloResponse> getAllStreamMethod() {
    io.grpc.MethodDescriptor<com.suns.HelloProto.HelloRequest, com.suns.HelloProto.HelloResponse> getAllStreamMethod;
    if ((getAllStreamMethod = HelloServiceGrpc.getAllStreamMethod) == null) {
      synchronized (HelloServiceGrpc.class) {
        if ((getAllStreamMethod = HelloServiceGrpc.getAllStreamMethod) == null) {
          HelloServiceGrpc.getAllStreamMethod = getAllStreamMethod =
              io.grpc.MethodDescriptor.<com.suns.HelloProto.HelloRequest, com.suns.HelloProto.HelloResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "allStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.suns.HelloProto.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.suns.HelloProto.HelloResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HelloServiceMethodDescriptorSupplier("allStream"))
              .build();
        }
      }
    }
    return getAllStreamMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HelloServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HelloServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HelloServiceStub>() {
        @java.lang.Override
        public HelloServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HelloServiceStub(channel, callOptions);
        }
      };
    return HelloServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HelloServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HelloServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HelloServiceBlockingStub>() {
        @java.lang.Override
        public HelloServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HelloServiceBlockingStub(channel, callOptions);
        }
      };
    return HelloServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HelloServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HelloServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HelloServiceFutureStub>() {
        @java.lang.Override
        public HelloServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HelloServiceFutureStub(channel, callOptions);
        }
      };
    return HelloServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class HelloServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void hello(com.suns.HelloProto.HelloRequest request,
        io.grpc.stub.StreamObserver<com.suns.HelloProto.HelloResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHelloMethod(), responseObserver);
    }

    /**
     */
    public void hello1(com.suns.HelloProto.HelloRequest1 request,
        io.grpc.stub.StreamObserver<com.suns.HelloProto.HelloResponse1> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHello1Method(), responseObserver);
    }

    /**
     */
    public void c2ss(com.suns.HelloProto.HelloRequest request,
        io.grpc.stub.StreamObserver<com.suns.HelloProto.HelloResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getC2ssMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.suns.HelloProto.HelloRequest> cs2s(
        io.grpc.stub.StreamObserver<com.suns.HelloProto.HelloResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getCs2sMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.suns.HelloProto.HelloRequest> allStream(
        io.grpc.stub.StreamObserver<com.suns.HelloProto.HelloResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getAllStreamMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getHelloMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.suns.HelloProto.HelloRequest,
                com.suns.HelloProto.HelloResponse>(
                  this, METHODID_HELLO)))
          .addMethod(
            getHello1Method(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.suns.HelloProto.HelloRequest1,
                com.suns.HelloProto.HelloResponse1>(
                  this, METHODID_HELLO1)))
          .addMethod(
            getC2ssMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.suns.HelloProto.HelloRequest,
                com.suns.HelloProto.HelloResponse>(
                  this, METHODID_C2SS)))
          .addMethod(
            getCs2sMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                com.suns.HelloProto.HelloRequest,
                com.suns.HelloProto.HelloResponse>(
                  this, METHODID_CS2S)))
          .addMethod(
            getAllStreamMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                com.suns.HelloProto.HelloRequest,
                com.suns.HelloProto.HelloResponse>(
                  this, METHODID_ALL_STREAM)))
          .build();
    }
  }

  /**
   */
  public static final class HelloServiceStub extends io.grpc.stub.AbstractAsyncStub<HelloServiceStub> {
    private HelloServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HelloServiceStub(channel, callOptions);
    }

    /**
     */
    public void hello(com.suns.HelloProto.HelloRequest request,
        io.grpc.stub.StreamObserver<com.suns.HelloProto.HelloResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHelloMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void hello1(com.suns.HelloProto.HelloRequest1 request,
        io.grpc.stub.StreamObserver<com.suns.HelloProto.HelloResponse1> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHello1Method(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void c2ss(com.suns.HelloProto.HelloRequest request,
        io.grpc.stub.StreamObserver<com.suns.HelloProto.HelloResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getC2ssMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.suns.HelloProto.HelloRequest> cs2s(
        io.grpc.stub.StreamObserver<com.suns.HelloProto.HelloResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getCs2sMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.suns.HelloProto.HelloRequest> allStream(
        io.grpc.stub.StreamObserver<com.suns.HelloProto.HelloResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getAllStreamMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class HelloServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<HelloServiceBlockingStub> {
    private HelloServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HelloServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.suns.HelloProto.HelloResponse hello(com.suns.HelloProto.HelloRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHelloMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.suns.HelloProto.HelloResponse1 hello1(com.suns.HelloProto.HelloRequest1 request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHello1Method(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.suns.HelloProto.HelloResponse> c2ss(
        com.suns.HelloProto.HelloRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getC2ssMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class HelloServiceFutureStub extends io.grpc.stub.AbstractFutureStub<HelloServiceFutureStub> {
    private HelloServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HelloServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.suns.HelloProto.HelloResponse> hello(
        com.suns.HelloProto.HelloRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHelloMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.suns.HelloProto.HelloResponse1> hello1(
        com.suns.HelloProto.HelloRequest1 request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHello1Method(), getCallOptions()), request);
    }
  }

  private static final int METHODID_HELLO = 0;
  private static final int METHODID_HELLO1 = 1;
  private static final int METHODID_C2SS = 2;
  private static final int METHODID_CS2S = 3;
  private static final int METHODID_ALL_STREAM = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HelloServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HelloServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_HELLO:
          serviceImpl.hello((com.suns.HelloProto.HelloRequest) request,
              (io.grpc.stub.StreamObserver<com.suns.HelloProto.HelloResponse>) responseObserver);
          break;
        case METHODID_HELLO1:
          serviceImpl.hello1((com.suns.HelloProto.HelloRequest1) request,
              (io.grpc.stub.StreamObserver<com.suns.HelloProto.HelloResponse1>) responseObserver);
          break;
        case METHODID_C2SS:
          serviceImpl.c2ss((com.suns.HelloProto.HelloRequest) request,
              (io.grpc.stub.StreamObserver<com.suns.HelloProto.HelloResponse>) responseObserver);
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
        case METHODID_CS2S:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.cs2s(
              (io.grpc.stub.StreamObserver<com.suns.HelloProto.HelloResponse>) responseObserver);
        case METHODID_ALL_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.allStream(
              (io.grpc.stub.StreamObserver<com.suns.HelloProto.HelloResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class HelloServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HelloServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.suns.HelloProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HelloService");
    }
  }

  private static final class HelloServiceFileDescriptorSupplier
      extends HelloServiceBaseDescriptorSupplier {
    HelloServiceFileDescriptorSupplier() {}
  }

  private static final class HelloServiceMethodDescriptorSupplier
      extends HelloServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HelloServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (HelloServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HelloServiceFileDescriptorSupplier())
              .addMethod(getHelloMethod())
              .addMethod(getHello1Method())
              .addMethod(getC2ssMethod())
              .addMethod(getCs2sMethod())
              .addMethod(getAllStreamMethod())
              .build();
        }
      }
    }
    return result;
  }
}
