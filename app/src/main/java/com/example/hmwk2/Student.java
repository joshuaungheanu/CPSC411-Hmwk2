package com.example.hmwk2;

import java.util.ArrayList;

public class Student {
    protected String fName;
    protected String lName;
    protected ArrayList<CourseEnrollment> aList;

    public Student(String firstName, String lastName){
        fName = firstName;
        lName = lastName;
    }

    public String getFirstName(){
        return fName;
    }
    public String getLastName(){
        return lName;
    }
    public ArrayList<CourseEnrollment> getaList(){return aList;}

    public void setFirstName(String firstName){
        fName = firstName;
    }
    public void setLastName(String lastName){
        lName = lastName;
    }
    public void setaList(ArrayList<CourseEnrollment> courseList){aList = courseList;}
}
