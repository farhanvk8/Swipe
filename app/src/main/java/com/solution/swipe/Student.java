package com.solution.swipe;

public class Student {

    public String studentName = "--";
    public String rollNumber = "--";
    public int English = 0;
    public int Tamil = 0;
    public int Maths = 0;
    public int Science = 0;
    public int Social = 0;
    public int Total = 0;
    public float Average = 0.0f;

//    public Student(String studentName, String rollNumber, int english, int tamil, int maths, int science, int social, int total, float average) {
//        this.studentName = studentName;
//        this.rollNumber = rollNumber;
//        English = english;
//        Tamil = tamil;
//        Maths = maths;
//        Science = science;
//        Social = social;
//        Total = total;
//        Average = average;
//    }
//
//    public Student() {
//
//    }


    public int getTotal() {
        return Total;
    }

    public void setTotal(int english, int tamil, int maths, int science, int social) {
        Total = english+tamil+maths+science+social;
    }
}
