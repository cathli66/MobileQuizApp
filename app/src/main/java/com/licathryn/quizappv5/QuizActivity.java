package com.licathryn.quizappv5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.Chronometer;
import android.widget.TextView;

public class QuizActivity extends AppCompatActivity {
    TextView timer;
    CountDownTimer countdown;
    int timeLeft = 300000; // 5 min in milliseconds

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        timer = findViewById(R.id.timer);
    }
}
