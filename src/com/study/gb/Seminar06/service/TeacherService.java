package com.study.gb.Seminar06.service;

import com.study.gb.Seminar06.data.Teacher;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TeacherService {

    private final List<Teacher> teachers;
    private static long teacherId = 0;

    public TeacherService(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public TeacherService() {
        this(new ArrayList<>());
    }

    public void createTeacher(String firstName, String secondName, String patronymicName, LocalDate dateOfBirth, long teacherID) {
        Teacher teacher = new Teacher(firstName,secondName,patronymicName,dateOfBirth);
        teacherId = teacherID;
        teacher.setTeacherId(teacherID);
        teachers.add(teacher);

    }

    public static long getTeacherId() {
        return teacherId;
    }

    public List<Teacher> getAllTeachers() {
        return teachers;
    }

    public void editTeacher(int index, Teacher teacher) {
        Teacher edTeacher = teachers.get(index);
        edTeacher.setFirstName(teacher.getFirstName());
        edTeacher.setSecondName(teacher.getSecondName());
        edTeacher.setPatronymic(teacher.getPatronymic());
        edTeacher.setDateOfBirth(teacher.getDateOfBirth());
    }
}
