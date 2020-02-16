package com.example.projeapp;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class Courses extends Fragment {
    TextView t_btech,t_mba,t_diploma,t_b_cor,t_heading,t_list;


    public Courses() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_courses, container, false);
        //t_b_cor=v.findViewById(R.id.branch_Corses);
        //ll=v.findViewById(R.id.cor_layout);
        t_heading=v.findViewById(R.id.loc);
        t_list=v.findViewById(R.id.display_cor_ist);
        t_btech=v.findViewById(R.id.btech);
        t_btech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t_heading.setText("List Of Courses");
                t_list.setText("Civil Engineering"+"\n"+
                               "Electrical Electronic And Engineering"+"\n"+
                               "Mechanical"+"\n"+
                               "Electronic Communication And Engineering "+"\n"+
                               "Computer Science And Engineering");
             }
        });
        t_mba=v.findViewById(R.id.mba);
        t_mba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // Toast.makeText(getActivity(), "hiiii", Toast.LENGTH_SHORT).show();
                 t_heading.setText("List Of Courses");
                t_list.setText(" Engineering"+"\n"+
                        "cvfjhcv"+"\n"+
                        "Mechanical"+"\n"+
                        "Electronic Communication And Engineering "+"\n"+
                        "Computer Science And Engineering");
            }
        });
        t_diploma=v.findViewById(R.id.diploma);
        t_diploma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t_heading.setText("List Of Courses");
                t_list.setText("Civil Engineering"+"\n"+
                        "Electrical Electronic And Engineering"+"\n"+
                        "Mechanical"+"\n"+
                        "Electronic Communication And Engineering "+"\n"+
                        "Computer Science And Engineering");
            }
        });

        return  v;

    }

}
