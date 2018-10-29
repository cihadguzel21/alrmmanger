package com.example.cihad.alarm_app;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class AlarmReceiver extends BroadcastReceiver{

    @Override
    public void onReceive(Context context, Intent ıntent) {
        Toast.makeText(context, "Alarm Çalıyor! Artık Uyan!", Toast.LENGTH_LONG).show();
        Log.e("receiver","receive");

    }
}
