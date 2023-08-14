package com.study.gb.Seminar06.data;

import java.time.LocalDate;

/**
 * 3. Liskov Substitution Principle:
 * Дочерний класс Student следует принципам родительского класса User и не изменяет их.
 *
 */
public class Student extends User implements Comparable<Student>{
    private Long studentId;

    public Student(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        super(firstName, secondName, patronymic, dateOfBirth);
    }

    public Student(String firstName, String secondName, String patronymic, LocalDate dateOfBirth, Long studentId) {
        super(firstName, secondName, patronymic, dateOfBirth);
        this.studentId = studentId;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

//    @Override
//    public String toString() {
//        return "Student{" +
//               "studentId='" + studentId +'\'' +
//               ", firstName='" + super.getFirstName() + '\'' +
//               ", secondName='" + super.getSecondName() + '\'' +
//               ", patronymic='" + super.getPatronymic() + '\'' +
//               ", dateOfBirth=" + super.getDateOfBirth() +
//               '}';
//    }
    @Override
    public String toString() {
        String[] className = getClass().getName().split("\\.");
        return "Student{" +
                "studentId='" + studentId +'\'' +
                super.getInfo() +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.studentId.compareTo(o.getStudentId());
    }
}
