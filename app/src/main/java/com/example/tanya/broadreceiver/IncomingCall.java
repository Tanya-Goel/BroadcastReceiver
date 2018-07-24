package com.example.tanya.broadreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class IncomingCall extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Incoming Call detected", Toast.LENGTH_SHORT).show();
        Log.i("Myapp","Incoming call detected");
    }
}
