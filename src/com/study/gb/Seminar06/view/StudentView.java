package com.study.gb.Seminar06.view;

import com.study.gb.Seminar06.data.Student;

import java.util.List;

public class StudentView implements UserView<Student> {
    @Override
    public void sendOnConsole(List<Student> listT) {
        System.out.println("Список студентов");
        for (Student student: listT) {
            System.out.println(student.getStudentId());
        }
    }
}
