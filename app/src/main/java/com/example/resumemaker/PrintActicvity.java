package com.example.resumemaker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class PrintActicvity extends AppCompatActivity {


    TextView FName,Add,Pnum,Email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_print_acticvity);
        initview();
    }

    private void initview() {
        FName = findViewById( R.id .FName);
        Add = findViewById( R.id .Add);
        Pnum = findViewById( R.id .Pnum);
        Email = findViewById( R.id .Email);

        if(getIntent()!= null)
        {
           String fname = getIntent().getStringExtra("name");
           String address = getIntent().getStringExtra("add");
           String phonenumber = getIntent().getStringExtra("num");
           String emi = getIntent().getStringExtra("emi");
            FName.setText(fname);
            Add.setText(address);
            Pnum.setText(phonenumber);
            Email.setText(emi);

        }
    }
}