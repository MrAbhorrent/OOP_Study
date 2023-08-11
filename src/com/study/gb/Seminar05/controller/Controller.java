package com.study.gb.Seminar05.controller;

import com.study.gb.Seminar05.service.StudentGroupService;
import com.study.gb.Seminar05.view.StudentGroupView;
import com.study.gb.Seminar05.view.StudentView;
import com.study.gb.Seminar05.view.TeacherView;

/**
 * В данном моудле агрегируются функции получения списка студентов (их id) и преподавателя (его id)
 * и формирования учебной группы, путём вызова метода из сервиса;
 */

public class Controller {

    private final StudentGroupService studentGroupService = new StudentGroupService();
    private final StudentView studentView = new StudentView();
    private final TeacherView teacherView = new TeacherView();
    private final StudentGroupView studentGroupView = new StudentGroupView();

    public void getAllStudentsList() {
        studentGroupService.getStudentGroup();
    }

    

}
