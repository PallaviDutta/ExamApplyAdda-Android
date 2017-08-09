package com.pallavi.examforms.examformsfill.Activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.pallavi.examforms.examformsfill.R;

public class TopIndianCollegeActivity extends AppCompatActivity {

    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_indian_college);
        spinner = (Spinner)findViewById(R.id.spin_top_indian_college);

        final String items[]={" Choose from this list !","BIT MESHRA","ST. XAVIER'S COLLEGE,KOLKATA","PRESIDENCY COLLEGE","CHRIST UNIVERSITY,BANGALORE"," BHU","HCU"};

        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,items);

        spinner.setAdapter(arrayAdapter);

//      spinner.setAdapter(arrayAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                switch (position){
                    case 1:
                        Toast.makeText(TopIndianCollegeActivity.this,items[position], Toast.LENGTH_LONG).show();
                        Intent browserIntent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bitmesra.ac.in/"));
                        startActivity(browserIntent1);
                        break;
                    case 2:
                        Toast.makeText(TopIndianCollegeActivity.this, items[position], Toast.LENGTH_LONG).show();
                        Intent browserIntent2 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.sxccal.edu/"));
                        startActivity(browserIntent2);
                        break;
                    case 3:
                        Toast.makeText(TopIndianCollegeActivity.this, items[position], Toast.LENGTH_SHORT).show();
                        Intent browserIntent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.presiuniv.ac.in/web/"));
                        startActivity(browserIntent3);
                        break;
                    case 4:
                        Toast.makeText(TopIndianCollegeActivity.this, items[position], Toast.LENGTH_SHORT).show();
                        Intent browserIntent4 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://christuniversity.in//"));
                        startActivity(browserIntent4);
                        break;
                    case 5:
                        Toast.makeText(TopIndianCollegeActivity.this, items[position], Toast.LENGTH_SHORT).show();
                        Intent browserIntent5 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.bhu.ac.in/"));
                        startActivity(browserIntent5);
                        break;
                    case 6:
                        Toast.makeText(TopIndianCollegeActivity.this, items[position], Toast.LENGTH_SHORT).show();
                        Intent browserIntent6 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.uohyd.ac.in/"));
                        startActivity(browserIntent6);
                        break;

                }


            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


    }

    public void clickbackhometopindiancollege(View view){
        startActivity(new Intent(this,HomeActivity.class));
    }

}
