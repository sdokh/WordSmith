package com.example.mybookapp;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class ReadStoryViewHolder extends RecyclerView.ViewHolder {

    private TextView txtauthor;
    private TextView txttitle;
    private TextView txtbody;

    public ReadStoryViewHolder(@NonNull View itemView) {
        super(itemView);
    }

    public void bind(Story story) {
        txtauthor.setText(story.getAuthor());
        txttitle.setText(story.getTitle());
        txtbody.setText(story.getBody());
    }

}
