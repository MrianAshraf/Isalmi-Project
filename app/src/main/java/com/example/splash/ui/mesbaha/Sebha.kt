package com.example.splash.ui.mesbaha

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.splash.R

class Sebha : AppCompatActivity()
{
    lateinit var counter : Button
    var count =0;
    var GeneralCounter =0;
    lateinit var zekr:Button
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sebha)
        counter=findViewById(R.id.counter)
        zekr=findViewById(R.id.zekr)
        counter.setOnClickListener {
            count++
            GeneralCounter++
            if(GeneralCounter==10)
            {
                zekr.setText("لا حول ولا قوه الا بالله")
            }
           else if(GeneralCounter==20)
            {
                zekr.setText("لا اله الا بالله")
            }
            else if(GeneralCounter==30)
            {
                zekr.setText("استغفر الله العظيم")
            }
            else if(GeneralCounter==40)
            {
                zekr.setText("الحمدالله")
            }
            counter.setText(count.toString())
        }
    }
}