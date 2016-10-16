package com.bijoy.vibhor.flagquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SubmitActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submit);
        TextView totalScoreTextView = ((TextView)findViewById(R.id.total_score));
        totalScoreTextView.setText(totalScoreTextView.getText() + " " +((FlagQuiz)getApplicationContext()).totalScore);
    }
}
