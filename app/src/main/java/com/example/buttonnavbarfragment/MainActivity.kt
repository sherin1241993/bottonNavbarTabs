package com.example.buttonnavbarfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setUpTabBar()
    }

    private fun setUpTabBar() {
        val adapter = TabPageAdapter(this,tabLayout.tabCount)
        viewPaper.adapter = adapter
        viewPaper.registerOnPageChangeCallback(object :ViewPager2.OnPageChangeCallback()
        {
            override fun onPageSelected(position: Int) {
                tabLayout.selectTab(tabLayout.getTabAt(position))
            }

             })
        tabLayout.addOnTabSelectedListener(object :TabLayout.OnTabSelectedListener
        {


            override fun onTabSelected(tab: TabLayout.Tab) {
                viewPaper.currentItem = tab.position
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
            }
        })

       }

    }