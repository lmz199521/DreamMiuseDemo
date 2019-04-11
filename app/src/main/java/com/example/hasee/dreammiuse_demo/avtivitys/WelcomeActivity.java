package com.example.hasee.dreammiuse_demo.avtivitys;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.hasee.dreammiuse_demo.R;

import java.util.Timer;
import java.util.TimerTask;

// 此类需要实现两个功能 1.延迟三秒 2.跳转页面
public class WelcomeActivity extends BaseActivity {
    private Timer timer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        init();
    }
    /**
     * 初始化
     */
    private void init(){
        timer =new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Log.d("lmz","当前线程为："+Thread.currentThread());
                //判断当前线程，如果是主线程可执行 更新UI的操作， 子线程可执行耗时操作
                // toMain();
                toLogin();
            }
        },3*1000);
    }

    /**
     * 跳转页面
     */
    private void toMain(){
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
        finish();
    }

    private void toLogin(){
        Intent intent=new Intent(this,LoginActivity.class);
        startActivity(intent);
        finish();
    }
}
