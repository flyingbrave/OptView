package com.yxy.optview;

import android.app.Application;

import com.yxy.apt_annotation.ViewCreator;


@ViewCreator
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
    }
}
