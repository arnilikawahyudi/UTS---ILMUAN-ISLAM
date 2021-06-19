package com.example.ilmuanislam.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.ilmuanislam.R;
import com.example.ilmuanislam.Ilmuan;

import java.util.ArrayList;

public class ListIlmuanAdapter extends RecyclerView.Adapter<ListIlmuanAdapter.ListViewHolder>{

    private final ArrayList<Ilmuan> listIlmuan;

    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    public ListIlmuanAdapter(ArrayList<Ilmuan> list) {
        this.listIlmuan = list;
    }
    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_ilmuan, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder listViewHolder, int i) {
        final Ilmuan ilmuan = listIlmuan.get(i);

        Glide.with(listViewHolder.itemView.getContext())
                .load(ilmuan.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(listViewHolder.imgPhoto);

        listViewHolder.tvName.setText(ilmuan.getNama_ilmuan());
        listViewHolder.tvDetail.setText(ilmuan.getDetail_ilmuan());

        listViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClickCallback.onItemClicked(ilmuan);
            }
        });



    }

    @Override
    public int getItemCount() {
        return listIlmuan.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail;


        ListViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);

        }
    }

}
