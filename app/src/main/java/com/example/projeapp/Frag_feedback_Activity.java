package com.example.projeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.Toast;

public class Frag_feedback_Activity extends AppCompatActivity {
Button countinue;
LinearLayout feedlayout,ratinglayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frag_feedback_);
        feedlayout=findViewById(R.id.feedbacklayout);
        countinue=findViewById(R.id.feed_getform);
        ratinglayout=findViewById(R.id.ratinglayout);
        countinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               ratinglayout.setVisibility(View.VISIBLE);

            }
        });

    }


}
