package com.example.tanya.broadreceiver;

import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Test call = new Test();
        IntentFilter filter = new IntentFilter();
        filter.addAction("com.example.tanya.broadreceiver.XYZABBDSD");
        registerReceiver(call,filter);
        findViewById(R.id.some_action).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                some_action(view);
            }
        });
    }

    void some_action(View v)
    {
        Intent i = new Intent();
        i.setAction("com.example.tanya.broadreceiver.XYZABBDSD");
        sendBroadcast(i);
    }
}
