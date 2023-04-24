package com.example.resumemaker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.android.material.textfield.TextInputEditText;

public class eductionActivity extends AppCompatActivity {

    ImageView imgback;

    TextInputEditText txtCourse, textSchool, textGrade, textYear;

    AppCompatButton btnReset, btnSumbit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eduction);
        initview();
    }

    private void initview() {


        textYear=findViewById(R.id.textYear);
        txtCourse=findViewById(R.id.txtCourse);
        textSchool=findViewById(R.id.textSchool);
        textGrade=findViewById(R.id.textGrade);
        imgback=findViewById(R.id.imgback);
        btnSumbit=findViewById(R.id.btnSumbit);
        btnReset=findViewById(R.id.btnReset);



        btnSumbit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String year = textYear.getText().toString();
                String Course = txtCourse.getText().toString();
                String School = textSchool.getText().toString();
                String Grade = textGrade.getText().toString();
                Intent i = new Intent(eductionActivity.this, PrintActicvity.class);
                i.putExtra("year",year);
                i.putExtra("Course",Course);
                i.putExtra("School",School);
                i.putExtra("Grade",Grade);
                startActivity(i);
            }
        });


        imgback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(eductionActivity.this, InformestionActivity.class);
                startActivity(i);
            }
        });


        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textYear.setText(null);
                txtCourse.setText(null);
                textSchool.setText(null);
                textGrade.setText(null);

            }

        });
    }
}