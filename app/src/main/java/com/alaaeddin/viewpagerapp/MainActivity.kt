package com.alaaeddin.viewpagerapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import com.alaaeddin.viewpagerapp.fragments.dashboard.DashboardFragment
import com.alaaeddin.viewpagerapp.fragments.home.HomeFragment
import com.alaaeddin.viewpagerapp.fragments.music.MusicFragment
import kotlinx.android.synthetic.main.activity_main.*

@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {

    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().replace(R.id.fragment_container,
            HomeFragment()).commit()

        bottom_navigation.setOnNavigationItemSelectedListener {
            lateinit var selectedFragment: Fragment

            when (it.itemId) {
                R.id.action_favorites ->
                    selectedFragment = HomeFragment()
                R.id.action_schedules ->
                    selectedFragment = DashboardFragment()
                R.id.action_music ->
                    selectedFragment = MusicFragment()
            }

            supportFragmentManager.beginTransaction().replace(R.id.fragment_container,
                selectedFragment).commit()

            return@setOnNavigationItemSelectedListener true
        }
    }
}
