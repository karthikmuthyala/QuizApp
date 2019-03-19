package com.example.quizapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PlantsQuizQuestions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plants_quiz_questions);
        Button plantscore = (Button) findViewById(R.id.finishbutton2);
        plantscore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ini = new Intent(PlantsQuizQuestions.this,Score.class);
                startActivity(ini);
            }
        });

    }
}
