package com.example.splash.ui.sura_details;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.splash.R;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class SuraNameActivity extends AppCompatActivity
{
    TextView SuraNameTextView;
    ArrayList<String> suraline= new ArrayList<String>();
    RecyclerView sura_verse_recycler_viwes;
    SuraVerseAdapter suraVerseAdapter;

    @Override
    public void onCreate(Bundle SaveInstantStatement)
    {
        super.onCreate(SaveInstantStatement);
        setContentView(R.layout.activity_sura_details);
        sura_verse_recycler_viwes = findViewById(R.id.sura_verse_recycler_viwes);
      //////////
        SuraNameTextView = findViewById(R.id.suraname);
        String fileName = getIntent().getStringExtra("file_name");
        String sura = getIntent().getStringExtra("sura_name");
        ReadSouraFile(fileName);
        SuraNameTextView.setText(sura);
        suraVerseAdapter = new SuraVerseAdapter(suraline);
        sura_verse_recycler_viwes.setAdapter(suraVerseAdapter);


    }

    public void ReadSouraFile( String filename)
    {
        BufferedReader reader;

        try
        {
            final InputStream file = getAssets().open(filename);
            reader = new BufferedReader(new InputStreamReader(file));
            String line = reader.readLine();
            Log.e("sura is ",line);
            while(line != null){
                Log.e("sura is ",line);
                suraline.add(line);
                line = reader.readLine();
            }
        }
        catch(IOException ioe)
        {
            ioe.printStackTrace();
        }

    }

}
