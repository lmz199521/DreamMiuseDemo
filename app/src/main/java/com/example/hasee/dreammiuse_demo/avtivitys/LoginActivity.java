package com.example.hasee.dreammiuse_demo.avtivitys;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hasee.dreammiuse_demo.R;
import com.example.hasee.dreammiuse_demo.utils.UserUtils;
import com.example.hasee.dreammiuse_demo.views.InputView;

public class LoginActivity extends BaseActivity implements View.OnClickListener{

    private TextView register;
    private InputView input_phone,input_pwd;
    private Button loginBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initview();
    }

    /**
     * 初始化View
     */
    private void initview() {
        initNavBar(false,"登录",false);
        register =this.findViewById(R.id.registerClick);
        register.setOnClickListener(this);
        loginBtn =this.findViewById(R.id.loginClick);
        loginBtn.setOnClickListener(this);
        input_phone =this.findViewById(R.id.input_phone);
        input_pwd = this.findViewById(R.id.input_password);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.registerClick:
                Toast.makeText(this, "注册", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(this,RegisterActivity.class);
                startActivity(intent);
                break;
            case R.id.loginClick:
                //登录
                String phone = input_phone.getInputString();
                String password = input_pwd.getInputString();
                //如果验证的手机号返回为 false 证明无效 直接return
                if (!UserUtils.VerifierDataLogin(LoginActivity.this,phone,password)){
                    return;
                }
                //如果有效则跳转到主页面
                Intent intent2 =new Intent(this,MainActivity.class);
                startActivity(intent2);
                finish();
                break;
        }
    }
}
