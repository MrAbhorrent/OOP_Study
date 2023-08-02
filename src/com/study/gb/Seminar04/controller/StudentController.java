package com.study.gb.Seminar04.controller;

import com.study.gb.Seminar04.data.Student;
import com.study.gb.Seminar04.data.User;
import com.study.gb.Seminar04.view.StudentView;
import com.study.gb.Seminar04.view.UserView;

import java.util.List;
import java.time.LocalDate;

public class StudentController implements IUserController{

    private UserView studentsView = new StudentView();

    @Override
    public void create(String firstName, String surName, String lastName) {
        Student newStudent = new Student(firstName,lastName,surName, LocalDate.now());
    }

    public void printConsole(List<Student> students) {
        studentsView.sendOnConsole(students);
    }
}
