package com.study.gb.Seminar01;

import java.util.List;

public interface VendingMachine {

    void initVendingMachine();
    Product getProduct(String name) throws IllegalStateException;

}
