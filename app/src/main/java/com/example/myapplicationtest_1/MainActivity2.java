package com.example.myapplicationtest_1;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.bumptech.glide.Glide;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //setting toolbar functionality
        Toolbar toolbar2 = findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar2);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("TSuup App"); // Set title for MainActivity
            getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        }

        //creating instaces of each UI element in activity2
        ImageView imageView = findViewById(R.id.egusiImage);
        TextView ingredient_text = findViewById(R.id.Ingredients);
        TextView ingredient_list = findViewById(R.id.ingredient_list);
        ScrollView scrollView = findViewById(R.id.ingredient_scroll);
        Button button = findViewById(R.id.method_button);

        //GLIDE dependency to load image from internet
        Glide.with(this)
                .load("https://thumbs.dreamstime.com/b/egusi-soup-nigerian-cuisine-isolated-white-background-62743439.jpg")
                .into(imageView);

        //button to open preparation activity
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(intent);
            }
        });


    }
}