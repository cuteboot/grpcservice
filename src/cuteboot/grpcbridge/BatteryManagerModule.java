package cuteboot.grpcbridge;

import java.lang.*;

import android.os.Context;

public class BatteryManagerModule implements IGrpcBridgeModule, BatteryManagerGrpc.BatteryManager {
    private android.os.BatteryManager mService;

    public IGrpcBridgeModule init(BridgeService service) {
        mService = (android.os.BatteryManager)service.getSystemService(Context.BATTERY_SERVICE);

        service.builder.addService(BatteryManagerGrpc.bindService(this));

        return this;
    }

    public void getProperty(BatteryManagerProtos.GetPropertyRequest request,
        io.grpc.stub.StreamObserver<BatteryManagerProtos.GetPropertyResponse> responseObserver)
    {
        BatteryManagerProtos.GetPropertyResponse response =
            BatteryManagerProtos.GetPropertyResponse.newBuilder()
                .setValue(mService.getIntProperty(request.getId()))
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
};
