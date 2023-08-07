package com.study.gb.Seminar05;

import com.study.gb.Seminar05.data.Student;
import com.study.gb.Seminar05.data.StudentGroup;
import com.study.gb.Seminar05.data.Teacher;
import com.study.gb.Seminar05.data.User;
import com.study.gb.Seminar05.view.StudentView;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

//      — Создать класс УчебнаяГруппа, содержащий в себе поля Преподаватель и список Студентов;
//      — Создать класс УчебнаяГруппаСервис, в котором реализована функция (входные параметры - (Teacher, List<Strudent>)) формирования из Студентов и Преподавателя УчебнойГруппы и возвращения его;
//      — Создать метод в Контроллере, в котором агрегируются функции получения списка студентов (их id) и преподавателя (его id) и формирования учебной группы, путём вызова метода из сервиса;
//      — Всё вышеуказанное создать согласно принципам ООП, пройдённым на семинаре.

    public static void main(String[] args) {
        User student1 = new Student("Иванов", "Иван", "Иванович", LocalDate.now(), 1213L);
        User student2 = new User("Петров", "Иван", "Иванович", LocalDate.now());
        User student3 = new User("Сидоров", "Иван", "Иванович", LocalDate.now());
        User student4 = new User("Болконская", "Иван", "Иванович", LocalDate.now());
        User student5 = new User("Романов", "Сергей", "Иванович", LocalDate.now());
        User student6 = new User("Ромашов", "Иван", "Иванович", LocalDate.now());
        System.out.println(student1);
        System.out.println(student2);

        User teacher = new Teacher("Букашкин", "Александр", "", LocalDate.now());
        System.out.println(teacher);
        List<Student> newList = new ArrayList<>();

        StudentGroup studentsGroup = new StudentGroup((Teacher) teacher, newList);
        studentsGroup.createStudent(student1);
        studentsGroup.createStudent(student2);
        studentsGroup.createStudent(student3);
        studentsGroup.createStudent(student4);
        studentsGroup.createStudent(student5);
        studentsGroup.createStudent(student6);

        StudentView studentView = new StudentView();

    }
}
