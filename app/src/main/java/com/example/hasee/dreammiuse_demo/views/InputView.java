package com.example.hasee.dreammiuse_demo.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.text.InputType;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.example.hasee.dreammiuse_demo.R;

/**
 * Created by Lmz on 2019/04/08
 *  自定义的输入控件
 *  1.input_icon: 输入框前面的图标
 *  2.input_hint:输入框的提示内容
 *  3.is_password：输入的内容是否以密文的形式展示
 */
public class InputView extends FrameLayout{

    private int input_icon;
    private String input_hint;
    private boolean ispassword;

    private View mView;
    private ImageView IvIcon;
    private EditText mEdit;

    public InputView(@NonNull Context context) {
        super(context);
        init(context,null);//因为第一个构造里面没有 attributeset属性 所以填写为null
    }

    public InputView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context,attrs);
    }

    public InputView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context,attrs);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public InputView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(context,attrs);
    }

    /**
     *   初始化方法
     * @param context  上下文
     * @param attrs
     */
    private void init(Context context,AttributeSet attrs){
        if (attrs ==null) return;
        //获取自定义属性  第二个参数是  自定义的attrs 布局中的 declare-styleable name属性
        TypedArray typedArray =context.obtainStyledAttributes(attrs, R.styleable.inputview);
        //第一个参数是  attrs文件中的 图标属性  第二个是默认值
        input_icon=typedArray.getResourceId(R.styleable.inputview_input_icon,R.drawable.loginlogo);
        input_hint =typedArray.getString(R.styleable.inputview_input_hint);
        ispassword =typedArray.getBoolean(R.styleable.inputview_is_password,false);
        //用完之后需要释放掉 这个属性
        typedArray.recycle();
        //绑定layout布局
        mView= LayoutInflater.from(context).inflate(R.layout.input_view,this,false);
        IvIcon=mView.findViewById(R.id.input_icon);
        mEdit=mView.findViewById(R.id.input_edit);
        //布局管理属性
        IvIcon.setImageResource(input_icon);
        mEdit.setHint(input_hint);
        //如果为真的话 edit为密码  为false 是手机号
        mEdit.setInputType(ispassword? InputType.TYPE_CLASS_TEXT|InputType.TYPE_TEXT_VARIATION_PASSWORD:InputType.TYPE_CLASS_PHONE);
        addView(mView);
    }

    /**
     * 返回输入的内容+++++
     * @return
     */
    public String getInputString(){
        return mEdit.getText().toString().trim();
    }
}
