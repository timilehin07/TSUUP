package com.example.myapplicationtest_1;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        //setting up toobar functionality
        Toolbar toolbar3 = findViewById(R.id.toolbar3);
        setSupportActionBar(toolbar3);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("TSuup App"); // Set title for MainActivity
            getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        }

        //instance initialization for UI elements in activity3
        ScrollView scrollView = findViewById(R.id.instructions_scrollView);
        TextView preparation_text = findViewById(R.id.description_heading);
        TextView description_text = findViewById(R.id.description_text);
        Button recipeButton = findViewById(R.id.recipeButton);


        //action to open recipe activity in activity4
        recipeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openYouTube();
            }
        });

    }

    //method to open external link
    private void openYouTube() {
        // This URL will open YouTube in a browser or the YouTube app if installed
        String url = "https://buysoups.com/products/egusi-1?variant=43662678425808";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);
    }
}