package com.example.resumemaker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.android.material.textfield.TextInputEditText;

public class SkillsActivity extends AppCompatActivity {


    ImageView imgback;
    TextInputEditText textskils;
    AppCompatButton btnReset,btnSumbit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skills);
        initview();
    }

    private void initview() {
        textskils = findViewById(R.id.textskils);
        btnReset = findViewById(R.id.btnReset);
        btnSumbit = findViewById(R.id.btnSumbit);
        imgback = findViewById(R.id.imgback);




        btnSumbit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String skils = textskils.getText().toString();
                Intent i = new Intent(SkillsActivity.this,PrintActicvity.class);
                i.putExtra("skils",skils);
                startActivity(i);
            }
        });


        imgback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SkillsActivity.this,InformestionActivity.class);
                startActivity(i);
            }
        });


        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textskils.setText(null);

            }
        });
    }
}