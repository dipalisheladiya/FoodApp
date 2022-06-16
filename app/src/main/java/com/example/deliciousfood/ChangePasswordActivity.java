package com.example.deliciousfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ChangePasswordActivity extends AppCompatActivity {

    TextView txtArrowBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_password);
        initview();
    }

    private void initview() {
        txtArrowBack = findViewById(R.id.txtArrowBack);

        txtArrowBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChangePasswordActivity.this,ProfileActivity.class);
                startActivity(intent);
            }
        });
    }
}