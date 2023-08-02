package com.study.gb.Seminar03;

import com.study.gb.Seminar03.Service.SteamService;
import com.study.gb.Seminar03.Service.StudentGroupService;

import java.util.Collection;
import java.util.Collections;

public class Controller {

    private StudentGroupService studentGroupService;
    private SteamService steamService;

    public Controller(StudentGroupService studentGroupService, SteamService steamService) {
        this.studentGroupService = studentGroupService;
        this.steamService = steamService;
    }

    public StudentGroupService getStudentGroupService() {
        return studentGroupService;
    }

    public void setStudentGroupService(StudentGroupService studentGroupService) {
        this.studentGroupService = studentGroupService;
    }

    public SteamService getSteamService() {
        return steamService;
    }

    public void setSteamService(SteamService steamService) {
        this.steamService = steamService;
    }

    public void sortStudentsGroupByName() {
        studentGroupService.sortStudentsByName();
    }

    public void sortSteamBySize() {
        steamService.sortSteamBySize();
    }
}
