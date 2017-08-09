package com.pallavi.examforms.examformsfill.Fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.pallavi.examforms.examformsfill.Activity.DelhiUniversityActivity;
import com.pallavi.examforms.examformsfill.Activity.ForeignOpportunityActivity;
import com.pallavi.examforms.examformsfill.Activity.ResearchInstitutesActivity;
import com.pallavi.examforms.examformsfill.Activity.TopIndianCollegeActivity;
import com.pallavi.examforms.examformsfill.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PlanBFragment extends Fragment {

    Button btn_foreign_opportunity;
    Button btn_delhi_university;
    Button btn_top_indian_colleges;
    Button btn_research_institutes;

    public PlanBFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

//        startActivity(new Intent(getContext(), ScienceActivity.class));
         View view = inflater.inflate(R.layout.fragment_plan_b, container, false);

        btn_foreign_opportunity=(Button)view.findViewById(R.id.btn_foreign_opportunity);

        btn_foreign_opportunity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(),ForeignOpportunityActivity.class));

            }
        });

        btn_delhi_university=(Button)view.findViewById(R.id.btn_delhi_university);

        btn_delhi_university.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(),DelhiUniversityActivity.class));

            }
        });

        btn_top_indian_colleges=(Button)view.findViewById(R.id.btn_top_indian_colleges);

        btn_top_indian_colleges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(),TopIndianCollegeActivity.class));

            }
        });

        btn_research_institutes=(Button)view.findViewById(R.id.btn_research_institutes);

        btn_research_institutes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(),ResearchInstitutesActivity.class));

            }
        });


        return view;
    }
}
