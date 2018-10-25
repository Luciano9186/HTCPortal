package com.htc.htcportal.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.htc.htcportal.R;
import com.htc.htcportal.model.WorkModel;

import java.util.ArrayList;

public class MyEventFragmentAdapter extends RecyclerView.Adapter<MyEventFragmentAdapter.MyEventHolder> {

    private ArrayList<WorkModel> ls;
    private Context context;
    private LayoutInflater inflater;

    public MyEventFragmentAdapter(ArrayList<WorkModel> ls, Context context) {
        this.ls = ls;
        this.context = context;
        inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public MyEventHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = inflater.inflate(R.layout.item_my_work, null);
        return new MyEventHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyEventHolder myEventHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return ls.size();
    }

    class MyEventHolder extends RecyclerView.ViewHolder {
        private ImageView ivImage;
        private TextView tvTitle;
        private TextView tvFrom;
        private TextView tvLocal;
        private TextView tvTime;
        private TextView tvDesc;
        private TextView tvStatus;

        MyEventHolder(@NonNull View itemView) {
            super(itemView);
            ivImage = itemView.findViewById(R.id.ivImage);
            tvTitle = itemView.findViewById(R.id.tvTitle);
            tvFrom = itemView.findViewById(R.id.tvFrom);
            tvLocal = itemView.findViewById(R.id.tvLocal);
            tvTime = itemView.findViewById(R.id.tvTime);
            tvDesc = itemView.findViewById(R.id.tvDesc);
            tvStatus = itemView.findViewById(R.id.tvStatus);
        }
    }
}
