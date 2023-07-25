package com.study.gb.Seminar02;

public interface ActorBehaviour {

    void setMakeOrder(boolean flag);
    void setTakeOrder(boolean flag);

    boolean isMakeOrder();
    boolean isTakeOrder();
}
