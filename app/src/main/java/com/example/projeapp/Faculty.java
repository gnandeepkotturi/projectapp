package com.example.projeapp;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class Faculty extends Fragment {
Spinner sp_facultyinfo;
Button getfaculty;
FirebaseDatabase database;
DatabaseReference reference;
TextView tv_name,tv_email,tv_mobilenumber,tv_id,tv_branch,tv_address;


    public Faculty() {
        // Required empty public constructor
    }

    List<Facultydetails> list;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_faculty, container, false);
        sp_facultyinfo=v.findViewById(R.id.selectfacultybranch);
        getfaculty=v.findViewById(R.id.getdetails);
        /*tv_name=v.findViewById(R.id.t_name);
        tv_mobilenumber=v.findViewById(R.id.t_mobilenumber);
        tv_branch=v.findViewById(R.id.t_branch);
        tv_email=v.findViewById(R.id.t_email);
        tv_id=v.findViewById(R.id.t_id);
        tv_address=v.findViewById(R.id.t_address);*/

        database=FirebaseDatabase.getInstance();
        reference=database.getReference();

        list = new ArrayList<>();
        getfaculty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String branches=sp_facultyinfo.getSelectedItem().toString();

                reference.child("FacultyDetails").child(branches).addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        for(DataSnapshot snapshot:dataSnapshot.getChildren()){
                            list.add(snapshot.getValue(Facultydetails.class));
                        }
                       Toast.makeText(getActivity(), ""+list.size(), Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });

            }
        });

        return v;
    }


}
