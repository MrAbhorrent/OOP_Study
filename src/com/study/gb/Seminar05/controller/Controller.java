package com.study.gb.Seminar05.controller;

import com.study.gb.Seminar05.data.Student;
import com.study.gb.Seminar05.data.StudentGroup;
import com.study.gb.Seminar05.data.Teacher;
import com.study.gb.Seminar05.service.StudentGroupService;
import com.study.gb.Seminar05.service.TeacherService;
import com.study.gb.Seminar05.view.StudentGroupView;
import com.study.gb.Seminar05.view.StudentView;
import com.study.gb.Seminar05.view.TeacherView;

import java.util.List;

/**
 * В данном моудле агрегируются функции получения списка студентов (их id) и преподавателя (его id)
 * и формирования учебной группы, путём вызова метода из сервиса;
 */

public class Controller {

    private final StudentGroupService studentGroupService = new StudentGroupService();
    private final TeacherService teacherService = new TeacherService();
    private final StudentView studentView = new StudentView();
    private final TeacherView teacherView = new TeacherView();
    private final StudentGroupView studentGroupView = new StudentGroupView();

    /**
     * Получение списка студентов
     */
    public List<Student> getAllStudentsList() {
        return studentGroupService.getStudentGroup().getStudents();
    }

    /**
     *  Получение преподавателя по id
     */
    public Teacher getTeacher(int idTeacher) {
        return teacherService.getTeacher(idTeacher);
    }

    /**
     * Формирование учебной группы
     */
    public void createStudentGroup(Teacher teacher, List<Student> studentList){
        studentGroupService.createStudentGroup(teacher, studentList);
    }
}
