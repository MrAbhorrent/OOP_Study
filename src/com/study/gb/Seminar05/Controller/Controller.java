package com.study.gb.Seminar05.Controller;

import com.study.gb.Seminar05.Model.Type;
import com.study.gb.Seminar05.Model.User;
import com.study.gb.Seminar05.Service.DataService;

import java.time.LocalDate;
import java.util.List;

public class Controller {

    DataService dataService = new DataService();

    public void createStudent(String firstName, String lastName, String surName, LocalDate birthDate) {
        dataService.create(firstName, surName, lastName, birthDate, Type.STUDENT);
    }

    public void getAllStudent() {
        List<User> userList = dataService.getStudentAll();
    }
}
