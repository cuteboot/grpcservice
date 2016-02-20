package cuteboot.grpcbridge;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class BroadcastReceiver extends android.content.BroadcastReceiver {
    private static final String TAG = "GrpcBridgeService";

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d(TAG, "onReceive()");
        context.startService(new Intent(context, BridgeService.class));
    }
}
