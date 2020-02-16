package com.example.projeapp;

class Student {
    private String rollnum,name,mobilenum,section,email;

    public Student(String rollnum, String name, String mobilenum, String section, String email) {
        this.rollnum = rollnum;
        this.name = name;
        this.mobilenum = mobilenum;
        this.section = section;
        this.email = email;
    }

    public Student() {
    }

    public String getRollnum() {
        return rollnum;
    }

    public String getName() {
        return name;
    }

    public String getMobilenum() {
        return mobilenum;
    }

    public String getSection() {
        return section;
    }

    public String getEmail() {
        return email;
    }
}
