package com.example.resumemaker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.android.material.textfield.TextInputEditText;

public class ExperineceActivity extends AppCompatActivity {


    ImageView imgback;
    AppCompatButton btnReset, btnSumbit;

    TextInputEditText textCompanyName, textJob, textstartDate, txtEbdDate, txtdetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_experinece);
        initview();
    }

    private void initview() {
        btnReset = findViewById(R.id.btnReset);
        btnSumbit = findViewById(R.id.btnSumbit);
        textCompanyName = findViewById(R.id.textCompanyName);
        textJob = findViewById(R.id.textJob);
        textstartDate = findViewById(R.id.textstartDate);
        txtEbdDate = findViewById(R.id.txtEbdDate);
        txtdetails = findViewById(R.id.txtdetails);


        String Cname = textCompanyName.getText().toString();
        String job = textJob.getText().toString();
        String sDate = textstartDate.getText().toString();
        String Edate = txtEbdDate.getText().toString();
        String Details = txtdetails.getText().toString();

        btnSumbit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ExperineceActivity.this, PrintActicvity.class);
                i.putExtra("Cname", Cname);
                i.putExtra("job", job);
                i.putExtra("sDate", sDate);
                i.putExtra("Edate", Edate);
                i.putExtra("Details", Details);
                startActivity(i);
            }
        });


        imgback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ExperineceActivity.this, InformestionActivity.class);
                startActivity(i);
            }
        });


        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textCompanyName.setText(null);
                textJob.setText(null);
                textstartDate.setText(null);
                txtEbdDate.setText(null);
                txtdetails.setText(null);

            }
        });
    }
}