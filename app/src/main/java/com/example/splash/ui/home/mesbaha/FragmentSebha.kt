package com.example.splash.ui.home.mesbaha

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.splash.R

class FragmentSebha : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.activity_sebha, container, false)
    }

    lateinit var counter : Button
    var count =0;
    var GeneralCounter =0;
    lateinit var zekr: Button
    override fun onViewCreated(view: View, savedInstanceState: Bundle?)
    {
        super.onViewCreated(view, savedInstanceState)
        counter=view.findViewById(R.id.counter)
        zekr=view.findViewById(R.id.zekr)
        counter.setOnClickListener {
            count++
            GeneralCounter++
            if(GeneralCounter==25)
            {
                zekr.setText("لا حول ولا قوه الا بالله")
            }
            else if(GeneralCounter==50)
            {
                zekr.setText("لا اله الا بالله")
            }
            else if(GeneralCounter==75)
            {
                zekr.setText("استغفر الله العظيم")
            }
            else if(GeneralCounter==100)
            {
                zekr.setText("الحمدالله")
                count=0
                zekr.setText("سبحان الله")
            }
            counter.setText(count.toString())
        }
    }
}