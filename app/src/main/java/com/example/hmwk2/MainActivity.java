package com.example.hmwk2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.hmwk2.adapter.SummaryListAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    protected ListView mSummaryView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createStudentObjects();

        mSummaryView = findViewById(R.id.summary_list_id);
        SummaryListAdapter ad = new SummaryListAdapter();
        mSummaryView.setAdapter(ad);
    }

    protected void createStudentObjects(){
        ArrayList<Student> students = new ArrayList<Student>();

        ArrayList<CourseEnrollment> aTemp = new ArrayList<CourseEnrollment>();
        aTemp.add(new CourseEnrollment("CPSC411", "A"));
        aTemp.add(new CourseEnrollment("CPSC335", "B"));
        Student sTemp = new Student("Josh ", "Ungheanu");
        sTemp.setaList(aTemp);
        students.add(sTemp);

        aTemp = new ArrayList<CourseEnrollment>();
        aTemp.add(new CourseEnrollment("CPSC362", "A"));
        aTemp.add(new CourseEnrollment("CPSC323", "C"));
        sTemp = new Student("Sarah ", "Ungheanu");
        sTemp.setaList(aTemp);
        students.add(sTemp);

        aTemp = new ArrayList<CourseEnrollment>();
        aTemp.add(new CourseEnrollment("CPSC223", "A"));
        aTemp.add(new CourseEnrollment("CPSC440", "A"));
        sTemp = new Student("Micah ", "Ungheanu");
        sTemp.setaList(aTemp);
        students.add(sTemp);


        StudentDB.getInstance().setPersonList(students);
    }
}
