package com.study.gb.Seminar03;

import com.study.gb.Seminar03.Model.Student;
import com.study.gb.Seminar03.Model.StudentsGroup;
import com.study.gb.Seminar03.Service.StudentGroupService;

public class Main {

//    — Создать класс Steam, содержащий в себе список УчебныхГрупп и реализующий интерфейс Iterable;
//    — Создать класс StreamComparator, реализующий сравнение количества групп, входящих в Поток;
//    — Создать класс SteamService, добавив в него метод сортировки списка потоков, используя созданный StreamComparator;
//    — Модифицировать класс Controller, добавив в него созданный сервис;
//    — Модифицировать класс Controller, добавив в него метод, сортирующий список потоков, путём вызова созданного сервиса.

    public static void main(String[] args) {

        Student student1 = new Student(12, "Иванов", "Иван", "Иванович");
        Student student2 = new Student(13, "Петров", "Иван", "Иванович");
        Student student3 = new Student(11, "Сидоров", "Иван", "Иванович");
        Student student4 = new Student(21, "Болконская", "Иван", "Иванович");
        Student student5 = new Student(14, "Романов", "Сергей", "Иванович");
        Student student6 = new Student(22, "Ромашов", "Иван", "Иванович");

        StudentsGroup studentsGroup = new StudentsGroup();
        studentsGroup.addStudent(student1);
        studentsGroup.addStudent(student2);
        studentsGroup.addStudent(student3);
        studentsGroup.addStudent(student4);
        studentsGroup.addStudent(student5);
        studentsGroup.addStudent(student6);

        StudentGroupService studentsGroupService = new StudentGroupService();
        //studentsGroupService.setStudentsGroup(studentsGroup);

        System.out.println(studentsGroup);

        //studentsGroupService.removeStudent("Романов", "Сергей", "Иванович");

        System.out.println(studentsGroup);
    }
}
