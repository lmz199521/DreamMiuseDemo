package com.example.hasee.dreammiuse_demo.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.hasee.dreammiuse_demo.R;

/**
 * Created by Lmz on 2019/04/10
 */
public class TitleName extends LinearLayout{
    private TextView title;
    private String titleNamm;
    private View mView;


    public TitleName(@NonNull Context context) {
        super(context);
        init(context,null);
    }

    public TitleName(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context,attrs);
    }

    public TitleName(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context,attrs);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public TitleName(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(context,attrs);
    }

    private void init(Context context, AttributeSet attrs){
                if (attrs == null){
                    return;
                }
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.TTitleName);
        titleNamm= typedArray.getString(R.styleable.TTitleName_titleNamm);
        typedArray.recycle(); //用完就释放掉
         mView = LayoutInflater.from(context).inflate(R.layout.main_title_tab,this,false);
        //mView= LayoutInflater.from(context).inflate(R.layout.input_view,this,false);
        title=mView.findViewById(R.id.title_name_23);
        title.setText(titleNamm);

        addView(mView);

    }
}
