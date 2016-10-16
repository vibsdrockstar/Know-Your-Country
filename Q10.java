package com.bijoy.vibhor.flagquiz;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Q10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q10);
        TextView totalScoreTextView = ((TextView)findViewById(R.id.total_score));
        totalScoreTextView.setText(totalScoreTextView.getText() + " " +((FlagQuiz)getApplicationContext()).totalScore);
    }

    public void checkanswer(View v) {
        EditText et7 = (EditText) findViewById(R.id.et10);
        if (et7.getText().toString().trim().toLowerCase().equals("pakistan")) {
            Toast toast = Toast.makeText(Q10.this, "Correct answer +5", Toast.LENGTH_SHORT);
            toast.getView().setBackgroundColor(Color.GREEN);
            toast.show();
            ((FlagQuiz)getApplicationContext()).totalScore += 5;
        } else {
            Toast toast = Toast.makeText(Q10.this, "Incorrect answer O points", Toast.LENGTH_SHORT);
            toast.getView().setBackgroundColor(Color.RED);
            toast.show();        }
        startActivity(new Intent(Q10.this, Q11.class));
        this.finish();
    }
}
