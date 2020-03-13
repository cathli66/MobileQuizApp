package com.licathryn.quizappv5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.gson.Gson;

public class ScoresActivity extends AppCompatActivity {

    TextView stats;
    Button restart;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    String playerName;
    int numAnswered;
    int numCorrect;
    long timeLeft;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scores);

        stats = findViewById(R.id.stats);

        sharedPreferences = getSharedPreferences("playerStats", Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
        editor.apply();
        playerName = sharedPreferences.getString("name", "Anonymous");
        timeLeft = sharedPreferences.getLong("time", 0);
        numAnswered = sharedPreferences.getInt("answered", 0);
        numCorrect = sharedPreferences.getInt("correct", 0);
        int min = (int) timeLeft / 60000;
        int sec = (int) timeLeft % 60000 / 1000;
        String timeLeftText = "" + min + ":";
        if(sec < 10) {
            timeLeftText += "0";
        }
        timeLeftText += sec;
        String scoreText = numCorrect + "/5";

        stats.setText(playerName + "\nTime: " + timeLeftText + "\nScore: " + scoreText);

        Gson gson = new Gson();
        Player player = new Player(playerName, numCorrect, timeLeft);
        String json = gson.toJson(player);

        restart = findViewById(R.id.restartButton);
        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstActivity();
            }
        });
    }
    public void firstActivity() {
        Intent intent=new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
