package com.example.edianzu.myjpush;

import android.app.Application;

import cn.jpush.android.api.JPushInterface;

/**
 * Created by edianzu on 2018/3/26.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        initJpush();
    }

    private void initJpush(){
        JPushInterface.setDebugMode(true);
        JPushInterface.init(this);
    }
}
