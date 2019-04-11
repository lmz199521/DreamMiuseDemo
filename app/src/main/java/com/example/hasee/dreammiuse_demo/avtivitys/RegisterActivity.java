package com.example.hasee.dreammiuse_demo.avtivitys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.hasee.dreammiuse_demo.R;

public class RegisterActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        initview();
    }

    /**
     * 初始化View
     */
    private void initview() {
        initNavBar(true,"注册",false);

    }
}
