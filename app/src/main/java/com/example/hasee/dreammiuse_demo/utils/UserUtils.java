package com.example.hasee.dreammiuse_demo.utils;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;

import com.blankj.utilcode.util.RegexUtils;

/**
 * Created by Lmz on 2019/04/09
 */
public class UserUtils {
    /**
     * 验证用户输入的合法性
     */
    public static boolean VerifierDataLogin(Context context,String phone,String password){
        //简单的验证手机号
        RegexUtils.isMobileSimple(phone);
       //复杂的判断手机号
        RegexUtils.isMobileExact(phone);
        if (!RegexUtils.isMobileExact(phone)){
            Toast.makeText(context, "无效手机号", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (TextUtils.isEmpty(password)){
            Toast.makeText(context, "请输入密码", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }
}
