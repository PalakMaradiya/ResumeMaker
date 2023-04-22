package com.example.resumemaker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class CreateResumeActivity extends AppCompatActivity {

    TextInputEditText textFirstname;

    TextView textname;

    CardView CardView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_resume);
        initview();
    }

    private void initview() {
        textname = findViewById(R.id.textname);


        if (getIntent()!=null)
        {

            String name = getIntent().getStringExtra("fname");
            textname.setText(name);
        }

        CardView = findViewById(R.id.CardView);
        CardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(CreateResumeActivity.this,InformestionActivity.class);
                startActivity(i);
            }
        });
    }
}