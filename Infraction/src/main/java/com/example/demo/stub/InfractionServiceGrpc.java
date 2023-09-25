package com.example.demo.stub;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: InfractionService.proto")
public final class InfractionServiceGrpc {

  private InfractionServiceGrpc() {}

  public static final String SERVICE_NAME = "com.example.demo.stub.InfractionService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.demo.stub.InfractionServiceOuterClass.GetAllInfractionsRequest,
      com.example.demo.stub.InfractionServiceOuterClass.GetInfractionsResponse> getGetAllInfractionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllInfraction",
      requestType = com.example.demo.stub.InfractionServiceOuterClass.GetAllInfractionsRequest.class,
      responseType = com.example.demo.stub.InfractionServiceOuterClass.GetInfractionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.demo.stub.InfractionServiceOuterClass.GetAllInfractionsRequest,
      com.example.demo.stub.InfractionServiceOuterClass.GetInfractionsResponse> getGetAllInfractionMethod() {
    io.grpc.MethodDescriptor<com.example.demo.stub.InfractionServiceOuterClass.GetAllInfractionsRequest, com.example.demo.stub.InfractionServiceOuterClass.GetInfractionsResponse> getGetAllInfractionMethod;
    if ((getGetAllInfractionMethod = InfractionServiceGrpc.getGetAllInfractionMethod) == null) {
      synchronized (InfractionServiceGrpc.class) {
        if ((getGetAllInfractionMethod = InfractionServiceGrpc.getGetAllInfractionMethod) == null) {
          InfractionServiceGrpc.getGetAllInfractionMethod = getGetAllInfractionMethod = 
              io.grpc.MethodDescriptor.<com.example.demo.stub.InfractionServiceOuterClass.GetAllInfractionsRequest, com.example.demo.stub.InfractionServiceOuterClass.GetInfractionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.example.demo.stub.InfractionService", "GetAllInfraction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.demo.stub.InfractionServiceOuterClass.GetAllInfractionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.demo.stub.InfractionServiceOuterClass.GetInfractionsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new InfractionServiceMethodDescriptorSupplier("GetAllInfraction"))
                  .build();
          }
        }
     }
     return getGetAllInfractionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.demo.stub.InfractionServiceOuterClass.GetInfractionByIdRequest,
      com.example.demo.stub.InfractionServiceOuterClass.GetInfractionByIdResponse> getGetInfractionByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetInfractionById",
      requestType = com.example.demo.stub.InfractionServiceOuterClass.GetInfractionByIdRequest.class,
      responseType = com.example.demo.stub.InfractionServiceOuterClass.GetInfractionByIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.demo.stub.InfractionServiceOuterClass.GetInfractionByIdRequest,
      com.example.demo.stub.InfractionServiceOuterClass.GetInfractionByIdResponse> getGetInfractionByIdMethod() {
    io.grpc.MethodDescriptor<com.example.demo.stub.InfractionServiceOuterClass.GetInfractionByIdRequest, com.example.demo.stub.InfractionServiceOuterClass.GetInfractionByIdResponse> getGetInfractionByIdMethod;
    if ((getGetInfractionByIdMethod = InfractionServiceGrpc.getGetInfractionByIdMethod) == null) {
      synchronized (InfractionServiceGrpc.class) {
        if ((getGetInfractionByIdMethod = InfractionServiceGrpc.getGetInfractionByIdMethod) == null) {
          InfractionServiceGrpc.getGetInfractionByIdMethod = getGetInfractionByIdMethod = 
              io.grpc.MethodDescriptor.<com.example.demo.stub.InfractionServiceOuterClass.GetInfractionByIdRequest, com.example.demo.stub.InfractionServiceOuterClass.GetInfractionByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.example.demo.stub.InfractionService", "GetInfractionById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.demo.stub.InfractionServiceOuterClass.GetInfractionByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.demo.stub.InfractionServiceOuterClass.GetInfractionByIdResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new InfractionServiceMethodDescriptorSupplier("GetInfractionById"))
                  .build();
          }
        }
     }
     return getGetInfractionByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.demo.stub.InfractionServiceOuterClass.SaveInfractionRequest,
      com.example.demo.stub.InfractionServiceOuterClass.SaveInfractionResponse> getSaveInfractionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SaveInfraction",
      requestType = com.example.demo.stub.InfractionServiceOuterClass.SaveInfractionRequest.class,
      responseType = com.example.demo.stub.InfractionServiceOuterClass.SaveInfractionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.demo.stub.InfractionServiceOuterClass.SaveInfractionRequest,
      com.example.demo.stub.InfractionServiceOuterClass.SaveInfractionResponse> getSaveInfractionMethod() {
    io.grpc.MethodDescriptor<com.example.demo.stub.InfractionServiceOuterClass.SaveInfractionRequest, com.example.demo.stub.InfractionServiceOuterClass.SaveInfractionResponse> getSaveInfractionMethod;
    if ((getSaveInfractionMethod = InfractionServiceGrpc.getSaveInfractionMethod) == null) {
      synchronized (InfractionServiceGrpc.class) {
        if ((getSaveInfractionMethod = InfractionServiceGrpc.getSaveInfractionMethod) == null) {
          InfractionServiceGrpc.getSaveInfractionMethod = getSaveInfractionMethod = 
              io.grpc.MethodDescriptor.<com.example.demo.stub.InfractionServiceOuterClass.SaveInfractionRequest, com.example.demo.stub.InfractionServiceOuterClass.SaveInfractionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.example.demo.stub.InfractionService", "SaveInfraction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.demo.stub.InfractionServiceOuterClass.SaveInfractionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.demo.stub.InfractionServiceOuterClass.SaveInfractionResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new InfractionServiceMethodDescriptorSupplier("SaveInfraction"))
                  .build();
          }
        }
     }
     return getSaveInfractionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static InfractionServiceStub newStub(io.grpc.Channel channel) {
    return new InfractionServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static InfractionServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new InfractionServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static InfractionServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new InfractionServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class InfractionServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getAllInfraction(com.example.demo.stub.InfractionServiceOuterClass.GetAllInfractionsRequest request,
        io.grpc.stub.StreamObserver<com.example.demo.stub.InfractionServiceOuterClass.GetInfractionsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllInfractionMethod(), responseObserver);
    }

