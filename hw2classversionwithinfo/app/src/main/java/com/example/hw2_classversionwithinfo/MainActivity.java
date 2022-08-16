package com.example.hw2_classversionwithinfo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Employs> employslist = new ArrayList<>();
    int employeesnum = 0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        EditText name = findViewById(R.id.name);
        EditText age = findViewById(R.id.age);
        EditText phone = findViewById(R.id.phone);
        EditText job = findViewById(R.id.job);
        EditText email = findViewById(R.id.email);
        ImageView pic = findViewById(R.id.pic);
        Button next = findViewById(R.id.button);
        Button back = findViewById(R.id.back);

        ///////////////////////////////////////////


        Employs employ1 = new Employs("  أحمد بسبوس " , 20,99977898,"دكتور","ahmedbasbos@gmail.com",R.drawable.doc);
        Employs employ2 = new Employs("  جمال كنفاني " , 24,99765341,"مهندس","jamal12@gmail.com",R.drawable.eng );
        Employs employ3 = new Employs("  كريستيانو goat " , 37,90000311,"افضل لاعب ","goatcr7@gmail.com",R.drawable.cr7 );
        Employs employ4 = new Employs("  مصطفى كنتاكي " , 22,68765463,"طباخ","sasa32sasa@gmail.com",R.drawable.chef );
        Employs employ5 = new Employs("  سماح محبوبة  " , 30,53294029,"ربة منزل","sosolove@gmail.com",R.drawable.g2 );
        Employs employ6 = new Employs(" هدى بيوتي " , 19,66210098,"على باب الله","hudamakeup@gmail.com",R.drawable.girl1 );
        Employs employ7 = new Employs("  خالد كشميري " , 27,90775123,"تيكتوكر","tiktok23@gmail.com",R.drawable.tik );



        employslist.add(employ1);
        employslist.add(employ2);
        employslist.add(employ3);
        employslist.add(employ4);
        employslist.add(employ5);
        employslist.add(employ6);
        employslist.add(employ7);



        name.setText(employslist.get(employeesnum).getNames());
        age.setText(String.valueOf(employslist.get(employeesnum).getAges()));
        phone.setText(String.valueOf(employslist.get(employeesnum).getPhone()));
        job.setText(employslist.get(employeesnum).getJob());
        email.setText(employslist.get(employeesnum).getEmail());
        pic.setImageResource(employslist.get(employeesnum).getPic());

        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                employeesnum++;
                if( employeesnum == employslist.size()){
                    employeesnum = 0 ;
                }
                name.setText(employslist.get(employeesnum).getNames());
                age.setText(String.valueOf(employslist.get(employeesnum).getAges()));
                phone.setText(String.valueOf(employslist.get(employeesnum).getPhone()));
                job.setText(employslist.get(employeesnum).getJob());
                email.setText(employslist.get(employeesnum).getEmail());
                pic.setImageResource(employslist.get(employeesnum).getPic());
            }
        });



        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                employeesnum--;

                name.setText(employslist.get(employeesnum).getNames());
                age.setText(String.valueOf(employslist.get(employeesnum).getAges()));
                phone.setText(String.valueOf(employslist.get(employeesnum).getPhone()));
                job.setText(employslist.get(employeesnum).getJob());
                email.setText(employslist.get(employeesnum).getEmail());
                pic.setImageResource(employslist.get(employeesnum).getPic());

            }
        });


    }
}