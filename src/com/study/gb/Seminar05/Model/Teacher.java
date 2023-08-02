package com.study.gb.Seminar05.Model;

import java.time.LocalDate;

public class Teacher extends User {
     private int teacherId;

     public Teacher(String firstName, String surName, String lastName, LocalDate birthDate, int teacherId) {
          super(firstName, surName, lastName, birthDate);
          setTeacherId(teacherId);
     }

     public int getTeacherId() {
          return teacherId;
     }

     public void setTeacherId(int teacherId) {
          this.teacherId = teacherId;
     }
}
