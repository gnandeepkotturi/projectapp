package com.example.projeapp;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class Adminlogin extends Fragment {
    Button admin_login;


    public Adminlogin() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_adminlogin, container, false);
        admin_login=v.findViewById(R.id.admin_login_button);
        admin_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //  login validation
                Intent i=new Intent(getContext(),AdminsecondActivity.class);
                startActivity(i);
            }
        });
        return v;
    }

}
