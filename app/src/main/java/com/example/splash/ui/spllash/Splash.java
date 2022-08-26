package com.example.splash.ui.spllash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.splash.ui.home.HomeScreen;
import com.example.splash.R;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run()
            {
                StartHomeActivit();
            }
        } ,2000);
    }

    private void StartHomeActivit() {
        Intent intent= new Intent(this, HomeScreen.class);
        startActivity(intent);
        finish();
    }
}