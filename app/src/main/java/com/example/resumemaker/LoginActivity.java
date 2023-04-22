package com.example.resumemaker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class LoginActivity extends AppCompatActivity {


    Spinner spinner;

    ImageView imgBack;

    AppCompatButton btnlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initview();
    }

    private void initview() {

        imgBack=findViewById(R.id.imgBack);

        spinner = findViewById(R.id.spinner) ;

        btnlogin = findViewById(R.id.btnlogin) ;

        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(LoginActivity.this,CareerLevalActivity.class);
                startActivity(i);
            }
        });



        List<String> categories = new ArrayList<String>();
        categories.add("    English");
        categories.add("    Hindi ");
        categories.add("    Russia");
        categories.add("    Malaysiya(Malay)");
        categories.add("    Indonesia(Bahasa)");

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);

        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(dataAdapter);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(LoginActivity.this,CreateResumeActivity.class);
                startActivity(i);
            }
        });
    }
}