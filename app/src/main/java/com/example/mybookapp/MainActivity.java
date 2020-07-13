package com.example.mybookapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startup);
    }

    public void OnButtonClick(View view) {
        Intent intent = new Intent(this, LoginPageActivity.class);
        startActivity(intent);
    }

}
