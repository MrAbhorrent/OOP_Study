package com.study.gb.Seminar02;

import java.util.ArrayList;
import java.util.List;

public class Main {

//    Реализовать класс Market и все методы, которые он обязан реализовывать.
//    Методы из интерфейса QueueBehaviour, имитируют работу очереди,
//    MarketBehaviour – помещает и удаляет человека из очереди,
//    метод update – обновляет состояние магазина (принимает и отдаёт заказы)

    public static void main(String[] args) {
        // Создаем покупателей
        Human human1 = new Human("Jhon");
        Human human2 = new Human("Maria");
        Human human3 = new Human("Smith");
        Human human4 = new Human("Mortheus");

        List<Human> actors = new ArrayList<>();
        actors.add(human1);
        actors.add(human2);
        actors.add(human3);
        actors.add(human4);

        // Создаем класс Market
        Market market = new Market();
        // Добавляем в Market посетителей
        for (Actor actor: actors) {
            market.acceptToMarket(actor);
        }
        market.update();
    }
}
