package cuteboot.grpcbridge;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import java.net.InetSocketAddress;
import java.util.List;
import java.util.concurrent.TimeUnit;

import io.grpc.Server;
import io.grpc.netty.NettyServerBuilder;

public class BridgeService extends Service {
    public Server             server;
    public NettyServerBuilder builder;

    private static final String TAG = "GrpcBridgeService";

    private static final String SERVER_ADDR = "127.0.0.1";
    private static final int    SERVER_PORT = 9600;

    private List<IGrpcBridgeModule> modules;

    @Override
    public IBinder onBind(Intent intent) { return null; }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "onCreate()");

        try {
            Log.d(TAG, "Constructing service builder.");
            builder = NettyServerBuilder.forAddress(new InetSocketAddress(SERVER_ADDR, SERVER_PORT));

            Log.d(TAG, "Registering service modules.");
            modules.add(new BatteryManagerModule().init(this));

            Log.d(TAG, "Building and starting gRPC service.");
            server = builder.build().start();
        } catch (Exception e) {
            Log.d(TAG, "Exception: " + e.getMessage());
        }

    }

    @Override
    public void onDestroy() {
        Log.d(TAG, "onDestroy()");

        if(server != null) {
            Log.d(TAG, "Shutting down gRPC channel.");
            server.shutdown();
        }
    }
}

