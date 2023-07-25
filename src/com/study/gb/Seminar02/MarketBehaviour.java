package com.study.gb.Seminar02;

import java.util.List;

public interface MarketBehaviour {

    void acceptToMarket(Actor actor);
    void releaseFromMarket(List<Actor> actors);

    /**
     * метод update – обновляет состояние магазина (принимает и отдаёт заказы)
     */
    void update();
}
