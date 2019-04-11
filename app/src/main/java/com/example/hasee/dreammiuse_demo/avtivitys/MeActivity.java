package com.example.hasee.dreammiuse_demo.avtivitys;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hasee.dreammiuse_demo.R;

public class MeActivity extends BaseActivity {
    private TextView changePwd;
    private Button logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_me);
        initview();
    }

    private void initview() {
        initNavBar(true,"个人中心",false);
        changePwd = findViewById(R.id.me_changepass);
        changePwd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MeActivity.this, "aaa", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(MeActivity.this,ChangePasswordActivity.class);
                startActivity(intent);
            }
        });
        logout =findViewById(R.id.me_logoutBtn);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //点击退出，返回到登录页面
                Intent intent =new Intent(MeActivity.this,LoginActivity.class);
                //添加intent标志符，第一个是 关掉当前的任务栈，第二个参数是 创建一个新的任务栈。
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                //用activity这个方法的作用是  在关闭栈和重新创建栈的时候， 新进入的Activity也可以进行一个动画的操作。
                //如果不写这个方法的话，逻辑可以实现，但是设置的跳转动画会产生变形。！！
                MeActivity.this.overridePendingTransition(R.anim.open_enter,R.anim.open_exit);
            }
        });
    }
}
