package com.example.mybookapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;

public class ReadActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read);

        recyclerView = findViewById(R.id.recycler_view);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        loadStories();
    }

    private void loadStories() {
        //Load stories from server
        String url = "http://www.json-generator.com/api/json/get/cpvIggkXNe?indent=2";
        StringRequest request = new StringRequest(url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Gson gson = new Gson();
                Story[] stories = gson.fromJson(response, Story[].class);

                ReadAdapter adapter = new ReadAdapter(stories);
                recyclerView.setAdapter(adapter);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(ReadActivity.this, "Something went wrong while loading data from the server.", Toast.LENGTH_LONG).show();
                Log.d("wordsmith", "Load Data Error: "+ error.getMessage());
            }
        });

        //Add the req to the Queue
        Volley.newRequestQueue(this).add(request);
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

