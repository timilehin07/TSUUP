package com.example.myapplicationtest_1;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class splash_screen extends AppCompatActivity {

    private static final int SPLASH_DISPLAY_LENGTH = 4000; // Duration of splash screen in milliseconds (4 seconds)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Start main activity after the splash screen duration
                Intent mainIntent = new Intent(splash_screen.this, MainActivity.class);
                startActivity(mainIntent);
                finish(); // Close splash activity
            }
        }, SPLASH_DISPLAY_LENGTH);
    }
}