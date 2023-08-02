package com.study.gb.Seminar03.Model;

import java.time.LocalDate;

public class User {

    private String firstName;
    private String secondName;
    private String lastName;

    public User(String firstName, String secondName, String patronymic) {
        setFirstName(firstName);
        setSecondName(secondName);
        setLastName(lastName);
    }

    public String getFirstName() {

        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
