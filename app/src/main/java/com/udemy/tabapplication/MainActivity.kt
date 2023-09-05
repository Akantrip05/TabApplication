package com.udemy.tabapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telephony.SmsManager.FinancialSmsCallback
import android.widget.TableLayout
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    var tabArray = arrayOf("Chat", "Status", "Calls")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var vipager:ViewPager2 = findViewById(R.id.view)
        var tabLayout:TabLayout = findViewById(R.id.tabLayout2)

        var viewAdapter = ViewAdapter(supportFragmentManager,lifecycle)
        vipager.adapter = viewAdapter

        // connecting viewpager with tablayout
        TabLayoutMediator(tabLayout,vipager){
            tab,position -> tab.text = tabArray[position]
        }.attach()


    }
}