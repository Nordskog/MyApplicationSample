package com.mayulive.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager

import kotlinx.android.synthetic.main.activity_main.*



@Suppress("MemberVisibilityCanBePrivate")
class MainActivity : AppCompatActivity() {

   // fun clear(@Suppress("UNUSED_PARAMETER") view: View) = console?.clear()

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val adapter = RecyclerAdapter();
        val manager = GridLayoutManager(this, 2);   // 2 wide, height is controlled in adapter

        this.recycler.adapter = adapter;
        this.recycler.layoutManager = manager;
    }
}