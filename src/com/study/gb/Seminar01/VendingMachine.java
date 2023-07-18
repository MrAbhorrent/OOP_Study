package com.study.gb.Seminar01;

public interface VendingMachine {

    void initVendingMachine();
    Product getProduct(String name) throws IllegalStateException;
}
