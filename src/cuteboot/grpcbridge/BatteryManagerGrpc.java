package cuteboot.grpcbridge;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;

@javax.annotation.Generated("by gRPC proto compiler")
public class BatteryManagerGrpc {

  private BatteryManagerGrpc() {}

  public static final String SERVICE_NAME = "grpcbridge.BatteryManager";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<cuteboot.grpcbridge.BatteryManagerProtos.GetPropertyRequest,
      cuteboot.grpcbridge.BatteryManagerProtos.GetPropertyResponse> METHOD_GET_PROPERTY =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "grpcbridge.BatteryManager", "GetProperty"),
          io.grpc.protobuf.ProtoUtils.marshaller(cuteboot.grpcbridge.BatteryManagerProtos.GetPropertyRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(cuteboot.grpcbridge.BatteryManagerProtos.GetPropertyResponse.getDefaultInstance()));

  public static BatteryManagerStub newStub(io.grpc.Channel channel) {
    return new BatteryManagerStub(channel);
  }

  public static BatteryManagerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new BatteryManagerBlockingStub(channel);
  }

  public static BatteryManagerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new BatteryManagerFutureStub(channel);
  }

  public static interface BatteryManager {

    public void getProperty(cuteboot.grpcbridge.BatteryManagerProtos.GetPropertyRequest request,
        io.grpc.stub.StreamObserver<cuteboot.grpcbridge.BatteryManagerProtos.GetPropertyResponse> responseObserver);
  }

  public static interface BatteryManagerBlockingClient {

    public cuteboot.grpcbridge.BatteryManagerProtos.GetPropertyResponse getProperty(cuteboot.grpcbridge.BatteryManagerProtos.GetPropertyRequest request);
  }

  public static interface BatteryManagerFutureClient {

    public com.google.common.util.concurrent.ListenableFuture<cuteboot.grpcbridge.BatteryManagerProtos.GetPropertyResponse> getProperty(
        cuteboot.grpcbridge.BatteryManagerProtos.GetPropertyRequest request);
  }

  public static class BatteryManagerStub extends io.grpc.stub.AbstractStub<BatteryManagerStub>
      implements BatteryManager {
    private BatteryManagerStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BatteryManagerStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BatteryManagerStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BatteryManagerStub(channel, callOptions);
    }

    @java.lang.Override
    public void getProperty(cuteboot.grpcbridge.BatteryManagerProtos.GetPropertyRequest request,
        io.grpc.stub.StreamObserver<cuteboot.grpcbridge.BatteryManagerProtos.GetPropertyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_PROPERTY, getCallOptions()), request, responseObserver);
    }
  }

  public static class BatteryManagerBlockingStub extends io.grpc.stub.AbstractStub<BatteryManagerBlockingStub>
      implements BatteryManagerBlockingClient {
    private BatteryManagerBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BatteryManagerBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BatteryManagerBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BatteryManagerBlockingStub(channel, callOptions);
    }

    @java.lang.Override
    public cuteboot.grpcbridge.BatteryManagerProtos.GetPropertyResponse getProperty(cuteboot.grpcbridge.BatteryManagerProtos.GetPropertyRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_PROPERTY, getCallOptions(), request);
    }
  }

  public static class BatteryManagerFutureStub extends io.grpc.stub.AbstractStub<BatteryManagerFutureStub>
      implements BatteryManagerFutureClient {
    private BatteryManagerFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BatteryManagerFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BatteryManagerFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BatteryManagerFutureStub(channel, callOptions);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<cuteboot.grpcbridge.BatteryManagerProtos.GetPropertyResponse> getProperty(
        cuteboot.grpcbridge.BatteryManagerProtos.GetPropertyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_PROPERTY, getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_PROPERTY = 0;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BatteryManager serviceImpl;
    private final int methodId;

    public MethodHandlers(BatteryManager serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_PROPERTY:
          serviceImpl.getProperty((cuteboot.grpcbridge.BatteryManagerProtos.GetPropertyRequest) request,
              (io.grpc.stub.StreamObserver<cuteboot.grpcbridge.BatteryManagerProtos.GetPropertyResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static io.grpc.ServerServiceDefinition bindService(
      final BatteryManager serviceImpl) {
    return io.grpc.ServerServiceDefinition.builder(SERVICE_NAME)
        .addMethod(
          METHOD_GET_PROPERTY,
          asyncUnaryCall(
            new MethodHandlers<
              cuteboot.grpcbridge.BatteryManagerProtos.GetPropertyRequest,
              cuteboot.grpcbridge.BatteryManagerProtos.GetPropertyResponse>(
                serviceImpl, METHODID_GET_PROPERTY)))
        .build();
  }
}
