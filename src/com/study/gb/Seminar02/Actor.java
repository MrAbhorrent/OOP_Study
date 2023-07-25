package com.study.gb.Seminar02;

public abstract class Actor implements ActorBehaviour {

    protected String name;
    protected boolean isMakeOrder;
    protected boolean isTakeOrder;

    public abstract void setMakeOrder(boolean flagMakeOrder);

    String getName() {
        return this.name;
    }

    public Actor(String name) {
        this.name = name;
    }
}
