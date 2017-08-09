package com.pallavi.examforms.examformsfill.Activity;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.pallavi.examforms.examformsfill.R;

public class ForeignOpportunityActivity extends AppCompatActivity {

    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foreign_opportunity);

        spinner = (Spinner)findViewById(R.id.spin1);

        final String items[]={"Choose from this list...","ACT","GED","SAT","PERT","THEA"};

        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,items);

        spinner.setAdapter(arrayAdapter);

//        spinner.setAdapter(arrayAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                switch (position){
                    case 1:
                        Toast.makeText(ForeignOpportunityActivity.this,items[position], Toast.LENGTH_LONG).show();
                        Intent browserIntent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.act.org/content/act/en/products-and-services/the-act.html"));
                        startActivity(browserIntent1);
                        break;
                    case 2:
                        Toast.makeText(ForeignOpportunityActivity.this, items[position], Toast.LENGTH_LONG).show();
                        Intent browserIntent2 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.gedtestingservice.com/uploads/files/a8fb8cea7ad8c2e90c0f7558333505f3.pdf"));
                        startActivity(browserIntent2);
                        break;
                    case 3:
                        Toast.makeText(ForeignOpportunityActivity.this, items[position], Toast.LENGTH_SHORT).show();
                        Intent browserIntent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://collegereadiness.collegeboard.org/sat/register"));
                        startActivity(browserIntent3);
                        break;
                    case 4:
                        Toast.makeText(ForeignOpportunityActivity.this, items[position], Toast.LENGTH_SHORT).show();
                        Intent browserIntent4 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.fldoe.org/schools/higher-ed/fl-college-system/common-placement-testing.stml"));
                        startActivity(browserIntent4);
                        break;
                    case 5:
                        Toast.makeText(ForeignOpportunityActivity.this, items[position], Toast.LENGTH_SHORT).show();
                        Intent browserIntent5 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.thea.nesinc.com/"));
                        startActivity(browserIntent5);
                        break;

                }


            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


    }

    public void clickbackhomeforeign(View view){
        startActivity(new Intent(this,HomeActivity.class));
    }
}
