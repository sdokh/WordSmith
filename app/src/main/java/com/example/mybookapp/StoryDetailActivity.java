package com.example.mybookapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class StoryDetailActivity extends AppCompatActivity {

    TextView textBody;
    TextView textAuthor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story_details);

        Intent i = getIntent();
        textBody = findViewById(R.id.story_body);
        textAuthor = findViewById(R.id.story_author);

        String title = i.getStringExtra("title");
        String body = i.getStringExtra("body");
        String author = i.getStringExtra("author");

//        getSupportActionBar().setTitle(title);
//
//        textBody.setText(body);
//        textAuthor.setText(author);

    }
}
