package com.example.resumemaker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.android.material.textfield.TextInputEditText;

public class referenceActivity extends AppCompatActivity {


    ImageView imgBack;

    AppCompatButton btnSumbit,btnReset;

    TextInputEditText textrefName,textjobTitle,textcompanyName,text,txtPhoneNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reference);
        initview();
    }

    private void initview() {
        textrefName = findViewById(R.id.textrefName);
        textjobTitle = findViewById(R.id.textjobTitle);
        textcompanyName = findViewById(R.id.textcompanyName);
        text = findViewById(R.id.text);
        txtPhoneNumber = findViewById(R.id.txtPhoneNumber);
        btnSumbit = findViewById(R.id.btnSumbit);
        imgBack = findViewById(R.id.imgBack);
        btnReset = findViewById(R.id.btnReset);



        btnSumbit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String refname = textrefName.getText().toString();
                String title = textjobTitle.getText().toString();
                String comname = textcompanyName.getText().toString();
                String email = text.getText().toString();
                String number = txtPhoneNumber.getText().toString();
                Intent i = new Intent(referenceActivity.this,PrintActicvity.class);
                i.putExtra("refname",refname);
                i.putExtra("title",title);
                i.putExtra("comname",comname);
                i.putExtra("email",email);
                i.putExtra("number",number);
                startActivity(i);
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textrefName.setText(null);
                textjobTitle.setText(null);
                textcompanyName.setText(null);
                text.setText(null);
                txtPhoneNumber.setText(null);

            }
        });


        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(referenceActivity.this,InformestionActivity.class);
                startActivity(i);
            }
        });
    }
}