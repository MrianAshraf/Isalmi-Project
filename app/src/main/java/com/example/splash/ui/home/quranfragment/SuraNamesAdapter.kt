package com.example.splash.ui.home.quranfragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.splash.R
import com.google.android.material.navigation.NavigationBarView
//SuraNameRecyculaerView
class SuraNamesAdapter(val items: Array<String>) : RecyclerView.Adapter<SuraNamesAdapter.ViewHolder>()
{
    class ViewHolder(val itemView:View) :RecyclerView.ViewHolder(itemView)
    {
        val suraNametextview =itemView.findViewById<TextView>(R.id.item_sura_name_title)
    }

    override fun getItemCount(): Int
    {
      return items.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder
    {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_soura_name,parent,false)
        return  ViewHolder(view)
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int)
    {
       holder.suraNametextview.setText(items.get(position))
      holder.suraNametextview.setOnClickListener()
      {
          OnSuraNamelicked?.OnItemClickListner(items.get(position),position)
      }
    }
   interface OnItemClickListner
   {
       fun OnItemClickListner (item: String, index:Int)
   }
 var OnSuraNamelicked : OnItemClickListner?= null

}