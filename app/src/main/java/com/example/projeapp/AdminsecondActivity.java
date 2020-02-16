package com.example.projeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

public class AdminsecondActivity extends AppCompatActivity implements View.OnClickListener {
    EditText enterdata;
    EditText studentrollnum,studentname,studentmobile,studentemail;
    Spinner studentsection,studentbranch;
    EditText facultyid,facultyname,facultymob_number,facultyemail,facultyaddress;
    Spinner facultybranch;
    Button submit,b1,b2,b3,b4,b5,b6,save,facultysubmit;
    LinearLayout studentform,facultyform;

   /* FirebaseStorage storage;
    StorageReference storageReference;*/
    FirebaseDatabase database;
    DatabaseReference reference;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adminsecond);
        enterdata=findViewById(R.id.enterData);
        submit=findViewById(R.id.admin_submit);
        b1=findViewById(R.id.admin_faculty);
        b2=findViewById(R.id.admin_student);
        b3=findViewById(R.id.admin_Results);
        b4=findViewById(R.id.admin_notifications);
        b5=findViewById(R.id.admin_achievements);
        b6=findViewById(R.id.admin_events);
        studentform=findViewById(R.id.studentlayout);
        facultyform=findViewById(R.id.facultylayout);
        /*tstorage=FirebaseStorage.getInstance();
        storageReference=storage.getReference();*/
        studentrollnum=findViewById(R.id.s_roll);
        studentname=findViewById(R.id.s_name);
        studentmobile=findViewById(R.id.s_mobile);
        studentemail=findViewById(R.id.s_email);
        studentsection=findViewById(R.id.sectionspinner);
       /* storage=FirebaseStorage.getInstance();
        storageReference=storage.getReference();
        database=FirebaseDatabase.getInstance();
        reference=database.getReference();*/
        save=findViewById(R.id.save);
        save.setOnClickListener(this);

        facultyid=findViewById(R.id.Faculty_id);
        facultyname=findViewById(R.id.Faculty_name);
        facultymob_number=findViewById(R.id.Faculty_number);
        facultyemail=findViewById(R.id.Faculty_email);
        facultyaddress=findViewById(R.id.Faculty_address);
        facultybranch=findViewById(R.id.Faculty_branch);
        facultysubmit=findViewById(R.id.Faculty_submit);
        facultysubmit.setOnClickListener(this);

        database = FirebaseDatabase.getInstance();
        reference = database.getReference();

    }

    public void enterNotification(View view) {
        b1.setVisibility(view.INVISIBLE);
        b2.setVisibility(view.INVISIBLE);
        b3.setVisibility(view.INVISIBLE);
        b4.setVisibility(view.INVISIBLE);
        b5.setVisibility(view.INVISIBLE);
        b6.setVisibility(view.INVISIBLE);
        enterdata.setVisibility(view.VISIBLE);
        submit.setVisibility(view.VISIBLE);

    }

    public void enterAchievements(View view) {
        b1.setVisibility(view.INVISIBLE);
        b2.setVisibility(view.INVISIBLE);
        b3.setVisibility(view.INVISIBLE);
        b4.setVisibility(view.INVISIBLE);
        b5.setVisibility(view.INVISIBLE);
        b6.setVisibility(view.INVISIBLE);
        enterdata.setVisibility(view.VISIBLE);
        submit.setVisibility(view.VISIBLE);

    }

    public void enterEvents(View view) {
        b1.setVisibility(view.INVISIBLE);
        b2.setVisibility(view.INVISIBLE);
        b3.setVisibility(view.INVISIBLE);
        b4.setVisibility(view.INVISIBLE);
        b5.setVisibility(view.INVISIBLE);
        b6.setVisibility(view.INVISIBLE);
        enterdata.setVisibility(view.VISIBLE);
        submit.setVisibility(view.VISIBLE);

    }

    public void enterFaculty(View view) {
        b1.setVisibility(view.INVISIBLE);
        b2.setVisibility(view.INVISIBLE);
        b3.setVisibility(view.INVISIBLE);
        b4.setVisibility(view.INVISIBLE);
        b5.setVisibility(view.INVISIBLE);
        b6.setVisibility(view.INVISIBLE);
        facultyform.setVisibility(view.VISIBLE);


    }

    public void enterResults(View view) {
        b1.setVisibility(view.INVISIBLE);
        b2.setVisibility(view.INVISIBLE);
        b3.setVisibility(view.INVISIBLE);
        b4.setVisibility(view.INVISIBLE);
        b5.setVisibility(view.INVISIBLE);
        b6.setVisibility(view.INVISIBLE);
    }

    public void enterStudent(View view) {
        b1.setVisibility(view.INVISIBLE);
        b2.setVisibility(view.INVISIBLE);
        b3.setVisibility(view.INVISIBLE);
        b4.setVisibility(view.INVISIBLE);
        b5.setVisibility(view.INVISIBLE);
        b6.setVisibility(view.INVISIBLE);
        studentform.setVisibility(view.VISIBLE);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.save:
               save();
                Toast.makeText(this, "I am Save Button", Toast.LENGTH_SHORT).show();
                break;
            case R.id.Faculty_submit:
                faculty_submit();
                break;
        }

    }

    private void faculty_submit() {
        String faculty_Id=facultyid.getText().toString();
        String faculty_name=facultyname.getText().toString();
        String faculty_number=facultymob_number.getText().toString();
        String faculty_email=facultyemail.getText().toString();
        String faculty_address=facultyaddress.getText().toString();
        String faculty_branch=facultybranch.getSelectedItem().toString();
        Facultydetails details=new Facultydetails(faculty_Id,faculty_name,faculty_number,faculty_email,faculty_address,faculty_branch);
        reference.child("FacultyDetails").child(faculty_branch).push().setValue(details);
        Toast.makeText(this, "Data saved successfully", Toast.LENGTH_SHORT).show();
        facultyid.setText("");
        facultyname.setText("");
        facultymob_number.setText("");
        facultyemail.setText("");
        facultyaddress.setText("");



    }

    private void save() {
        final String rollnum=studentrollnum.getText().toString();
        final String name=studentname.getText().toString();
        final String section=studentsection.getSelectedItem().toString();
        final String mobilenum=studentmobile.getText().toString();
        final String email=studentemail.getText().toString();
        if (rollnum.isEmpty()||name.isEmpty()||mobilenum.isEmpty()||email.isEmpty()){
            Toast.makeText(AdminsecondActivity.this, "please fill the fields", Toast.LENGTH_SHORT).show();
        }else {
            Student s = new Student(rollnum, name, mobilenum, section,email);
            reference.child("Students").child(section).push().setValue(s);
            Toast.makeText(AdminsecondActivity.this, "Data saved successfully", Toast.LENGTH_SHORT).show();
            studentrollnum.setText("");
            studentname.setText("");
            studentmobile.setText("");
            studentemail.setText("");
            }




    }
}
