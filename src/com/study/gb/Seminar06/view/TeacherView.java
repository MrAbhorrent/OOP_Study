package com.study.gb.Seminar06.view;

import com.study.gb.Seminar06.data.Teacher;

import java.util.List;

public class TeacherView implements UserView<Teacher> {
    @Override
    public void sendOnConsole(List<Teacher> listT) {
        System.out.println("Список учителей: ");
        for (Teacher teacher: listT) {
            System.out.printf("%d, %s %s %s%n", teacher.getTeacherId(), teacher.getFirstName(),teacher.getSecondName(), teacher.getPatronymic());
        }
    }
}
