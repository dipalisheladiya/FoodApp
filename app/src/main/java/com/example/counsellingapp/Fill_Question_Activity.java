package com.example.counsellingapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Fill_Question_Activity extends AppCompatActivity {

    AppCompatButton btnNext2;
    TextView txtSkip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fill_question);
        initview();
    }

    private void initview() {
        btnNext2 = findViewById(R.id.btnNext2);
        txtSkip = findViewById(R.id.txtSkip);

        btnNext2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Fill_Question_Activity.this,Counselling_Experts_Activity.class);
                startActivity(i);
            }
        });

        txtSkip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Fill_Question_Activity.this,LoginActivity.class);
                startActivity(i);
            }
        });
    }
}