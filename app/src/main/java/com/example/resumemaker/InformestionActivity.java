package com.example.resumemaker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class InformestionActivity extends AppCompatActivity {


    TextView txtPersonaldetails,txtReference,txtEducation,txtExperirnce,txtSkills,txtProject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informestion);
        initview();
    }

    private void initview() {
        txtPersonaldetails = findViewById(R.id.txtPersonaldetails);
        txtReference = findViewById(R.id.txtReference);
        txtEducation = findViewById(R.id.txtEducation);
        txtExperirnce = findViewById(R.id.txtExperirnce);
        txtSkills = findViewById(R.id.txtSkills);
        txtProject = findViewById(R.id.txtProject);

        txtPersonaldetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(InformestionActivity.this,PersoanlDetailsActivity.class);
                startActivity(i);
            }
        });


        txtReference.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(InformestionActivity.this,referenceActivity.class);
                startActivity(i);
            }
        });

        txtEducation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(InformestionActivity.this,eductionActivity.class);
                startActivity(i);
            }
        });

        txtExperirnce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(InformestionActivity.this,ExperineceActivity.class);
                startActivity(i);
            }
        });
        txtSkills.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(InformestionActivity.this,SkillsActivity.class);
                startActivity(i);
            }
        });

        txtProject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(InformestionActivity.this,projectActivity.class);
                startActivity(i);
            }
        });
    }
}