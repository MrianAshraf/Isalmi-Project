package com.example.splash.ui.home.Ahadeth;

import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.splash.R;

public class AhadethFragment extends Fragment {

    RecyclerView ahadethrv;
    String [] ahadethsname=new String [50];
    public AhadethFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.hadethitem, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ahadethrv=view.findViewById(R.id.HadethRecyclarView);
        fillarray(ahadethsname);
        AhdethAdapter hadethobj=new AhdethAdapter(ahadethsname);
        hadethobj.hadethitem = new AhdethAdapter.Onhadethclickedinterface(){
            @Override
            public void onhadethclickfun(String itemname, int index) {
                startscreen(itemname,"h"+(index+1)+".txt");

            }
        };
        ahadethrv.setAdapter(hadethobj);
    }

    public void fillarray(String[]ahadeths)
    {
        for (int i = 0 ; i<50 ; i++)
        {
            ahadeths[i] ="الحديث رقم " +(i+1);
        }
    }

    private void startscreen(String hadethname,String filename) {
        // start hadeeth screen according to hadeth name
        Intent intent = new Intent(getActivity(), HadethActivity.class);
        intent.putExtra("HadethName", hadethname);
        intent.putExtra("FileName",filename);
        startActivity(intent);
    }
}