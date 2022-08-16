package com.example.hw22;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main2);

        TextView cong    = findViewById(R.id.cong);
        TextView welcome = findViewById(R.id.welcomep);
        EditText name    = findViewById(R.id.name2);
        EditText age2    = findViewById(R.id.age2);
        EditText phone2  = findViewById(R.id.phone2);
        EditText email2  = findViewById(R.id.email2);
        EditText job2    = findViewById(R.id.job2);
        //////////////////////////////***********************///////////////////////////////

        String nam22 ;
        int age22;
        int phone22;
        String job22;
        String email22;


        nam22=getIntent().getStringExtra("item1");
        age22=getIntent().getIntExtra("item2",0);
        phone22=getIntent().getIntExtra("item3",0);
        email22=getIntent().getStringExtra("item4");
        job22 = getIntent().getStringExtra("item5");


        //////////////////////////////***********************///////////////////////////////

        name.setText(" your name is "+nam22);
        age2.setText("your age is :"+age22);
        phone2.setText("your number is "+phone22);
        job2.setText("your job is "+job22);
        email2.setText("your email is "+email22);

    }
}