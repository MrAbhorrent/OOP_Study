package com.study.gb.Seminar05.controller;

import com.study.gb.Seminar05.data.Student;
import com.study.gb.Seminar05.view.StudentView;
import com.study.gb.Seminar05.view.UserView;

import java.time.LocalDate;
import java.util.List;

public class StudentController implements IUserController {

    private UserView studentsView = new StudentView();

    @Override
    public void create(String firstName, String surName, String lastName) {
        Student newStudent = new Student(firstName,lastName,surName, LocalDate.now());
    }

    public void printConsole(List<Student> students) {
        studentsView.sendOnConsole(students);
    }
}
