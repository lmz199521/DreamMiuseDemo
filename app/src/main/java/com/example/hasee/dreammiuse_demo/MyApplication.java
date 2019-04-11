package com.example.hasee.dreammiuse_demo;

import android.app.Application;

import com.blankj.utilcode.util.Utils;

/**
 * Created by Lmz on 2019/04/08
 */
public class MyApplication extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        /**
         * 初始化 android utilcode
         */
        Utils.init(this);
    }
}
