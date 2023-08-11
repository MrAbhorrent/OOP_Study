package com.study.gb.Seminar05.service;

import com.study.gb.Seminar05.data.Teacher;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TeacherService {

    private final List<Teacher> teachers;

    public TeacherService(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public TeacherService() {
        this(new ArrayList<>());
    }

    public void createTeacher(String firstName, String secondName, String patronymicName, LocalDate dateOfBirth, long teacherID) {
        Teacher teacher = new Teacher(firstName,secondName,patronymicName,dateOfBirth);
        teacher.setTeacherId(teacherID);
        teachers.add(teacher);

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

    public Teacher getTeacher(int idTeacher) {
        if (teachers != null) {
            for (Teacher teacher: teachers) {
                if (teacher.getTeacherId() == idTeacher) {
                    return teacher;
                }
            }

        }
        return null;
    }
}
