package com.example.instagram;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // new thread that waits 2s, allowing main (UI) thread to do other stuff
        // starting new thread and finishing thread is done ONLY by UI thread
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                startActivity(new Intent (SplashScreen.this, LoginActivity.class));
                finish();
            }
        }, 1000);
    }
}