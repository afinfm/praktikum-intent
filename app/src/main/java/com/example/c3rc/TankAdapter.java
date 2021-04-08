package com.example.c3rc;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class TankAdapter extends RecyclerView.Adapter<TankAdapter.Viewholder> {
    private Context context;
    private ArrayList<TankModel> tankModels;

    public TankAdapter(Context context) {
        this.context = context;
    }

    public ArrayList<TankModel> getTankModels() {
        return tankModels;
    }

    public void setTankModels(ArrayList<TankModel> tankModels) {
        this.tankModels = tankModels;
    }

    @NonNull
    @Override
    public TankAdapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemRow = LayoutInflater.from(parent.getContext()).inflate(R.layout.template_item,parent,false);
        return new Viewholder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull TankAdapter.Viewholder holder, int position) {
        Glide.with(context).load(getTankModels().get(position).getGambar()).into(holder.gambar);
        holder.nama.setText(getTankModels().get(position).getNama());
    }

    @Override
    public int getItemCount() {
        return getTankModels().size();
    }

    public class Viewholder extends RecyclerView.ViewHolder {
        private ImageView gambar;
        private TextView nama;
        public Viewholder(@NonNull View itemView) {
            super(itemView);
            gambar = itemView.findViewById(R.id.temp_gambar);
            nama = itemView.findViewById(R.id.temp_nama);

        }
    }
}
