package com.example.resumemaker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ButtonBarLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class CareerLevalActivity extends AppCompatActivity {

    RadioButton radioExperince,radioStudent;

    ImageView imgRight;


    ButtonBarLayout btnSiganup2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_career_leval);
        initview();
    }

    private void initview() {

        radioStudent=findViewById(R.id.radioStudent);
        radioExperince=findViewById(R.id.radioExperince);
        imgRight=findViewById(R.id.imgRight);
        btnSiganup2=findViewById(R.id.btnSiganup2);

        radioStudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(CareerLevalActivity.this, "Student is select", Toast.LENGTH_SHORT).show();
            }
        });

        radioExperince.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(CareerLevalActivity.this, " Experince is select", Toast.LENGTH_SHORT).show();
            }
        });

        imgRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ab = new Intent(CareerLevalActivity.this,CreateResumeActivity.class);
                startActivity(ab);
            }
        });

    }
}