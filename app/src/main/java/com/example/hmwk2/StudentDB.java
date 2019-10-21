package com.example.hmwk2;

import java.util.ArrayList;

public class StudentDB {
    private static final StudentDB ourInstance = new StudentDB();

    private ArrayList<Student> mPersonList;

    static public StudentDB getInstance(){return ourInstance;}

    private StudentDB(){

    }

    public ArrayList<Student> getPersonList(){
        return mPersonList;
    }

    public void setPersonList(ArrayList<Student> personList) {
        mPersonList = personList;
    }
}
