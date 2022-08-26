package com.example.splash.ui.home.Ahadeth;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.splash.R;

import java.util.ArrayList;

public class AhadethFragment extends Fragment {
RecyclerView HadRec;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        return inflater.inflate(R.layout.hadethitem, container, false);
    }
    @Override
    public  void onViewCreated(View view ,Bundle SaveInstanceState)
    {
        super.onCreate(SaveInstanceState);
        HadRec=view.findViewById(R.id.HadethRecyclarView);
        ArrayList<HadethModel> list= getlist();
        initRccy(list);


    }

    private void initRccy(ArrayList<HadethModel> list)
    {

        AhdethAdapter adapter= new AhdethAdapter(list);
        RecyclerView.LayoutManager layoutManager= new LinearLayoutManager(getContext(),RecyclerView.VERTICAL,false);
        HadRec.setLayoutManager(layoutManager);
        HadRec.setAdapter(adapter);
    }


    private ArrayList<HadethModel> getlist()
    {
        ArrayList<HadethModel> list= new ArrayList<> ();
        for(int i=0; i<=40;i++)
        {
               String S="رقم الحديث"+1;
               list.add( new HadethModel(S));
            Log.e("getlist",list.toString());
        }
              return list;
    }
}



