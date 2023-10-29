package com.example.recyclerviewcarsex.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewcarsex.Model.Model;
import com.example.recyclerviewcarsex.R;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.Viewholder>{
    List<Model>modelList;

    public CustomAdapter(List<Model> modelList) {
        this.modelList = modelList;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_laytout,parent,false
        );

        return new Viewholder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {

        Model carmodel = modelList.get(position);

        holder.imageView.setImageResource(carmodel.getCarimage());
        holder.textView.setText(carmodel.getCarName());

    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder{


        TextView textView;
        ImageView imageView;
        Viewholder itemView;

        public Viewholder(@NonNull View itemView) {
            super(itemView);
            this.textView = textView;
            this.imageView = imageView;

            textView = itemView.findViewById(R.id.name);
            imageView = itemView.findViewById(R.id.image);
        }
    }
}
