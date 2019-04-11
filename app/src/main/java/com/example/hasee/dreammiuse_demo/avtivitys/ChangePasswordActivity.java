package com.example.hasee.dreammiuse_demo.avtivitys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.hasee.dreammiuse_demo.R;

public class ChangePasswordActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_password);
        initview();
    }

    private void initview() {
        initNavBar(true,"修改密码",false);
    }
}
