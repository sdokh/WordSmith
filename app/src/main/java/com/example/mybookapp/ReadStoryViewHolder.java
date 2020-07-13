package com.example.mybookapp;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ReadStoryViewHolder extends RecyclerView.ViewHolder {

    private TextView txtauthor;
    private TextView txttitle;
    private TextView txtbody;

    public ReadStoryViewHolder(@NonNull View itemView) {
        super(itemView);
        txtauthor = itemView.findViewById(R.id.txt_author);
        txttitle = itemView.findViewById(R.id.txt_title);
        txtbody = itemView.findViewById(R.id.txt_body);

    }

    public void bind(Story story) {
        txtauthor.setText(story.getAuthor());
        txttitle.setText(story.getTitle());
        txtbody.setText(story.getBody());
    }

}
