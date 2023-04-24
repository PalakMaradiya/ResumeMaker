package com.example.resumemaker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class PrintActicvity extends AppCompatActivity {


    TextView txtname,Add,Pnum,Email,txtRefName,textjobTitle,textCname,textGrade,textSchool,textCourse,textYear,textSkills
              ,textTitle,textDescersption;


    TextView  textcomName,textjob , textstartDate , txtEndDate , txtdeatails;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_print_acticvity);
        initview();
    }

    private void initview() {
        txtname = findViewById( R.id .txtname);
        Add = findViewById( R.id .Add);
        Pnum = findViewById( R.id .Pnum);
        Email = findViewById( R.id .Email);
        txtRefName = findViewById( R.id .txtRefName);
        textjobTitle = findViewById( R.id .textjobTitle);
        textCname = findViewById( R.id .textCname);
        textGrade = findViewById( R.id .textGrade);
        textSchool = findViewById( R.id .textSchool);
        textCourse = findViewById( R.id .textCourse);
        textYear = findViewById( R.id .textYear);
        textcomName = findViewById( R.id .textcomName);
        textjob = findViewById( R.id .textjob);
        textstartDate = findViewById( R.id .textstartDate);
        txtEndDate = findViewById( R.id .txtEndDate);
        txtdeatails = findViewById( R.id .txtdeatails);
        textSkills = findViewById( R.id .textSkills);
        textDescersption = findViewById( R.id .textDescersption);
        textTitle = findViewById( R.id .textTitle);

        if(getIntent()!= null)
        {
           String name = getIntent().getStringExtra("name");
           String address = getIntent().getStringExtra("add");
           String phonenumber = getIntent().getStringExtra("num");
           String emi = getIntent().getStringExtra("email");
           String reference = getIntent().getStringExtra("refname");
           String title = getIntent().getStringExtra("title");
           String comName = getIntent().getStringExtra("comname");
           String school = getIntent().getStringExtra("School");
           String Grade = getIntent().getStringExtra("Grade");
           String year = getIntent().getStringExtra("year");
           String course = getIntent().getStringExtra("Course");
           String Comname = getIntent().getStringExtra("Cname");
           String job = getIntent().getStringExtra("job");
           String sDate = getIntent().getStringExtra("sDate");
           String EDate = getIntent().getStringExtra("Edate");
           String Deatails = getIntent().getStringExtra("Details");
           String skils = getIntent().getStringExtra("skils");
           String descripition = getIntent().getStringExtra("Details");
           String Title = getIntent().getStringExtra("Details");

            txtname.setText(name);
            Add.setText(address);
            Pnum.setText(phonenumber);
            Email.setText(emi);
            txtRefName.setText(reference);
            textjobTitle.setText(title);
            textCname.setText(comName);
            textGrade.setText(Grade);
            textSchool.setText(school);
            textCourse.setText(course);
            textYear.setText(year);
            textcomName.setText(Comname);
            textjob.setText(job);
            textstartDate.setText(sDate);
            txtEndDate.setText(EDate);
            txtdeatails.setText(Deatails);
            textSkills.setText(skils);
            textTitle.setText(Title);
            textDescersption.setText(descripition);

        }
    }
}