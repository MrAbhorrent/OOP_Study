package com.study.gb.Seminar02;

import java.util.ArrayList;
import java.util.List;

public class Market implements QueueBehaviour, MarketBehaviour{
    private final List<Actor> queue;

    private final String marketName;

    public Market() {
        this("SuperMarket");
    }

    public Market(String marketName) {
        this.marketName = marketName;
        this.queue = new ArrayList<>();
    }
    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println("Маркет " + marketName);
        System.out.println("  >> " + actor.getName() + " пришел в магазин");
        takeInQueue(actor);
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        System.out.println("Маркет " + marketName);
        for (Actor actor: actors) {
            System.out.println("   >> " + actor.getName() + " вышел из магазина");
            queue.remove(actor);
        }
    }

    @Override
    public void update() {
        takeOrder();
        giveOrder();

    }

    @Override
    public void takeInQueue(Actor actor) {
        System.out.println("Маркет " + marketName);
        System.out.println("   >> " + actor.getName() + " встал в очередь");
        this.queue.add(actor);
    }

    @Override
    public void takeOrder() {
        for (Actor actor: queue) {
            if (!actor.isMakeOrder) {
                actor.setMakeOrder(true);
                System.out.println("Маркет " + marketName);
                System.out.println("    >> " + actor.getName() + " сделал заказ");
            }
        }
    }

    @Override
    public void giveOrder() {
        for (Actor actor: queue) {
            if (actor.isMakeOrder) {
                actor.setTakeOrder(true);
                System.out.println(marketName + "    >> " + actor.getName() + " получил свой заказ");
            }
        }
        releaseFromQueue();
    }

    @Override
    public void releaseFromQueue() {
        List<Actor> releasedActors = new ArrayList<>();
        for (Actor actor: queue) {
            if (actor.isTakeOrder) {
                releasedActors.add(actor);
                System.out.println(marketName + "    >> " + actor.getName() + " вышел из очереди");
            }
        }
        releaseFromMarket(releasedActors);
    }
}
