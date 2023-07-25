package com.study.gb.Seminar02;

public class Human extends Actor {

    public Human(String name) {
        super(name);
    }

    @Override
    public void setMakeOrder(boolean flagMakeOrder) {
        super.isMakeOrder = flagMakeOrder;
    }

    @Override
    public void setTakeOrder(boolean flagTakeOrder) {
        super.isTakeOrder = flagTakeOrder;
    }

    @Override
    public boolean isMakeOrder() {

        return super.isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {

        return super.isTakeOrder;
    }

    @Override
    String getName() {
        return super.getName();
    }
}
