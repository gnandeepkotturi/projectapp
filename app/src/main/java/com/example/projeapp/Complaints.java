package com.example.projeapp;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Complaints extends Fragment implements View.OnClickListener {
    EditText et_compaint;
    TextView tv_compaintarea;
    Button com_submit,transportbutton,equipbutton,otherbutton;
    LinearLayout complaintform;


    public Complaints() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_complaints, container, false);
        et_compaint=v.findViewById(R.id.writecomplaint);
        tv_compaintarea=v.findViewById(R.id.complaintarea);
        com_submit=v.findViewById(R.id.comsubmit);
        transportbutton=v.findViewById(R.id.comp_transport);
        equipbutton=v.findViewById(R.id.comp_equip);
        complaintform=v.findViewById(R.id.complaintarealayout);
        otherbutton=v.findViewById(R.id.comp_other);
        transportbutton.setOnClickListener(this);
        equipbutton.setOnClickListener(this);
        otherbutton.setOnClickListener(this);

        com_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        return v;
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.comp_transport:
                transport();
                break;
            case R.id.comp_equip:
                equipment();
                break;
            case R.id.comp_other:
                others();
                break;
        }
    }

    private void others() {
        complaintform.setVisibility(View.VISIBLE);
        tv_compaintarea.setText("complaint area");
        String othercomplaintdata=et_compaint.getText().toString();

    }

    private void equipment() {
        complaintform.setVisibility(View.VISIBLE);
        tv_compaintarea.setText("Equipment");
        String equipmentdata=et_compaint.getText().toString();

    }

    private void transport() {
        complaintform.setVisibility(View.VISIBLE);
        tv_compaintarea.setText("Transport");
        String transportdata=et_compaint.getText().toString();
    }
}
