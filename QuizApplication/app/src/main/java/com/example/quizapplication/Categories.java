package com.example.quizapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Categories extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);
        Button flag = (Button) findViewById(R.id.button1);
        Button animals = (Button) findViewById(R.id.button2);
        Button plants = (Button) findViewById(R.id.button3);
        TextView tv=(TextView)findViewById(R.id.textView2);
        Intent ini1=getIntent();
        String nameValue="Hi "+ini1.getStringExtra("name")+" !";
        tv.setText(nameValue);
        flag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ini = new Intent(Categories.this,FlagQuizQuestions.class);
                startActivity(ini);
            }
        });
        animals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ini = new Intent(Categories.this,AnimalsQuizQuestions.class);
                startActivity(ini);
            }
        });
        plants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ini = new Intent(Categories.this,PlantsQuizQuestions.class);
                startActivity(ini);
            }
        });


    }
}
