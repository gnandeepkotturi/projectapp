package com.example.projeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Feedbackform extends AppCompatActivity {
LinearLayout rlayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedbackform);
        rlayout=findViewById(R.id.ratinglayout);
    }

    public void getform(View view) {
        rlayout.setVisibility(View.VISIBLE);
    }
}
