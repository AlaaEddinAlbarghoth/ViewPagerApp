package com.alaaeddin.viewpagerapp.adaoter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import com.alaaeddin.viewpagerapp.R
import com.alaaeddin.viewpagerapp.fragments.FirstFragment
import com.alaaeddin.viewpagerapp.fragments.SecondFragment
import com.alaaeddin.viewpagerapp.fragments.ThirdFragment


class PagerAdapter(fm: FragmentManager) : FragmentStatePagerAdapter(fm) {

    override fun getCount(): Int {
        return 3
    }

    override fun getItem(p: Int): Fragment? {
        val tabString = when(p){
            0 -> "first"
            1 -> "second"
            2 -> "third"
            else -> ""
        }

        return when (p) {
            0 -> FirstFragment.newInstance(tabString)
            1 -> SecondFragment.newInstance(tabString)
            2 -> ThirdFragment.newInstance(tabString)
            else -> null
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0 -> "Tab1"
            1 -> "Tab2"
            2 -> "Tab3"
            else -> ""
        }
    }
}