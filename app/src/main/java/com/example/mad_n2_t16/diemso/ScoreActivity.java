package com.example.mad_n2_t16.diemso;

import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;


import com.example.mad_n2_t16.R;

public class ScoreActivity extends AppCompatActivity {

    ListView lvScore;
    ScoreController scoreController;
    ScoreAdapter scoreAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        scoreController = new ScoreController(ScoreActivity.this);
        lvScore = (ListView) findViewById(R.id.lvScore);
        Cursor cursor = scoreController.getScore();
        scoreAdapter = new ScoreAdapter(ScoreActivity.this, cursor, true);
        lvScore.setAdapter(scoreAdapter);
    }
}