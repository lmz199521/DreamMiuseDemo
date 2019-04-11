package com.example.hasee.dreammiuse_demo.avtivitys;

import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.hasee.dreammiuse_demo.R;

public class MainActivity extends BaseActivity {

    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initview();
    }

    private void initview() {
        initNavBar(false,"Dream音乐",true);
        recyclerView =fd(R.id.main_recycview);
        GridLayoutManager manager =new GridLayoutManager(this,3);
        recyclerView.setLayoutManager(manager);

    }
}
