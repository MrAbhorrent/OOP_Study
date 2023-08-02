package com.study.gb.Seminar05.Service;

import com.study.gb.Seminar05.Model.Student;
import com.study.gb.Seminar05.Model.Teacher;
import com.study.gb.Seminar05.Model.Type;
import com.study.gb.Seminar05.Model.User;

import javax.jws.soap.SOAPBinding;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DataService {

    private List<User> userList;
    private int maxStudentId;
    private int maxTeacherId;

    public DataService() {

    }



    private void createUserList() {
        this.userList = new ArrayList<>();
    }

    public void create(String firstName, String surName, String lastName, LocalDate birthDate, Type type) {
        int iD = getFreeId(type);
        if (type == Type.STUDENT) {
            Student student = new Student(firstName, surName, lastName, birthDate,iD);
            userList.add(student);
        }
        if (type == Type.TEACHER) {
            Teacher teacher = new Teacher(firstName, surName, lastName, birthDate,iD);
            userList.add(teacher);
        }
    }

    public User getUserID(Type type, int id) {
        User resultUser = null;
        boolean itsStudent = Type.STUDENT == type;
        for (User user: userList) {
            if (itsStudent && user instanceof Student && ((Student) user).getStudentId() == id) {
                resultUser = user;
            }
            if (!itsStudent && user instanceof Teacher && ((Teacher) user).getTeacherId() == id) {
                resultUser = user;
            }
        }
        return resultUser;
    }

    public List<User> getAllUsers() {
        return userList;
    }

    public List<User> getStudentAll() {
        List<User> resultList = new ArrayList<>();
        for (User user:  userList) {
            if (user instanceof Student) {
                resultList.add(user);
            }
        }
        return resultList;
    }

    private int getFreeId(Type type) {
        int lastId = 1;
        boolean itsStudent = Type.STUDENT == type;
        for (User user: userList) {
            if (itsStudent && user instanceof Student) {
                lastId = ((Student) user).getStudentId() + 1;
            }
            if (!itsStudent && user instanceof Teacher) {
                lastId = ((Student) user).getStudentId() + 1;
            }
        }
        return lastId;
    }
}
