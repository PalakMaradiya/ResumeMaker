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
    AppCompatButton btnLogin,btnSumbit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skills);
        initview();
    }

    private void initview() {
        textskils = findViewById(R.id.textskils);
        btnLogin = findViewById(R.id.btnLogin);
        btnSumbit = findViewById(R.id.btnSumbit);

        String skils = textskils.getText().toString();


        btnSumbit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
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


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textskils.setText(null);

            }
        });
    }
}