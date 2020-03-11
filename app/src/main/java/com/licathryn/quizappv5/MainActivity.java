package com.licathryn.quizappv5;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView welcome;
    Button start;
    EditText name;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sharedPreferences = getSharedPreferences("playerStats", Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
        editor.apply();

        welcome = findViewById(R.id.welcomeText);
        name = findViewById(R.id.nameResponse);
        start = findViewById(R.id.startButton);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String playerName = name.getText().toString();
                if(playerName.equals("")) {
                    playerName = "Anonymous";
                }
                editor.putString("name", playerName);
                editor.apply();
                startQuiz();
            }
        });
    }

    public void startQuiz() {
        Intent intent=new Intent(this, QuizActivity.class);
        startActivity(intent);
    }
}