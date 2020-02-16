package com.example.projeapp;

import android.widget.EditText;

class Facultydetails {
    private String faculty_Id,faculty_name,faculty_number,faculty_email,faculty_address,faculty_branch;

    public Facultydetails(String faculty_Id, String faculty_name, String faculty_number, String faculty_email, String faculty_address, String faculty_branch) {
        this.faculty_Id = faculty_Id;
        this.faculty_name = faculty_name;
        this.faculty_number = faculty_number;
        this.faculty_email = faculty_email;
        this.faculty_address = faculty_address;
        this.faculty_branch = faculty_branch;

    }

    public Facultydetails() {
    }

    public String getFaculty_Id() {
        return faculty_Id;
    }



    public String getFaculty_name() {
        return faculty_name;
    }

    public String getFaculty_number() {
        return faculty_number;
    }

    public String getFaculty_email() {
        return faculty_email;
    }

    public String getFaculty_address() {
        return faculty_address;
    }

    public String getFaculty_branch() {
        return faculty_branch;
    }
}
