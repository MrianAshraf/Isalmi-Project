package com.example.splash.ui.home.Ahadeth;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.splash.R;

import java.util.ArrayList;

public class AhdethAdapter extends RecyclerView.Adapter<AhdethAdapter.AhdethViewHolder>
{
    ArrayList<HadethModel> list= new ArrayList<>();

    public AhdethAdapter(ArrayList<HadethModel> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public AhdethViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.ahadethh,parent,false);
        return new AhdethViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AhdethViewHolder holder, int position)
    {
              HadethModel model=list.get(position);
              holder.ahd_num.setText(model.getHadethnum());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class AhdethViewHolder extends RecyclerView.ViewHolder
{
    TextView ahd_num;
    public AhdethViewHolder(@NonNull  View itemView)
    {
       super(itemView);
       ahd_num=itemView.findViewById(R.id.numberofhadeth);

    }
}
}
