package com.example.hp.fragmentapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HomeScreen extends AppCompatActivity {
    TextView username;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        username =(TextView)  findViewById(R.id.DisplayUsername);
        String name = getIntent().getStringExtra("User");
        username.setText("Hai "+name+" :)");

    }
}
