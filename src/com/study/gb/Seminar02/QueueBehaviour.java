package com.study.gb.Seminar02;

public interface QueueBehaviour {

    void takeInQueue(Actor actor);
    void takeOrder();
    void giveOrder();
    void releaseFromQueue();
}
