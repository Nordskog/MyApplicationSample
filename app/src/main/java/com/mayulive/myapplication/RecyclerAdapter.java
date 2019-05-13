package com.mayulive.myapplication;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerHolder>
{
	@NonNull
	@Override
	public RecyclerAdapter.RecyclerHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i)
	{
		// Inflate some layout
		View inflated = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycler_item, viewGroup, false);
		RecyclerAdapter.RecyclerHolder holder = new RecyclerAdapter.RecyclerHolder(inflated);

		// Span controlled by layout manager, height controlled by us. Using GridLayoutManager.
		// Set height as half of parent height, use span of existing layout manager
		int height = viewGroup.getHeight() / 2;
		inflated.setLayoutParams( new RecyclerView.LayoutParams( ViewGroup.LayoutParams.MATCH_PARENT, height ));

		return holder;
	}

	@Override
	public void onBindViewHolder(@NonNull RecyclerAdapter.RecyclerHolder viewHolder, int i)
	{
		// Maybe bind here
	}

	@Override
	public int getItemCount()
	{
		return 10;
	}

	public static class RecyclerHolder extends RecyclerView.ViewHolder
	{
		public RecyclerHolder(@NonNull View itemView)
		{
			super(itemView);
		}
	}

}
