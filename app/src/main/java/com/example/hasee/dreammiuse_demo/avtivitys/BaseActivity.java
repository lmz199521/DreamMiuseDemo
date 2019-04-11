package com.example.hasee.dreammiuse_demo.avtivitys;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.IdRes;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.hasee.dreammiuse_demo.R;

/**
 * Created by Lmz on 2019/04/08
 * 作为项目中所有activity 的父类  让他们有一个共性
 */
public class BaseActivity extends Activity{
    private ImageView IvBack,IvMe;
    private TextView IvTitle;

    /**
     *   初始化NavigationBar 的方法
     * @param isShowBack  设置左侧返回按钮是否进行展示
     * @param title   设置中间title 要展示的数据
     * @param isShowMe 设置最右侧的 个人中心按钮师傅进行展示
     */
    protected void initNavBar(boolean isShowBack,String title,boolean isShowMe){
        IvBack =fd(R.id.navBar_back);
        IvMe = fd(R.id.navBar_me);
        IvTitle = fd(R.id.navBar_title);
        // 三元表达式 当ishowback 为true 的时候显示 false 隐藏
        IvBack.setVisibility(isShowBack? View.VISIBLE:View.GONE);
        IvMe.setVisibility(isShowMe?View.VISIBLE:View.GONE);
        IvTitle.setText(title);
        //设置 ivback 点击后退时间
        IvBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();  //后退方法
            }
        });

        IvMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(BaseActivity.this,MeActivity.class);
                startActivity(intent);
            }
        });
    }




    /**
     *   这个是findViewById 的方法
     * @param id 要传入的资源id
     * @param <T>
     * @return 返回的 view 子类
     * <T extends View>  这一句的意思是  T是view 的子类
     */
    protected <T extends View> T fd(@IdRes int id){
        return findViewById(id);
    }
}
