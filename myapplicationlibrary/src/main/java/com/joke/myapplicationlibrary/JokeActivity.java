package com.joke.myapplicationlibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        String jokeText = getIntent().getStringExtra(Intent.EXTRA_TEXT);
        TextView jokeTextView = findViewById(R.id.textViewJoke);
        jokeTextView.setText(jokeText);
    }
}
