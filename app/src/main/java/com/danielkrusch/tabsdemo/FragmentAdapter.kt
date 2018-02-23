package com.danielkrusch.tabsdemo

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import java.nio.file.Files.size
import android.support.v4.app.FragmentPagerAdapter
import java.util.ArrayList


/**
 * Created by Daniel on 2/22/2018.
 */
class SectionsPageAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm)
{

    private val mFragmentList = ArrayList<Fragment>()
    private val mFragmentTitleList = ArrayList<String>()

    fun addFragment(fragment: Fragment, title: String)
    {
        mFragmentList.add(fragment)
        mFragmentTitleList.add(title)
    }

    override fun getPageTitle(position: Int): CharSequence
    {
        return mFragmentTitleList[position]
    }

    override fun getItem(position: Int): Fragment
    {
        return mFragmentList[position]
    }

    override fun getCount(): Int
    {
        return mFragmentList.size
    }
}