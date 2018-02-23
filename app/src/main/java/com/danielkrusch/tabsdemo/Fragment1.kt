package com.danielkrusch.tabsdemo

import android.app.Fragment
import android.widget.Toast
import android.os.Bundle
import android.support.annotation.Nullable
import android.view.ViewGroup
import android.view.LayoutInflater
import android.view.View
import android.widget.Button


/**
 * Created by Daniel on 2/22/2018.
 */
class Fragment1
{
    inner class Fragment1 : Fragment()
    {

        private var btnTEST: Button? = null

        @Nullable
        override fun onCreateView(inflater: LayoutInflater, @Nullable container: ViewGroup, @Nullable savedInstanceState: Bundle): View
        {
            val view = inflater.inflate(R.layout.fragment_1, container, false)
            btnTEST = view.findViewById(R.id.view)

            btnTEST!!.setOnClickListener(object : View.OnClickListener()
            {
                override fun onClick(view: View)
                {
                    Toast.makeText(getActivity(), "TESTING BUTTON CLICK 1", Toast.LENGTH_SHORT).show()
                }
            })

            return view
        }

        companion object
        {
            private val TAG = "Tab1Fragment"
        }
    }
}