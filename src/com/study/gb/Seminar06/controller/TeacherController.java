package com.study.gb.Seminar06.controller;

import com.study.gb.Seminar06.data.Teacher;
import com.study.gb.Seminar06.data.User;
import com.study.gb.Seminar06.service.TeacherService;
import com.study.gb.Seminar06.view.TeacherView;

import javax.jws.soap.SOAPBinding;
import java.time.LocalDate;
import java.util.List;

public class TeacherController implements IUserController<Teacher>{

    private final TeacherService teacherService;
    private final TeacherView teacherView;

    public TeacherController() {
        teacherService = new TeacherService();
        teacherView = new TeacherView();
    }

    public void createTeacher(User user, long teacherId) {
        teacherService.createTeacher(
                user.getFirstName(),
                user.getSecondName(),
                user.getPatronymic(),
                user.getDateOfBirth(),
                teacherId);
    }

    public void editTeacher(int index, Teacher teacher) {
        teacherService.editTeacher(index, teacher);
    }

    public void displayAllTeachers() {
        List<Teacher> teachersList = teacherService.getAllTeachers();
        teacherView.sendOnConsole(teachersList);
    }

    @Override
    public void create(String firstName, String surName, String lastName) {
        User user = new User(firstName, lastName, surName, LocalDate.now());
        createTeacher(user, TeacherService.getTeacherId());
    }
}
