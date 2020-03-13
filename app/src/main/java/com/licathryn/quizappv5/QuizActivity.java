package com.licathryn.quizappv5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.gson.Gson;


public class QuizActivity extends AppCompatActivity {
    TextView timer;
    CountDownTimer countdown;
    Button q1c1;
    Button q1c2;
    Button q1c3;
    Button q1c4;
    Button q2c1;
    Button q2c2;
    Button q2c3;
    Button q2c4;
    Button q3c1;
    Button q3c2;
    Button q3c3;
    Button q3c4;
    Button q4c1;
    Button q4c2;
    Button q4c3;
    Button q4c4;
    Button q5c1;
    Button q5c2;
    Button q5c3;
    Button q5c4;
    Button finished;

    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    int numCorrect = 0;
    int numAnswered = 0;
    long timeLeft = 60000; // 1 min in milliseconds

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

//        Gson gson = new Gson();
        sharedPreferences = getSharedPreferences("playerStats", Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
        editor.apply();

        q1c1 = findViewById(R.id.q1c1);
        q1c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                q1c1.setClickable(false);
                q1c1.setBackgroundColor(Color.GREEN);
                q1c2.setClickable(false);
                q1c3.setClickable(false);
                q1c4.setClickable(false);
                numCorrect++;
                numAnswered++;
            }
        });
        q1c2 = findViewById(R.id.q1c2);
        q1c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                q1c1.setClickable(false);
                q1c1.setBackgroundColor(Color.GREEN);
                q1c2.setClickable(false);
                q1c2.setBackgroundColor(Color.RED);
                q1c3.setClickable(false);
                q1c4.setClickable(false);
                numAnswered++;
            }
        });
        q1c3 = findViewById(R.id.q1c3);
        q1c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                q1c1.setClickable(false);
                q1c1.setBackgroundColor(Color.GREEN);
                q1c2.setClickable(false);
                q1c3.setClickable(false);
                q1c3.setBackgroundColor(Color.RED);
                q1c4.setClickable(false);
                numAnswered++;
            }
        });
        q1c4 = findViewById(R.id.q1c4);
        q1c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                q1c1.setClickable(false);
                q1c1.setBackgroundColor(Color.GREEN);
                q1c2.setClickable(false);
                q1c3.setClickable(false);
                q1c4.setClickable(false);
                q1c4.setBackgroundColor(Color.RED);
                numAnswered++;
            }
        });
        q2c1 = findViewById(R.id.q2c1);
        q2c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                q2c1.setClickable(false);
                q2c1.setBackgroundColor(Color.RED);
                q2c2.setClickable(false);
                q2c3.setClickable(false);
                q2c3.setBackgroundColor(Color.GREEN);
                q2c4.setClickable(false);
                numAnswered++;
            }
        });
        q2c2 = findViewById(R.id.q2c2);
        q2c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                q2c1.setClickable(false);
                q2c2.setClickable(false);
                q2c2.setBackgroundColor(Color.RED);
                q2c3.setClickable(false);
                q2c3.setBackgroundColor(Color.GREEN);
                q2c4.setClickable(false);
                numAnswered++;
            }
        });
        q2c3 = findViewById(R.id.q2c3);
        q2c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                q2c1.setClickable(false);
                q2c2.setClickable(false);
                q2c3.setClickable(false);
                q2c3.setBackgroundColor(Color.GREEN);
                q2c4.setClickable(false);
                numCorrect++;
                numAnswered++;
            }
        });
        q2c4 = findViewById(R.id.q2c4);
        q2c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                q2c1.setClickable(false);
                q2c2.setClickable(false);
                q2c3.setClickable(false);
                q2c3.setBackgroundColor(Color.GREEN);
                q2c4.setClickable(false);
                q2c4.setBackgroundColor(Color.RED);
                numAnswered++;
            }
        });
        q3c1 = findViewById(R.id.q3c1);
        q3c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                q3c1.setClickable(false);
                q3c1.setBackgroundColor(Color.RED);
                q3c2.setClickable(false);
                q3c3.setClickable(false);
                q3c3.setBackgroundColor(Color.GREEN);
                q3c4.setClickable(false);
                numAnswered++;
            }
        });
        q3c2 = findViewById(R.id.q3c2);
        q3c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                q3c1.setClickable(false);
                q3c2.setClickable(false);
                q3c2.setBackgroundColor(Color.RED);
                q3c3.setClickable(false);
                q3c3.setBackgroundColor(Color.GREEN);
                q3c4.setClickable(false);
                numAnswered++;
            }
        });
        q3c3 = findViewById(R.id.q3c3);
        q3c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                q3c1.setClickable(false);
                q3c2.setClickable(false);
                q3c3.setClickable(false);
                q3c3.setBackgroundColor(Color.GREEN);
                q3c4.setClickable(false);
                numCorrect++;
                numAnswered++;
            }
        });
        q3c4 = findViewById(R.id.q3c4);
        q3c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                q3c1.setClickable(false);
                q3c2.setClickable(false);
                q3c3.setClickable(false);
                q3c3.setBackgroundColor(Color.GREEN);
                q3c4.setClickable(false);
                q3c4.setBackgroundColor(Color.RED);
                numAnswered++;
            }
        });
        q4c1 = findViewById(R.id.q4c1);
        q4c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                q4c1.setClickable(false);
                q4c1.setBackgroundColor(Color.RED);
                q4c2.setClickable(false);
                q4c2.setBackgroundColor(Color.GREEN);
                q4c3.setClickable(false);
                q4c4.setClickable(false);
                numAnswered++;
            }
        });
        q4c2 = findViewById(R.id.q4c2);
        q4c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                q4c1.setClickable(false);
                q4c2.setClickable(false);
                q4c2.setBackgroundColor(Color.GREEN);
                q4c3.setClickable(false);
                q4c4.setClickable(false);
                numCorrect++;
                numAnswered++;
            }
        });
        q4c3 = findViewById(R.id.q4c3);
        q4c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                q4c1.setClickable(false);
                q4c2.setClickable(false);
                q4c2.setBackgroundColor(Color.GREEN);
                q4c3.setClickable(false);
                q4c3.setBackgroundColor(Color.RED);
                q4c4.setClickable(false);
                numAnswered++;
            }
        });
        q4c4 = findViewById(R.id.q4c4);
        q4c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                q4c1.setClickable(false);
                q4c2.setClickable(false);
                q4c2.setBackgroundColor(Color.GREEN);
                q4c3.setClickable(false);
                q4c4.setClickable(false);
                q4c4.setBackgroundColor(Color.RED);
                numAnswered++;
            }
        });
        q5c1 = findViewById(R.id.q5c1);
        q5c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                q5c1.setClickable(false);
                q5c1.setBackgroundColor(Color.RED);
                q5c2.setClickable(false);
                q5c3.setClickable(false);
                q5c4.setClickable(false);
                q5c4.setBackgroundColor(Color.GREEN);
                numAnswered++;
            }
        });
        q5c2 = findViewById(R.id.q5c2);
        q5c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                q5c1.setClickable(false);
                q5c2.setClickable(false);
                q5c2.setBackgroundColor(Color.RED);
                q5c3.setClickable(false);
                q5c4.setClickable(false);
                q5c4.setBackgroundColor(Color.GREEN);
                numAnswered++;
            }
        });
        q5c3 = findViewById(R.id.q5c3);
        q5c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                q5c1.setClickable(false);
                q5c2.setClickable(false);
                q5c3.setClickable(false);
                q5c3.setBackgroundColor(Color.RED);
                q5c4.setClickable(false);
                q5c4.setBackgroundColor(Color.GREEN);
                numAnswered++;
            }
        });
        q5c4 = findViewById(R.id.q5c4);
        q5c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                q5c1.setClickable(false);
                q5c2.setClickable(false);
                q5c3.setClickable(false);
                q5c4.setClickable(false);
                q5c4.setBackgroundColor(Color.GREEN);
                numCorrect++;
                numAnswered++;
            }
        });

        finished = findViewById(R.id.finished);
        finished.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(numAnswered == 5) {
                    editor.putLong("time", timeLeft);
                    editor.putInt("correct", numCorrect);
                    editor.putInt("answered", numAnswered);
                    editor.apply();
                    nextActivity();
                }
            }
        });

        timer = findViewById(R.id.timer);
        startTimer();
    }

    public void startTimer() {
        countdown = new CountDownTimer(timeLeft, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                timeLeft = millisUntilFinished;
                updateTimer();
            }

            @Override
            public void onFinish() {
                editor.putLong("time", 0);
                editor.putInt("correct", numCorrect);
                editor.putInt("answered", numAnswered);
                editor.apply();
                nextActivity();
            }
        }.start();
    }
    public void updateTimer() {
        int min = (int) timeLeft / 60000;
        int sec = (int) timeLeft % 60000 / 1000;

        String timeLeftText = "" + min + ":";
        if(sec < 10) {
            timeLeftText += "0";
        }
        timeLeftText += sec;

        timer.setText(timeLeftText);
    }
    public void nextActivity() {
        Intent intent=new Intent(this, ScoresActivity.class);
        startActivity(intent);
    }
}
