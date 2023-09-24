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
    comments = "Source: RadarService.proto")
public final class RadarServiceGrpc {

  private RadarServiceGrpc() {}

  public static final String SERVICE_NAME = "com.example.demo.stub.RadarService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.demo.stub.RadarServiceOuterClass.GetAllRadarsRequest,
      com.example.demo.stub.RadarServiceOuterClass.GetRadarsResponse> getGetAllRadarsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllRadars",
      requestType = com.example.demo.stub.RadarServiceOuterClass.GetAllRadarsRequest.class,
      responseType = com.example.demo.stub.RadarServiceOuterClass.GetRadarsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.demo.stub.RadarServiceOuterClass.GetAllRadarsRequest,
      com.example.demo.stub.RadarServiceOuterClass.GetRadarsResponse> getGetAllRadarsMethod() {
    io.grpc.MethodDescriptor<com.example.demo.stub.RadarServiceOuterClass.GetAllRadarsRequest, com.example.demo.stub.RadarServiceOuterClass.GetRadarsResponse> getGetAllRadarsMethod;
    if ((getGetAllRadarsMethod = RadarServiceGrpc.getGetAllRadarsMethod) == null) {
      synchronized (RadarServiceGrpc.class) {
        if ((getGetAllRadarsMethod = RadarServiceGrpc.getGetAllRadarsMethod) == null) {
          RadarServiceGrpc.getGetAllRadarsMethod = getGetAllRadarsMethod = 
              io.grpc.MethodDescriptor.<com.example.demo.stub.RadarServiceOuterClass.GetAllRadarsRequest, com.example.demo.stub.RadarServiceOuterClass.GetRadarsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.example.demo.stub.RadarService", "GetAllRadars"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.demo.stub.RadarServiceOuterClass.GetAllRadarsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.demo.stub.RadarServiceOuterClass.GetRadarsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RadarServiceMethodDescriptorSupplier("GetAllRadars"))
                  .build();
          }
        }
     }
     return getGetAllRadarsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.demo.stub.RadarServiceOuterClass.GetRadarByIdRequest,
      com.example.demo.stub.RadarServiceOuterClass.GetRadarByIdResponse> getGetRadarByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRadarById",
      requestType = com.example.demo.stub.RadarServiceOuterClass.GetRadarByIdRequest.class,
      responseType = com.example.demo.stub.RadarServiceOuterClass.GetRadarByIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.demo.stub.RadarServiceOuterClass.GetRadarByIdRequest,
      com.example.demo.stub.RadarServiceOuterClass.GetRadarByIdResponse> getGetRadarByIdMethod() {
    io.grpc.MethodDescriptor<com.example.demo.stub.RadarServiceOuterClass.GetRadarByIdRequest, com.example.demo.stub.RadarServiceOuterClass.GetRadarByIdResponse> getGetRadarByIdMethod;
    if ((getGetRadarByIdMethod = RadarServiceGrpc.getGetRadarByIdMethod) == null) {
      synchronized (RadarServiceGrpc.class) {
        if ((getGetRadarByIdMethod = RadarServiceGrpc.getGetRadarByIdMethod) == null) {
          RadarServiceGrpc.getGetRadarByIdMethod = getGetRadarByIdMethod = 
              io.grpc.MethodDescriptor.<com.example.demo.stub.RadarServiceOuterClass.GetRadarByIdRequest, com.example.demo.stub.RadarServiceOuterClass.GetRadarByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.example.demo.stub.RadarService", "GetRadarById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.demo.stub.RadarServiceOuterClass.GetRadarByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.demo.stub.RadarServiceOuterClass.GetRadarByIdResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RadarServiceMethodDescriptorSupplier("GetRadarById"))
                  .build();
          }
        }
     }
     return getGetRadarByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.demo.stub.RadarServiceOuterClass.SaveRadarRequest,
      com.example.demo.stub.RadarServiceOuterClass.SaveRadarResponse> getSaveRadarMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SaveRadar",
      requestType = com.example.demo.stub.RadarServiceOuterClass.SaveRadarRequest.class,
      responseType = com.example.demo.stub.RadarServiceOuterClass.SaveRadarResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.demo.stub.RadarServiceOuterClass.SaveRadarRequest,
      com.example.demo.stub.RadarServiceOuterClass.SaveRadarResponse> getSaveRadarMethod() {
    io.grpc.MethodDescriptor<com.example.demo.stub.RadarServiceOuterClass.SaveRadarRequest, com.example.demo.stub.RadarServiceOuterClass.SaveRadarResponse> getSaveRadarMethod;
    if ((getSaveRadarMethod = RadarServiceGrpc.getSaveRadarMethod) == null) {
      synchronized (RadarServiceGrpc.class) {
        if ((getSaveRadarMethod = RadarServiceGrpc.getSaveRadarMethod) == null) {
          RadarServiceGrpc.getSaveRadarMethod = getSaveRadarMethod = 
              io.grpc.MethodDescriptor.<com.example.demo.stub.RadarServiceOuterClass.SaveRadarRequest, com.example.demo.stub.RadarServiceOuterClass.SaveRadarResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.example.demo.stub.RadarService", "SaveRadar"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.demo.stub.RadarServiceOuterClass.SaveRadarRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.demo.stub.RadarServiceOuterClass.SaveRadarResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RadarServiceMethodDescriptorSupplier("SaveRadar"))
                  .build();
          }
        }
     }
     return getSaveRadarMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RadarServiceStub newStub(io.grpc.Channel channel) {
    return new RadarServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RadarServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new RadarServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RadarServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new RadarServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class RadarServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getAllRadars(com.example.demo.stub.RadarServiceOuterClass.GetAllRadarsRequest request,
        io.grpc.stub.StreamObserver<com.example.demo.stub.RadarServiceOuterClass.GetRadarsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllRadarsMethod(), responseObserver);
    }

    /**
     */
    public void getRadarById(com.example.demo.stub.RadarServiceOuterClass.GetRadarByIdRequest request,
        io.grpc.stub.StreamObserver<com.example.demo.stub.RadarServiceOuterClass.GetRadarByIdResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetRadarByIdMethod(), responseObserver);
    }

    /**
     */
    public void saveRadar(com.example.demo.stub.RadarServiceOuterClass.SaveRadarRequest request,
        io.grpc.stub.StreamObserver<com.example.demo.stub.RadarServiceOuterClass.SaveRadarResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveRadarMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAllRadarsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.demo.stub.RadarServiceOuterClass.GetAllRadarsRequest,
                com.example.demo.stub.RadarServiceOuterClass.GetRadarsResponse>(
                  this, METHODID_GET_ALL_RADARS)))
          .addMethod(
            getGetRadarByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.demo.stub.RadarServiceOuterClass.GetRadarByIdRequest,
                com.example.demo.stub.RadarServiceOuterClass.GetRadarByIdResponse>(
                  this, METHODID_GET_RADAR_BY_ID)))
          .addMethod(
            getSaveRadarMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.demo.stub.RadarServiceOuterClass.SaveRadarRequest,
                com.example.demo.stub.RadarServiceOuterClass.SaveRadarResponse>(
                  this, METHODID_SAVE_RADAR)))
          .build();
    }
  }

  /**
   */
  public static final class RadarServiceStub extends io.grpc.stub.AbstractStub<RadarServiceStub> {
    private RadarServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RadarServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RadarServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RadarServiceStub(channel, callOptions);
    }

    /**
     */
    public void getAllRadars(com.example.demo.stub.RadarServiceOuterClass.GetAllRadarsRequest request,
        io.grpc.stub.StreamObserver<com.example.demo.stub.RadarServiceOuterClass.GetRadarsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllRadarsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getRadarById(com.example.demo.stub.RadarServiceOuterClass.GetRadarByIdRequest request,
        io.grpc.stub.StreamObserver<com.example.demo.stub.RadarServiceOuterClass.GetRadarByIdResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetRadarByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveRadar(com.example.demo.stub.RadarServiceOuterClass.SaveRadarRequest request,
        io.grpc.stub.StreamObserver<com.example.demo.stub.RadarServiceOuterClass.SaveRadarResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveRadarMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class RadarServiceBlockingStub extends io.grpc.stub.AbstractStub<RadarServiceBlockingStub> {
    private RadarServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RadarServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RadarServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RadarServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.demo.stub.RadarServiceOuterClass.GetRadarsResponse getAllRadars(com.example.demo.stub.RadarServiceOuterClass.GetAllRadarsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAllRadarsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.demo.stub.RadarServiceOuterClass.GetRadarByIdResponse getRadarById(com.example.demo.stub.RadarServiceOuterClass.GetRadarByIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetRadarByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.demo.stub.RadarServiceOuterClass.SaveRadarResponse saveRadar(com.example.demo.stub.RadarServiceOuterClass.SaveRadarRequest request) {
      return blockingUnaryCall(
          getChannel(), getSaveRadarMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class RadarServiceFutureStub extends io.grpc.stub.AbstractStub<RadarServiceFutureStub> {
    private RadarServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RadarServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RadarServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RadarServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.demo.stub.RadarServiceOuterClass.GetRadarsResponse> getAllRadars(
        com.example.demo.stub.RadarServiceOuterClass.GetAllRadarsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllRadarsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.demo.stub.RadarServiceOuterClass.GetRadarByIdResponse> getRadarById(
        com.example.demo.stub.RadarServiceOuterClass.GetRadarByIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetRadarByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.demo.stub.RadarServiceOuterClass.SaveRadarResponse> saveRadar(
        com.example.demo.stub.RadarServiceOuterClass.SaveRadarRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveRadarMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ALL_RADARS = 0;
  private static final int METHODID_GET_RADAR_BY_ID = 1;
  private static final int METHODID_SAVE_RADAR = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RadarServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RadarServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ALL_RADARS:
          serviceImpl.getAllRadars((com.example.demo.stub.RadarServiceOuterClass.GetAllRadarsRequest) request,
              (io.grpc.stub.StreamObserver<com.example.demo.stub.RadarServiceOuterClass.GetRadarsResponse>) responseObserver);
          break;
        case METHODID_GET_RADAR_BY_ID:
          serviceImpl.getRadarById((com.example.demo.stub.RadarServiceOuterClass.GetRadarByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.example.demo.stub.RadarServiceOuterClass.GetRadarByIdResponse>) responseObserver);
          break;
        case METHODID_SAVE_RADAR:
          serviceImpl.saveRadar((com.example.demo.stub.RadarServiceOuterClass.SaveRadarRequest) request,
              (io.grpc.stub.StreamObserver<com.example.demo.stub.RadarServiceOuterClass.SaveRadarResponse>) responseObserver);
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

  private static abstract class RadarServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RadarServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.demo.stub.RadarServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RadarService");
    }
  }

  private static final class RadarServiceFileDescriptorSupplier
      extends RadarServiceBaseDescriptorSupplier {
    RadarServiceFileDescriptorSupplier() {}
  }

  private static final class RadarServiceMethodDescriptorSupplier
      extends RadarServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RadarServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (RadarServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RadarServiceFileDescriptorSupplier())
              .addMethod(getGetAllRadarsMethod())
              .addMethod(getGetRadarByIdMethod())
              .addMethod(getSaveRadarMethod())
              .build();
        }
      }
    }
    return result;
  }
}