    /**
     */
    public void getInfractionById(com.example.demo.stub.InfractionServiceOuterClass.GetInfractionByIdRequest request,
        io.grpc.stub.StreamObserver<com.example.demo.stub.InfractionServiceOuterClass.GetInfractionByIdResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetInfractionByIdMethod(), responseObserver);
    }

    /**
     */
    public void saveInfraction(com.example.demo.stub.InfractionServiceOuterClass.SaveInfractionRequest request,
        io.grpc.stub.StreamObserver<com.example.demo.stub.InfractionServiceOuterClass.SaveInfractionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveInfractionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAllInfractionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.demo.stub.InfractionServiceOuterClass.GetAllInfractionsRequest,
                com.example.demo.stub.InfractionServiceOuterClass.GetInfractionsResponse>(
                  this, METHODID_GET_ALL_INFRACTION)))
          .addMethod(
            getGetInfractionByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.demo.stub.InfractionServiceOuterClass.GetInfractionByIdRequest,
                com.example.demo.stub.InfractionServiceOuterClass.GetInfractionByIdResponse>(
                  this, METHODID_GET_INFRACTION_BY_ID)))
          .addMethod(
            getSaveInfractionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.demo.stub.InfractionServiceOuterClass.SaveInfractionRequest,
                com.example.demo.stub.InfractionServiceOuterClass.SaveInfractionResponse>(
                  this, METHODID_SAVE_INFRACTION)))
          .build();
    }
  }

  /**
   */
  public static final class InfractionServiceStub extends io.grpc.stub.AbstractStub<InfractionServiceStub> {
    private InfractionServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private InfractionServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InfractionServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InfractionServiceStub(channel, callOptions);
    }

    /**
     */
    public void getAllInfraction(com.example.demo.stub.InfractionServiceOuterClass.GetAllInfractionsRequest request,
        io.grpc.stub.StreamObserver<com.example.demo.stub.InfractionServiceOuterClass.GetInfractionsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllInfractionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getInfractionById(com.example.demo.stub.InfractionServiceOuterClass.GetInfractionByIdRequest request,
        io.grpc.stub.StreamObserver<com.example.demo.stub.InfractionServiceOuterClass.GetInfractionByIdResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetInfractionByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveInfraction(com.example.demo.stub.InfractionServiceOuterClass.SaveInfractionRequest request,
        io.grpc.stub.StreamObserver<com.example.demo.stub.InfractionServiceOuterClass.SaveInfractionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveInfractionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class InfractionServiceBlockingStub extends io.grpc.stub.AbstractStub<InfractionServiceBlockingStub> {
    private InfractionServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private InfractionServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InfractionServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InfractionServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.demo.stub.InfractionServiceOuterClass.GetInfractionsResponse getAllInfraction(com.example.demo.stub.InfractionServiceOuterClass.GetAllInfractionsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAllInfractionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.demo.stub.InfractionServiceOuterClass.GetInfractionByIdResponse getInfractionById(com.example.demo.stub.InfractionServiceOuterClass.GetInfractionByIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetInfractionByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.demo.stub.InfractionServiceOuterClass.SaveInfractionResponse saveInfraction(com.example.demo.stub.InfractionServiceOuterClass.SaveInfractionRequest request) {
      return blockingUnaryCall(
          getChannel(), getSaveInfractionMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class InfractionServiceFutureStub extends io.grpc.stub.AbstractStub<InfractionServiceFutureStub> {
    private InfractionServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private InfractionServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InfractionServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InfractionServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.demo.stub.InfractionServiceOuterClass.GetInfractionsResponse> getAllInfraction(
        com.example.demo.stub.InfractionServiceOuterClass.GetAllInfractionsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllInfractionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.demo.stub.InfractionServiceOuterClass.GetInfractionByIdResponse> getInfractionById(
        com.example.demo.stub.InfractionServiceOuterClass.GetInfractionByIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetInfractionByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.demo.stub.InfractionServiceOuterClass.SaveInfractionResponse> saveInfraction(
        com.example.demo.stub.InfractionServiceOuterClass.SaveInfractionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveInfractionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ALL_INFRACTION = 0;
  private static final int METHODID_GET_INFRACTION_BY_ID = 1;
  private static final int METHODID_SAVE_INFRACTION = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final InfractionServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(InfractionServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ALL_INFRACTION:
          serviceImpl.getAllInfraction((com.example.demo.stub.InfractionServiceOuterClass.GetAllInfractionsRequest) request,
              (io.grpc.stub.StreamObserver<com.example.demo.stub.InfractionServiceOuterClass.GetInfractionsResponse>) responseObserver);
          break;
        case METHODID_GET_INFRACTION_BY_ID:
          serviceImpl.getInfractionById((com.example.demo.stub.InfractionServiceOuterClass.GetInfractionByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.example.demo.stub.InfractionServiceOuterClass.GetInfractionByIdResponse>) responseObserver);
          break;
        case METHODID_SAVE_INFRACTION:
          serviceImpl.saveInfraction((com.example.demo.stub.InfractionServiceOuterClass.SaveInfractionRequest) request,
              (io.grpc.stub.StreamObserver<com.example.demo.stub.InfractionServiceOuterClass.SaveInfractionResponse>) responseObserver);
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

  private static abstract class InfractionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    InfractionServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.demo.stub.InfractionServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("InfractionService");
    }
  }

  private static final class InfractionServiceFileDescriptorSupplier
      extends InfractionServiceBaseDescriptorSupplier {
    InfractionServiceFileDescriptorSupplier() {}
  }

  private static final class InfractionServiceMethodDescriptorSupplier
      extends InfractionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    InfractionServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (InfractionServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new InfractionServiceFileDescriptorSupplier())
              .addMethod(getGetAllInfractionMethod())
              .addMethod(getGetInfractionByIdMethod())
              .addMethod(getSaveInfractionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
