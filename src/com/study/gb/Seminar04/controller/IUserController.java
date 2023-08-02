package com.study.gb.Seminar04.controller;

import com.study.gb.Seminar04.data.User;

public interface IUserController<T extends User> {
    void create(String firstName, String surName, String lastName);
}
