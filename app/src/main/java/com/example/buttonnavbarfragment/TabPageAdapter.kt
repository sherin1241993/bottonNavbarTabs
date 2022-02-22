package com.example.buttonnavbarfragment

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class TabPageAdapter(activity : FragmentActivity,private val tabCount :Int) : FragmentStateAdapter(activity){
    override fun getItemCount(): Int {
        return tabCount
    }

    override fun createFragment(position: Int): Fragment {
        return when(position)
        {
            0->FirstFragment()
            1->SecondFragment()
            2->ThirdFragment()
            else -> FirstFragment()
        }
    }

}