package com.example.deliciousfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class BurgerActivity extends AppCompatActivity {

    TextView txtSetting;
    CircleImageView imgProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burger);
        initview();
    }

    private void initview() {
        txtSetting = findViewById(R.id.txtSetting);
        imgProfile = findViewById(R.id.imgProfile);

        imgProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BurgerActivity.this,ProfileActivity.class);
                startActivity(intent);
            }
        });

        txtSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BurgerActivity.this,OrderDetailsActivity.class);
                startActivity(intent);
            }
        });
    }
}