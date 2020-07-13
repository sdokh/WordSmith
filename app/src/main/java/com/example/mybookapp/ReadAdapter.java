package com.example.mybookapp;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

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

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView txtTitle, txtBody, txtAuthor;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            //implement onClick
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

            txtTitle = itemView.findViewById(R.id.chapter_title);
            txtBody = itemView.findViewById(R.id.chapter_text);
            txtAuthor = itemView.findViewById(R.id.novel_by);
        }
    }
}
