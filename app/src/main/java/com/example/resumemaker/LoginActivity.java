package com.example.resumemaker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

import java.util.ArrayList;
import java.util.List;

public class LoginActivity extends AppCompatActivity {


    Spinner spinner;

    ImageView imgBack;

    AppCompatButton btnlogin;

    TextInputEditText  txtEmail , textPassword;

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
                Intent i = new Intent(LoginActivity.this,SplashActivity2.class);
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


                String  email = txtEmail.getText().toString();
                String password = textPassword.getText().toString();

                if(email.isEmpty())
                {
                    Toast.makeText(LoginActivity.this, "Please Enter Your Emial", Toast.LENGTH_SHORT).show();
                }
                else if (password.isEmpty())
                {
                    Toast.makeText(LoginActivity.this, "Please Enter Your Phone Number", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(LoginActivity.this, "Login Successfully", Toast.LENGTH_SHORT).show();

                    Intent i = new Intent(LoginActivity.this,CreateResumeActivity.class);
                    startActivity(i);
                }

            }
        });
    }
}