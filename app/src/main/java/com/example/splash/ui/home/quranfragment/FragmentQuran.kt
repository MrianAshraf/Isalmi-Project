package com.example.splash.ui.home.quranfragment
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.splash.R
import com.example.splash.ui.sura_details.SuraNameActivity

class FragmentQuran : Fragment()
{
    lateinit var suranamerecyculaerview: RecyclerView
    lateinit var suraNamesAdapter: SuraNamesAdapter
    val SuraNameList= arrayOf<String>("الفاتحه","البقرة","آل عمران","النساء","المائدة","الأنعام","الأعراف","الأنفال","التوبة","يونس","هود"
        ,"يوسف","الرعد","إبراهيم","الحجر","النحل","الإسراء","الكهف","مريم","طه","الأنبياء","الحج","المؤمنون"
        ,"النّور","الفرقان","الشعراء","النّمل","القصص","العنكبوت","الرّوم","لقمان","السجدة","الأحزاب","سبأ"
        ,"فاطر","يس","الصافات","ص","الزمر","غافر","فصّلت","الشورى","الزخرف","الدّخان","الجاثية","الأحقاف"
        ,"محمد","الفتح","الحجرات","ق","الذاريات","الطور","النجم","القمر","الرحمن","الواقعة","الحديد","المجادلة"
        ,"الحشر","الممتحنة","الصف","الجمعة","المنافقون","التغابن","الطلاق","التحريم","الملك","القلم","الحاقة","المعارج"
        ,"نوح","الجن","المزّمّل","المدّثر","القيامة","الإنسان","المرسلات","النبأ","النازعات","عبس","التكوير","الإنفطار"
        ,"المطفّفين","الإنشقاق","البروج","الطارق","الأعلى","الغاشية","الفجر","البلد","الشمس","الليل","الضحى","الشرح"
        ,"التين","العلق","القدر","البينة","الزلزلة","العاديات","القارعة","التكاثر","العصر",
        "الهمزة","الفيل","قريش","الماعون","الكوثر","الكافرون","النصر","المسد","الإخلاص","الفلق","الناس")
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_quran, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?)

    {


        super.onViewCreated(view, savedInstanceState)
        suranamerecyculaerview=view.findViewById<RecyclerView>(R.id.SuraNameRecyculaerView)
        suraNamesAdapter= SuraNamesAdapter(SuraNameList)
        suranamerecyculaerview.adapter=suraNamesAdapter
        suraNamesAdapter.OnSuraNamelicked = object  :SuraNamesAdapter.OnItemClickListner
        {
            override fun OnItemClickListner(item: String, index: Int)
            {
                StartSuraDetails(item, "${index +1}"+".txt")
            }
        }

    }

    private fun StartSuraDetails( suraname: String, filename: String)
    {
        var intent: Intent = Intent(activity, SuraNameActivity::class.java)
        intent.putExtra("sura_name",suraname)
        intent.putExtra("file_name",filename)
        startActivity(intent)
    }

}

