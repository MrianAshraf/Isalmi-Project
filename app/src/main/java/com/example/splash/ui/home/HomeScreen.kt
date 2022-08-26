package com.example.splash.ui.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.splash.R
import com.example.splash.ui.home.Ahadeth.AhadethFragment
import com.example.splash.ui.home.quranfragment.FragmentQuran
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeScreen : AppCompatActivity()
{
    lateinit var BottomNavigation : BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_screen)
        supportFragmentManager.beginTransaction().replace(R.id.FragmentContainer, FragmentQuran()).commit()

        BottomNavigation=findViewById(R.id.home_buttom_navigation)

        BottomNavigation.setOnItemSelectedListener{ item->
                 if(item.itemId==R.id.ic_quran)
                 {
                     supportFragmentManager.beginTransaction().replace(R.id.FragmentContainer, FragmentQuran()).commit()
                 }
            else if(item.itemId==R.id.ic_hadeth)
                 {
                     supportFragmentManager.beginTransaction().replace(R.id.FragmentContainer, AhadethFragment()).commit()
                 }
                 else if(item.itemId==R.id.ic_radio)
                 {
                     supportFragmentManager.beginTransaction().replace(R.id.FragmentContainer,FragmentRadio()).commit()
                 }
            else
                 {
                     supportFragmentManager.beginTransaction().replace(R.id.FragmentContainer,FragmentSebha()).commit()

                 }

          return@setOnItemSelectedListener true
        }
    }
}