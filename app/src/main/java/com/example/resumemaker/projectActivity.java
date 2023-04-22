package com.example.resumemaker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.android.material.textfield.TextInputEditText;

public class projectActivity extends AppCompatActivity {


    ImageView imgback;
    TextInputEditText textTitle,textDescripition;


    AppCompatButton btnLogin,btnSumbit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project);
        initview();
    }

    private void initview() {
        textTitle = findViewById(R.id.textTitle);
        textDescripition = findViewById(R.id.textDescripition);
        btnLogin = findViewById(R.id.btnLogin);
        btnSumbit = findViewById(R.id.btnSumbit);
        imgback = findViewById(R.id.imgback);

        String title = textTitle.getText().toString();
        String Descripition = textDescripition.getText().toString();

        btnSumbit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(projectActivity.this,PrintActicvity.class);
                i.putExtra("title",title);
                i.putExtra("Descripition",Descripition);
                startActivity(i);
            }
        });

        imgback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(projectActivity.this,InformestionActivity.class);
                startActivity(i);
            }
        });


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textTitle.setText(null);
                textDescripition.setText(null);

            }
        });


    }
}