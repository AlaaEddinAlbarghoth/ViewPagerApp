package com.alaaeddin.viewpagerapp.fragments.home

import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.app.Fragment
import android.support.v4.view.ViewPager
import android.support.v7.widget.Toolbar
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.alaaeddin.viewpagerapp.R
import com.alaaeddin.viewpagerapp.adapter.PagerAdapter
import android.support.v7.app.AppCompatActivity

class HomeFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        val toolBar: Toolbar = view.findViewById(R.id.toolbar)
        toolBar.title = resources.getString(R.string.app_name)
        (activity as AppCompatActivity).setSupportActionBar(toolBar)

        /** Set ViewPager (Adapter, Listener)*/
        /* Adapter */
        val pagerAdapter = PagerAdapter(childFragmentManager)

        /* Pager */
        val mViewPager: ViewPager = view.findViewById(R.id.pager)
        mViewPager.adapter = pagerAdapter

        val tabLayout: TabLayout = view.findViewById(R.id.tabs)
        tabLayout.setupWithViewPager(mViewPager)

        return view
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            HomeFragment().apply {
                arguments = Bundle().apply {
                }
            }
    }
}
