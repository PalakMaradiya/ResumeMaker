package com.example.resumemaker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class PersoanlDetailsActivity extends AppCompatActivity {


    String name ,add,email,num;

    AppCompatButton btnSumbit,btnReset;

    ImageView imgBack;
    RadioButton radioExperince,radioStudent;

    TextInputEditText textName,textAddress,textEmail,txtPhoneNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persoanl_details);
        initview();
    }

    private void initview() {
        radioStudent=findViewById(R.id.radioStudent);
        radioExperince=findViewById(R.id.radioExperince);
        textName=findViewById(R.id.textName);
        textAddress=findViewById(R.id.textAddress);
        textEmail=findViewById(R.id.textEmail);
        txtPhoneNumber=findViewById(R.id.txtPhoneNumber);
        imgBack=findViewById(R.id.imgBack);
        btnSumbit=findViewById(R.id.btnSumbit);
        btnReset=findViewById(R.id.btnReset);

        radioStudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(PersoanlDetailsActivity.this, "Student is select", Toast.LENGTH_SHORT).show();
            }
        });

        radioExperince.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(PersoanlDetailsActivity.this, " Experince is select", Toast.LENGTH_SHORT).show();
            }
        });


        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(PersoanlDetailsActivity.this,InformestionActivity.class);
                startActivity(i);
            }
        });



        btnSumbit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                add = textAddress.getText().toString();
                name = textName.getText().toString();
                email = textEmail.getText().toString();
                num = txtPhoneNumber.getText().toString();

                Intent i = new Intent(PersoanlDetailsActivity.this,PrintActicvity.class);
                i.putExtra("name",name);
                i.putExtra("add",add);
                i.putExtra("email",email);
                i.putExtra("num",num);
                startActivity(i);
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textName.setText(null);
                textAddress.setText(null);
                textEmail.setText(null);
                txtPhoneNumber.setText(null);
                radioStudent.setText(null);
                radioExperince.setText(null);


            }
        });




    }
}