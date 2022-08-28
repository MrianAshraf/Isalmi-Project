package com.example.splash.ui.home.Ahadeth;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

//import com.route.isslami.R;
//import com.route.isslami.ui.home.adapters.Ahadeth_adapter;
//import com.route.isslami.ui.home.adapters.Hadyeathverse_adapter;

import com.example.splash.R;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class HadethActivity extends AppCompatActivity {
    ArrayList<String>ahadethlist = new ArrayList<String>();
    RecyclerView hadethlinesrv;
    Hadyeathverse_adapter hadyeathverse_adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ahadethh);
        hadethlinesrv = findViewById(R.id.hadeth_verse_recycler_viwess);
        hadyeathverse_adapter=new Hadyeathverse_adapter(ahadethlist);
      //  hadethlinesrv.setAdapter(hadyeathverse_adapter);
        String hadethfileName;
        hadethfileName= getIntent().getStringExtra("FileName");
        readahadethfile(hadethfileName);
        Log.e("HadethFileName",hadethfileName);

    }

    private void readahadethfile(String hadethfileName) {
        BufferedReader reader;
        try{
            final InputStream file = getAssets().open(hadethfileName);
            reader = new BufferedReader(new InputStreamReader(file));
            String line = reader.readLine();
            while(line != null){
                ahadethlist.add(line);
                line = reader.readLine();
            }
        } catch(IOException ioe)
        {
            ioe.printStackTrace();
        }
    }
}