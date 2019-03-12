package com.example.quizapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AnimalsQuizQuestions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animals_quiz_questions);
        Button Animalscore = (Button) findViewById(R.id.finishbutton2);
        Animalscore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ini = new Intent(AnimalsQuizQuestions.this,Score.class);
                startActivity(ini);
            }
        });
    }
}
