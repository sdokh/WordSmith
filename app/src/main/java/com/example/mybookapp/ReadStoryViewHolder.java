package com.example.mybookapp;

import android.content.Intent;
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
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Story story = new Story();
                Intent i = new Intent(v.getContext(), StoryDetailActivity.class);
                v.getContext().startActivity(i);
                i.putExtra("title", story.getTitle());
                i.putExtra("body", story.getBody());
                i.putExtra("author", story.getAuthor());
            }
        });
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
