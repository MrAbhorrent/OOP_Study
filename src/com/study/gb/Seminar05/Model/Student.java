package com.study.gb.Seminar05.Model;

import java.time.LocalDate;

public class Student extends User {
     private int studentId;

     public Student(String firstName, String surName, String lastName, LocalDate birthDate, int studentId) {
          super(firstName, surName, lastName, birthDate);
          this.studentId = studentId;
     }

     public int getStudentId() {
          return studentId;
     }

     public void setStudentId(int studentId) {
          this.studentId = studentId;
     }

     @Override
     public String toString() {
          return "Student{" +
                  "FirstName='" + getFirstName() + '\'' +
                  ", LastName='" + getLastName() + '\'' +
                  ", SurName='" + getSurName() + '\'' +
                  ", BirthDate=" + getBirthDate() +
                  ", studentId=" + studentId +
                  '}';
     }
}
