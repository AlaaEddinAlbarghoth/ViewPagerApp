package com.alaaeddin.viewpagerapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import com.alaaeddin.viewpagerapp.adaoter.PagerAdapter

@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {

    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolBar: Toolbar = findViewById(R.id.toolbar)
        toolBar.title = resources.getString(R.string.app_name)
        setSupportActionBar(toolBar)

        /** Set ViewPager (Adapter, Listener)*/
        /* Adapter */
        val pagerAdapter = PagerAdapter(supportFragmentManager)

        /* Pager */
        val mViewPager: ViewPager = findViewById(R.id.pager)
        mViewPager.adapter = pagerAdapter

        val tabLayout: TabLayout = findViewById(R.id.tabs)
        tabLayout.setupWithViewPager(mViewPager)
    }
}
