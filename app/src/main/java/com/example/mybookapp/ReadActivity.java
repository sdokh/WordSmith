package com.example.mybookapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ReadActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read);
    }

    public void OnReadStory(View view) {
        Intent intent = new Intent(this, StoryActivity.class);
        startActivity(intent);
    }
}
