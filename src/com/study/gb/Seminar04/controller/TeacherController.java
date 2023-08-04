package com.study.gb.Seminar04.controller;

import com.study.gb.Seminar04.data.Teacher;
import com.study.gb.Seminar04.data.User;
import com.study.gb.Seminar04.service.TeacherService;
import com.study.gb.Seminar04.view.TeacherView;
import java.util.List;

public class TeacherController {

    private final TeacherService teacherService;
    private final TeacherView teacherView;

    public TeacherController() {
        teacherService = new TeacherService();
        teacherView = new TeacherView();
    }

    public void createTeacher(User user, int teacherId) {
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
}
