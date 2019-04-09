package app.psychic.activities;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import app.psychic.R;
import app.psychic.databinding.ActivityScoreBinding;
import app.psychic.models.Answer;
import app.psychic.models.Question;
import app.psychic.utils.Constants;

public class ScoreActivity extends AppCompatActivity {

    ActivityScoreBinding binding;
    private float score;
    private String type;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_score);

        type = getIntent().getStringExtra("type");
        //score = getIntent().getFloatExtra("score", 0.0f);
        binding.score.setText(String.format("%s", MainActivity.score));

        binding.overview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getBaseContext(), MainActivity.class);
                intent.putExtra("type", Constants.selectedSet);
                intent.putExtra("overview", "true");
                intent.putExtra("examId", Constants.examId);
                startActivity(intent);
                finish();
            }
        });

        binding.retake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getBaseContext(), MainActivity.class);
                intent.putExtra("type", Constants.selectedSet);
                intent.putExtra("examId", Constants.examId);
                startActivity(intent);
                //finish();
            }
        });

        binding.statistics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getBaseContext(), StatisticsActivity.class);
                intent.putExtra("type", Constants.selectedSet);
                intent.putExtra("examId", Constants.examId);
                startActivity(intent);
                //finish();
            }
        });


    }


    private int getRandom(int high) {
        return (int) Math.round(Math.random() * (high));
    }
}
