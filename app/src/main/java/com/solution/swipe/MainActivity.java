package com.solution.swipe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private List<Student> studentArrayList = new ArrayList<>();
    private RecyclerView recyclerView;
    private MyAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAdapter = new MyAdapter(studentArrayList);
        recyclerView = findViewById(R.id.recycler_view);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        generateStudentRecords();
    }

    private void generateStudentRecords() {


//        studentArrayList.add(new Student("Farhan", "1001",
//                100, 99, 98, 97,90, , 91.5f));
//
//        Student student = new Student("Farhan", "1001",
//                100, 99, 98, 97,90, 500, 91.5f);
//        studentArrayList.add(student);

        Student student1 = new Student();
        student1.studentName = "Mohamed";
        student1.rollNumber = "1002";
        student1.English = 90;
        student1.Tamil = 90;
        student1.Maths = 90;
        student1.Science = 90;
        student1.Social = 90;

        student1.setTotal(student1.English, student1.Tamil,student1.Maths,
                student1.Science,student1.Social);
        student1.Total = student1.getTotal();

        studentArrayList.add(student1);


//        studentArrayList.add("Python");
//        studentArrayList.add("Angular");
//        studentArrayList.add("SQL");
//        studentArrayList.add("MongoDB");
//        studentArrayList.add("Firebase");

        mAdapter.notifyDataSetChanged();

    }
}
