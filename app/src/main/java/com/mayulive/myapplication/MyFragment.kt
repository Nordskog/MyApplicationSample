package com.mayulive.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.app.ActivityOptionsCompat
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.my_fragment.view.*

class MyFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View?
    {

        // Inflate view.
        val view = inflater.inflate(R.layout.my_fragment, container, false)
        view.search_input.setOnClickListener {
            var intent = Intent(activity, SearchActivity::class.java)
            val options = ActivityOptionsCompat.makeSceneTransitionAnimation(
                    activity!!,
                    view.search_wrapper as View,
                    "search"
            )
            activity!!.startActivity(intent, options.toBundle())
        }

        return view
    }
}