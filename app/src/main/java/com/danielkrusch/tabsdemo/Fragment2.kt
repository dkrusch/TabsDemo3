package com.danielkrusch.tabsdemo

import android.app.Fragment
import android.os.Bundle
import android.support.annotation.Nullable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast

/**
 * Created by Daniel on 2/22/2018.
 */
class Fragment2
{
    inner class Fragment2 : Fragment()
    {

        private var btnTEST: Button? = null

        @Nullable
        fun onCreateView(inflater: LayoutInflater, @Nullable container: ViewGroup, @Nullable savedInstanceState: Bundle): View
        {
            val view = inflater.inflate(R.layout.fragment_1, container, false)
            btnTEST = view.findViewById(R.id.btnTEST) as Button

            btnTEST!!.setOnClickListener(object : View.OnClickListener()
            {
                fun onClick(view: View)
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