package com.htcardone.jokeactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {
    public static final String EXTRA_JOKE = "EXTRA_JOKE";

    private TextView mTextViewJoke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        mTextViewJoke = findViewById(R.id.textView_joke);

        if (getIntent().hasExtra(EXTRA_JOKE)) {
            mTextViewJoke.setText(getIntent().getStringExtra(EXTRA_JOKE));
        }
    }
}
