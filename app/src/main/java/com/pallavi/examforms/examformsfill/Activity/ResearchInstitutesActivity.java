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

public class ResearchInstitutesActivity extends AppCompatActivity {

    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_research_institutes);
        spinner = (Spinner)findViewById(R.id.spin_research_institute);

        final String items[]={" Choose from this list !","IISc","Tata Institute of Fundamental Research","Homi Bhabha Centre for Science Education","Bose Institute"," National Brain Research Centre"};

        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,items);

        spinner.setAdapter(arrayAdapter);

//        spinner.setAdapter(arrayAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                switch (position){
                    case 1:
                        Toast.makeText(ResearchInstitutesActivity.this,items[position], Toast.LENGTH_LONG).show();
                        Intent browserIntent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.iisc.ac.in/"));
                        startActivity(browserIntent1);
                        break;
                    case 2:
                        Toast.makeText(ResearchInstitutesActivity.this, items[position], Toast.LENGTH_LONG).show();
                        Intent browserIntent2 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.tifr.res.in/"));
                        startActivity(browserIntent2);
                        break;
                    case 3:
                        Toast.makeText(ResearchInstitutesActivity.this, items[position], Toast.LENGTH_SHORT).show();
                        Intent browserIntent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.hbcse.tifr.res.in/"));
                        startActivity(browserIntent3);
                        break;
                    case 4:
                        Toast.makeText(ResearchInstitutesActivity.this, items[position], Toast.LENGTH_SHORT).show();
                        Intent browserIntent4 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.boseinst.ernet.in/"));
                        startActivity(browserIntent4);
                        break;
                    case 5:
                        Toast.makeText(ResearchInstitutesActivity.this, items[position], Toast.LENGTH_SHORT).show();
                        Intent browserIntent5 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.nbrc.ac.in/"));
                        startActivity(browserIntent5);
                        break;

                }


            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


    }

    public void clickbackhomedelhi(View view){
        startActivity(new Intent(this,HomeActivity.class));
    }

}
