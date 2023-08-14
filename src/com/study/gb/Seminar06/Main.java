package com.study.gb.Seminar06;

import com.study.gb.Seminar06.data.Student;
import com.study.gb.Seminar06.data.StudentGroup;
import com.study.gb.Seminar06.data.Teacher;
import com.study.gb.Seminar06.data.User;
import com.study.gb.Seminar06.view.StudentView;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

//    — Создать класс УчительСервис и реализовать аналогично проделанному на семинаре;
//    — Создать класс УчительВью и реализовать аналогично проделанному на семинаре;
//    — Создать класс УчительКонтроллер и реализовать возможность создания, редактирования конкретного учителя и отображения списка учителей, имеющихся в системе.
    public static void main(String[] args) {
        User student1 = new Student("Иванов", "Иван", "Иванович", LocalDate.now(), 1213L);
        User student2 = new User("Петров", "Иван", "Иванович", LocalDate.now());
        User student3 = new User("Сидоров", "Иван", "Иванович", LocalDate.now());
        User student4 = new User("Болконская", "Иван", "Иванович", LocalDate.now());
        User student5 = new User("Романов", "Сергей", "Иванович", LocalDate.now());
        User student6 = new User("Ромашов", "Иван", "Иванович", LocalDate.now());
        System.out.println(student1);
        System.out.println(student2);

        Teacher teacher = new Teacher("Букашкин", "Александр", "", LocalDate.now());
        System.out.println(teacher);
        List<Student> newList = new ArrayList<>();

        StudentGroup studentsGroup = new StudentGroup(teacher, newList);
        studentsGroup.createStudent(student1);
        studentsGroup.createStudent(student2);
        studentsGroup.createStudent(student3);
        studentsGroup.createStudent(student4);
        studentsGroup.createStudent(student5);
        studentsGroup.createStudent(student6);

        StudentView studentView = new StudentView();

    }
}
