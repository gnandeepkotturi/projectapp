package com.example.projeapp;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class Notifcations extends Fragment {
    EditText en;
    Button notif,subnotif;
    LinearLayout nl;


    public Notifcations() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_notifcations, container, false);
       /* en=v.findViewById(R.id.enternotifi);
        nl=v.findViewById(R.id.notilayout);
        subnotif=v.findViewById(R.id.submitnoti);
        notif=v.findViewById(R.id.notifi);
        notif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                en.setVisibility(View.VISIBLE);
                subnotif.setVisibility(View.VISIBLE);
                subnotif.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        *//*Toast.makeText(getActivity(), "chinnu", Toast.LENGTH_SHORT).show();
                        String data=en.getText().toString();
                        getActivity().getIntent().putExtra("edit",data);*//*
                       // Acheivements evt=(Acheivements) getFragmentManager().findFragmentById(R.id.Achive);
                      *//*  Acheivements newFragment = new Acheivements();
                        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                        transaction.replace(R.id.container, newFragment);
                        transaction.commit();
*//*

                    }
                });

            }
        });*/
        return v;
    }
    public void channgefrag(){

    }

}
