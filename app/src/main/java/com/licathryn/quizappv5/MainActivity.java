package com.licathryn.quizappv5;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView welcome;
    Button start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        welcome = findViewById(R.id.welcomeText);
        start = findViewById(R.id.startButton);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startQuiz();
            }
        });
    }

    public void startQuiz() {
        Intent intent=new Intent(this, QuizActivity.class);
        startActivity(intent);
    }
}