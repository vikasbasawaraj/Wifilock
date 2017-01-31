package com.example.vankudre.wifilock;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    WifiManager wifiManager;
    WifiManager.WifiLock lock;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       wifiManager = (WifiManager) getSystemService(Context.WIFI_SERVICE);
    }





public void  fullmode(View v){

  lock = wifiManager.createWifiLock(WifiManager.WIFI_MODE_FULL, "LockTag");
    lock.acquire();
    Toast.makeText(this, "WIFI_MODE_FULL", Toast.LENGTH_SHORT).show();
}

    public void  fullhighpref(View v){

        lock = wifiManager.createWifiLock(WifiManager.WIFI_MODE_FULL_HIGH_PERF, "LockTag");
        lock.acquire();
        Toast.makeText(this, "WIFI_MODE_FULL_HIGH_PERF", Toast.LENGTH_SHORT).show();
    }

    public void  scanonly(View v){
//lflflflfllfllfllfllflcvxcvxcvxcbvnvbnvbn
        lock = wifiManager.createWifiLock(WifiManager.WIFI_MODE_SCAN_ONLY, "LockTag");
        lock.acquire();
        Toast.makeText(this, "WIFI_MODE_SCAN_ONLY", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStop() {
        lock.release();
        super.onStop();
    }
}

