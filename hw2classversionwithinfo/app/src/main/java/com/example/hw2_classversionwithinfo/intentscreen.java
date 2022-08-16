package com.example.hw2_classversionwithinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class intentscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intentscreen);
        TextView welcome = findViewById(R.id.textView);
        Button change = findViewById(R.id.change);


        change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMainActivity();
            }
        });
    }
        public void openMainActivity(){

            Intent intent = new Intent(this,MainActivity.class);
            startActivity(intent);


    }
}