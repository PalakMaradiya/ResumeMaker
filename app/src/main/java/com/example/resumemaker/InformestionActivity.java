package com.example.resumemaker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class InformestionActivity extends AppCompatActivity {


    ImageView imagback;
    CardView txtReference,txtEducation,txtExperirnce,txtSkills,txtProject;

    TextView  txtPersonaldetails;

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
        imagback = findViewById(R.id.imagback);

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
                Intent j = new Intent(InformestionActivity.this,referenceActivity.class);
                startActivity(j);
            }
        });

        txtEducation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(InformestionActivity.this,eductionActivity.class);
                startActivity(a);
            }
        });

        txtExperirnce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b = new Intent(InformestionActivity.this,ExperineceActivity.class);
                startActivity(b);
            }
        });

        txtSkills.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent c  = new Intent(InformestionActivity.this,SkillsActivity.class);
                startActivity(c);
            }
        });

        txtProject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent d = new Intent(InformestionActivity.this,projectActivity.class);
                startActivity(d);
            }
        });



        imagback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent e = new Intent(InformestionActivity.this,CreateResumeActivity.class);
                startActivity(e);
            }
        });
    }
}