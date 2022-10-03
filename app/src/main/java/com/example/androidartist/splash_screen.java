package com.example.androidartist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class splash_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Intent intent = getIntent();
        String choice = intent.getStringExtra("CHOICE");

        int secondsDelayed = 3;
        new Handler().postDelayed(new Runnable() {
            public void run() {
                if(choice.equals("1")){
                    startActivity(new Intent(splash_screen.this, Quest1.class));
                    finish();
                }
            }
        }, secondsDelayed * 1000);
    }
}