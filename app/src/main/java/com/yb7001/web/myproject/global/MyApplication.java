package com.yb7001.web.myproject.global;


import android.app.Application;

public class MyApplication extends Application {

    private static MyApplication myApplication;

    public static MyApplication getInstance(){
        return myApplication;
    }

    @SuppressWarnings("unused")
    @Override
    public void onCreate() {
        super.onCreate();
        myApplication=this;
    }
}
