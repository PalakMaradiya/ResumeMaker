package com.example.resumemaker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class SplashActivity2 extends AppCompatActivity {

    Spinner spinner;
    AppCompatButton btnSignup,btnLogin;
    ImageView imgGoogle,imgfacebook;

    String [] language = {"English","Hindi","Russia","Malaysiya(Malay)","Indonesia(Bahasa)"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash2);
        initview();
    }

    private void initview() {
        spinner = findViewById(R.id.spinner) ;
        imgfacebook= findViewById(R.id.imgfacebook);
        imgGoogle= findViewById(R.id.imgGoogle);
        btnSignup= findViewById(R.id.btnSignup);
        btnLogin= findViewById(R.id.btnLogin);



        List<String> categories = new ArrayList<String>();
        categories.add("    English");
        categories.add("    Hindi ");
        categories.add("    Russia");
        categories.add("    Malaysiya(Malay)");
        categories.add("    Indonesia(Bahasa)");

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);

        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(dataAdapter);
        imgGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://www.goggle.com";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        imgfacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.facebook.com/";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

      btnSignup.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              Intent i = new Intent(SplashActivity2.this,SignupActivity.class);
              startActivity(i);
          }
      });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SplashActivity2.this,LoginActivity.class);
                startActivity(i);
            }
        });
        
    }
}