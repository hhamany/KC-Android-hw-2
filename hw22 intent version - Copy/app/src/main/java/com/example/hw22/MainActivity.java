
package com.example.hw22;

import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        TextView welcome = findViewById(R.id.welcome);
        EditText name = findViewById(R.id.name);
        EditText age = findViewById(R.id.age);
        EditText job = findViewById(R.id.job);
        EditText phone = findViewById(R.id.phone);
        EditText email = findViewById(R.id.email);
        Button conf = findViewById(R.id.button);

        /////////////////// تم تعريف الxml in java///////////////


        conf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

              if (TextUtils.isEmpty(name.getText())){

              Toast.makeText(MainActivity.this,"please fill your information",Toast.LENGTH_LONG).show();
                }
              else if (TextUtils.isEmpty(age.getText())) {
                  Toast.makeText(MainActivity.this, "please fill your information", Toast.LENGTH_LONG).show();
              }

              else if (TextUtils.isEmpty(phone.getText())) {
                  Toast.makeText(MainActivity.this, "please fill your information", Toast.LENGTH_LONG).show();
              }

              else if (TextUtils.isEmpty(job.getText())) {
                  Toast.makeText(MainActivity.this, "please fill your information", Toast.LENGTH_LONG).show();
              }

              else if (TextUtils.isEmpty(email.getText())) {
                  Toast.makeText(MainActivity.this, "please fill your information", Toast.LENGTH_LONG).show();
              }


              else {
                  String name1;
                  EditText nam = findViewById(R.id.name);
                  int age1 = Integer.parseInt(age.getText().toString());
                  int phone1 = Integer.parseInt(phone.getText().toString());
                  EditText email1 = findViewById(R.id.email);
                  EditText job1 = findViewById(R.id.job);

                  Intent finish = new Intent(MainActivity.this, MainActivity2.class);

                  finish.putExtra("item1", nam.getText().toString());
                  finish.putExtra("item2", age1);
                  finish.putExtra("item3", phone1);
                  finish.putExtra("item4", email1.getText().toString());
                  finish.putExtra("item5", job1.getText().toString());

                  startActivity(finish);
              }


            }
        });

        
       }
    }
