package com.study.gb.Seminar05.view;

import com.study.gb.Seminar05.data.StudentGroup;

public class StudentGroupView {

    public void sendOnConsole(StudentGroup studentGroup){
        System.out.println("Учебная группа:");
        System.out.println("Преподаватель: " + studentGroup.getTeacher().toString());
        StudentView studentView = new StudentView();
        studentView.sendOnConsole(studentGroup.getStudents());
    }
}
