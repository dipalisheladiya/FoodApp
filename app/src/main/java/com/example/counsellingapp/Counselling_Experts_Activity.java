package com.example.counsellingapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Counselling_Experts_Activity extends AppCompatActivity {

    AppCompatButton btnsingup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counselling_experts);
        initview();
    }

    private void initview() {
        btnsingup = findViewById(R.id.btnsingup);

        btnsingup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Counselling_Experts_Activity.this,Sing_Up_Activity.class);
                startActivity(i);
            }
        });
    }
}