package com.htc.htcportal.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.htc.htcportal.R;
import com.htc.htcportal.model.ItemModel;

import java.util.ArrayList;

public class InfoFragmentAdapter extends RecyclerView.Adapter<InfoFragmentAdapter.InfoViewHolder> {

    private ArrayList<ItemModel> ls;
    private Context context;
    private LayoutInflater inflater;

    public InfoFragmentAdapter(ArrayList<ItemModel> ls, Context context) {
        this.ls = ls;
        this.context = context;
        inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public InfoViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = inflater.inflate(R.layout.item_info, null);
        return new InfoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull InfoViewHolder infoViewHolder, int i) {
        final ItemModel itemModel = ls.get(i);

        infoViewHolder.ivImage.setImageResource(itemModel.getImage());
        infoViewHolder.tvTitle.setText(itemModel.getTitle());
        infoViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, itemModel.getTitle(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return ls.size();
    }

    class InfoViewHolder extends RecyclerView.ViewHolder {
        private ImageView ivImage;
        private TextView tvTitle;

        public InfoViewHolder(@NonNull View itemView) {
            super(itemView);
            ivImage = itemView.findViewById(R.id.ivImage);
            tvTitle = itemView.findViewById(R.id.tvTitle);
        }
    }

}
