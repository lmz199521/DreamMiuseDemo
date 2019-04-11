package com.example.hasee.dreammiuse_demo.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hasee.dreammiuse_demo.R;

/**
 * Created by Lmz on 2019/04/11
 */
public class MiuseGridAdapter extends RecyclerView.Adapter<MiuseGridAdapter.ViewHolder>{

    private Context context;

    public MiuseGridAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            context =viewGroup.getContext();
        View view = LayoutInflater.from(context).inflate(R.layout.item_grid_miuse, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
