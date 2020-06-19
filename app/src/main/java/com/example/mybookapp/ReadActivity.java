package com.example.mybookapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

public class ReadActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read);

        RecyclerView recyclerView = findViewById(R.id.recycler_view);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        Story[] stories = loadStories();
        ReadAdapter adapter = new ReadAdapter(stories);
        recyclerView.setAdapter(adapter);
    }

    private Story[] loadStories() {
        Story story1 = new Story();
        story1.setAuthor("Jeff is Me");
        story1.setBody("My name is Jeff.");
        story1.setTitle("What is your name?");

        Story story2 = new Story();
        story2.setAuthor("Paul is Me");
        story2.setBody("My name is Paul.");
        story2.setTitle("What is your name?");

        Story story3 = new Story();
        story3.setAuthor("Jaff is Me");
        story3.setBody("My name is Jaff.");
        story3.setTitle("What is your name?");

        return new Story[] {story1, story2, story3};
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.activity_main_options, menu);
        return true;
    }

    public void OnReadStory(View view) {
        Intent intent = new Intent(this, StoryActivity.class);
        startActivity(intent);
    }

    public void OnWriteStory(View view) {
        Intent intent = new Intent(this, WriteStoryActivity.class);
        startActivity(intent);
    }
}

