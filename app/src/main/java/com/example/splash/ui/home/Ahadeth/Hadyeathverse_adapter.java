package com.example.splash.ui.home.Ahadeth;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.splash.R;

import java.util.ArrayList;

public class Hadyeathverse_adapter extends RecyclerView.Adapter<Hadyeathverse_adapter.HadyeathverseViewholder> {
    public ArrayList<String> ahadeth;

    public Hadyeathverse_adapter(ArrayList<String> ahadeth) {
        this.ahadeth = ahadeth;
    }

    @NonNull
    @Override
    public HadyeathverseViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ahadethh, parent, false);
        return new HadyeathverseViewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HadyeathverseViewholder holder, @SuppressLint("RecyclerView") int position) {

        holder.hadethno.setText(ahadeth.get(position));
        holder.hadethno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hadethitem.onhadethclickfun(ahadeth.get(position), position);

            }
        });
    }

    public interface Onhadethclickedinterface {
        public void onhadethclickfun(String itemname, int index);
    }
    public Onhadethclickedinterface hadethitem;
    @Override
    public int getItemCount() {
        return ahadeth.size();
    }

    class HadyeathverseViewholder extends RecyclerView.ViewHolder {

        TextView hadethno;

        public HadyeathverseViewholder(@NonNull View itemView) {
            super(itemView);
            hadethno = itemView.findViewById(R.id.hadethname);

        }
    }
}
