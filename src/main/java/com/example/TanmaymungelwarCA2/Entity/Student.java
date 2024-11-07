package com.example.TanmaymungelwarCA2.Entity;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "students")
public class Student {

    @Id
    private String _id;
    private String studentname;
    private String studentadress;
    private int mobile;


    public Student(String _id, String studentname, String studentadress, int mobile) {
        this._id = _id;
        this.studentname = studentname;
        this.studentadress = studentadress;
        this.mobile = mobile;
    }


    public Student() {
    }


    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    public String getStudentadress() {
        return studentadress;
    }

    public void setStudentadress(String studentadress) {
        this.studentadress = studentadress;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }


    @Override
    public String toString() {
        return "Student{" +
                "_id='" + _id + '\'' +
                ", studentname='" + studentname + '\'' +
                ", studentadress='" + studentadress + '\'' +
                ", mobile=" + mobile +
                '}';
    }
}

