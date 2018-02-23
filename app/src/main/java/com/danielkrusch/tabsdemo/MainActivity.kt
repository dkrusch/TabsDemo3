package com.danielkrusch.tabsdemo

import android.support.design.widget.TabLayout
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import android.support.v4.view.ViewPager
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_main.view.*

class MainActivity : AppCompatActivity()
{

    /**
     * The [android.support.v4.view.PagerAdapter] that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * [android.support.v4.app.FragmentStatePagerAdapter].
     */
    private val TAG = "MainActivity"

    private var mSectionsPageAdapter: SectionsPageAdapter? = null

    private var mViewPager: ViewPager? = null

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "onCreate: Starting.")


        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPageAdapter = SectionsPageAdapter(supportFragmentManager)

        // Set up the ViewPager with the sections adapter.
        mViewPager = findViewById<View>(R.id.container) as ViewPager
        setupViewPager(mViewPager)

        val tabLayout = findViewById<View>(R.id.tabs) as TabLayout
        tabLayout.setupWithViewPager(mViewPager)
    }

    private fun setupViewPager(viewPager: ViewPager?)
    {
        val adapter = SectionsPageAdapter(supportFragmentManager)
        adapter.addFragment(Fragment1(), "TAB1")
        adapter.addFragment(Fragment2(), "TAB2")
        adapter.addFragment(Fragment3(), "TAB3")
        viewPager!!.adapter = adapter
    }
}
