package com.example.user.yingfeng;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Trace;

/**
 * Created by user on 2016/9/18.
 */
public class MyService extends Service {

    private static final String TAG = "MyService";
    protected static Trace trace = null;
    public static final long serviceId = 125468;

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
