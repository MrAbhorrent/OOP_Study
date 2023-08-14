package com.study.gb.Seminar06.controller;

import com.study.gb.Seminar06.data.Student;
import com.study.gb.Seminar06.view.StudentView;
import com.study.gb.Seminar06.view.UserView;

import java.time.LocalDate;
import java.util.List;

public class StudentController implements IUserController {

    private final UserView<Student> studentsView = new StudentView();

    @Override
    public void create(String firstName, String surName, String lastName) {
        Student newStudent = new Student(firstName,lastName,surName, LocalDate.now());
    }

    public void printConsole(List<Student> students) {
        studentsView.sendOnConsole(students);
    }

    public void getGroupStudentID(List<Student> studentsList) {
        for (Student student : studentsList) {
            System.out.println(student.getStudentId());
        }
    }
}
