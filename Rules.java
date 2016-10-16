package com.bijoy.vibhor.flagquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Rules extends AppCompatActivity {
    public Button b_proceed;


    public void init(){


        b_proceed= (Button)findViewById(R.id.b_proceed);
        b_proceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Rules.this, Q1.class);
                startActivity(toy);
                Rules.this.finish();
            }

        });

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rules);
        init();
    }
}
