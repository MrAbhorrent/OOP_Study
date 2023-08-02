package com.study.gb.Seminar05.Model;

import java.time.LocalDate;

public abstract class User {
    private String FirstName;
    private String LastName;
    private String SurName;
    private LocalDate BirthDate;

    User(String firstName, String surName, String lastName, LocalDate birthDate){
        setFirstName(firstName);
        setSurName(surName);
        setLastName(lastName);
        setBirthDate(birthDate);
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getSurName() {
        return SurName;
    }

    public void setSurName(String surName) {
        SurName = surName;
    }

    public LocalDate getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        BirthDate = birthDate;
    }

    @Override
    public String toString() {
        return "User{" +
                "FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", SurName='" + SurName + '\'' +
                ", BirthDate=" + BirthDate +
                '}';
    }
}
