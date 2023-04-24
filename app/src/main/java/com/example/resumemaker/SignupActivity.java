package com.example.resumemaker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import java.util.ArrayList;
import java.util.List;

public class SignupActivity extends AppCompatActivity {

    ImageView imgBack;
    String fname,lastname,email,phonenumber,password;

    TextView textname;
    AppCompatButton  btnSiganup2;

    Spinner spinner;

    TextInputEditText textFirstname,txtLastname,txtEmail,txtPhoneNumber,txtpassWord;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        initview();
    }

    private void initview() {


        spinner = findViewById(R.id.spinner) ;

        List<String> categories = new ArrayList<String>();
        categories.add("    English");
        categories.add("    Hindi ");
        categories.add("    Russian");
        categories.add("    Malaysiya(Malay)");
        categories.add("    Indonesia(Bahasa)");

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);

        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(dataAdapter);
        imgBack=findViewById(R.id.imgBack) ;
        textname=findViewById(R.id.textname) ;
        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SignupActivity.this,SplashActivity2.class);
                startActivity(i);
            }
        });


        btnSiganup2=findViewById(R.id.btnSiganup2);
        btnSiganup2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SignupActivity.this,LoginActivity.class);
                startActivity(i);
            }
        });

        textFirstname=findViewById(R.id.textFirstname);
        txtLastname=findViewById(R.id.txtLastname);
        textname=findViewById(R.id.textname);
        txtEmail=findViewById(R.id.txtEmail);
        txtPhoneNumber=findViewById(R.id.txtPhoneNumber);
        txtpassWord=findViewById(R.id.txtpassWord);
        btnSiganup2=findViewById(R.id.btnSiganup2);

        btnSiganup2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {




                fname = textFirstname.getText().toString();
                lastname = txtLastname.getText().toString();
                email = txtEmail.getText().toString();
                phonenumber = txtPhoneNumber.getText().toString();
                password = txtpassWord.getText().toString();


                 if(fname.isEmpty())
                {
                    Toast.makeText(SignupActivity.this, "Please Enter Your First Name ", Toast.LENGTH_SHORT).show();
                }

                else  if(lastname.isEmpty())
                {
                    Toast.makeText(SignupActivity.this, "Please Enter Your Last Name ", Toast.LENGTH_SHORT).show();
                }
                else if(email.isEmpty())
                {
                    Toast.makeText(SignupActivity.this, "Please Enter Your Email Name ", Toast.LENGTH_SHORT).show();
                }
                else if (phonenumber.isEmpty())
                {
                    Toast.makeText(SignupActivity.this, "Please Enter Your Phone Number Name ", Toast.LENGTH_SHORT).show();
                }
                else if(password.isEmpty())
                {
                    Toast.makeText(SignupActivity.this, "Please Enter Your Password Name ", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(SignupActivity.this, "Your Account cerate Succefully ", Toast.LENGTH_SHORT).show();



                    Intent intent = new Intent(SignupActivity.this,CreateResumeActivity.class);
                    intent.putExtra("fname",fname);
                     startActivity(intent);
                }
            }
        });




    }
}