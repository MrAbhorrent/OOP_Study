package com.study.gb.Seminar03.Model;

public class Student extends User implements Comparable<Student>{
    private Integer studentID;


    public Student(Integer studentID, String firstName, String secondName, String lastName) {
        super(firstName, secondName, lastName);
        this.studentID = studentID;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int number) {
        this.studentID = number;
    }

    @Override
    public int compareTo(Student student) {
        return Integer.compare(this.getStudentID(), student.getStudentID());
    }
}