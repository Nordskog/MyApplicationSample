package com.mayulive.myapplication;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity
{
	private static final String TAG = "MA";

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_main);

		getSupportFragmentManager().beginTransaction()
				.add(R.id.fragment_container, new MyFragment() )
				.commitNow();

	}
}
