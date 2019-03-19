package com.example.quizapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FlagQuizQuestions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flag_quiz_questions);
        Button flagscore = (Button) findViewById(R.id.finishbutton2);

        flagscore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ini = new Intent(FlagQuizQuestions.this,Score.class);
                startActivity(ini);
            }
        });
    }
}
