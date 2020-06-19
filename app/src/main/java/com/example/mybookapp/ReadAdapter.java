package com.example.mybookapp;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ReadAdapter extends RecyclerView.Adapter<ReadStoryViewHolder> {
    private Story[] stories;

    public ReadAdapter(Story[] stories) {
        this.stories = stories;
    }

    @NonNull
    @Override
    public ReadStoryViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        //Load view from the layout file
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View itemView = layoutInflater.inflate(R.layout.view_holder_story, viewGroup, false);

        return new ReadStoryViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ReadStoryViewHolder readStoryViewHolder, int i) {
        Story story = stories[i];
        readStoryViewHolder.bind(story);

    }

    @Override
    public int getItemCount() {
        return stories.length;
    }
}
