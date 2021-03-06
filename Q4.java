package com.bijoy.vibhor.flagquiz;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Q4 extends AppCompatActivity {

    EditText et4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q4);
        TextView totalScoreTextView = ((TextView)findViewById(R.id.total_score));
        totalScoreTextView.setText(totalScoreTextView.getText() + " " +((FlagQuiz)getApplicationContext()).totalScore);
    }

    public void checkanswer(View v) {
        EditText et4 = (EditText) findViewById(R.id.et4);
        if (et4.getText().toString().trim().toLowerCase().equals("spain")) {
            Toast toast = Toast.makeText(Q4.this, "Correct answer +5", Toast.LENGTH_SHORT);
            toast.getView().setBackgroundColor(Color.GREEN);
            toast.show();
            ((FlagQuiz)getApplicationContext()).totalScore += 5;
        } else {
            Toast toast = Toast.makeText(Q4.this, "Incorrect answer O points", Toast.LENGTH_SHORT);
            toast.getView().setBackgroundColor(Color.RED);
            toast.show();
        }
        startActivity(new Intent(Q4.this, Q5.class));
        this.finish();
    }

}
