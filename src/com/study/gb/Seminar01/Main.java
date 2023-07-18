package com.study.gb.Seminar01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

//    1. Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
//    2. Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать перегруженный метод getProduct(int name, int volume, int temperature), выдающий продукт соответствующий имени, объёму и температуре
//    3. В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и воспроизвести логику, заложенную в программе
//    4. Всё вышеуказанное создать согласно принципам ООП, пройденным на семинаре

    public static void main(String[] args) {
        HotDrink cup1 = new HotDrink("Drink1", 10, 1, 45);
        HotDrink cup2 = new HotDrink("Drink2", 15, 1, 60);
        HotDrink cup3 = new HotDrink("Drink3", 25, 2, 45);
        HotDrink cup4 = new HotDrink("Drink1", 14, 2, 30);

        List<Product> hotProduct = new ArrayList<>();
        hotProduct.add(cup1); hotProduct.add(cup2); hotProduct.add(cup3); hotProduct.add(cup4);
        System.out.println(cup1);


        HotDrinkVendingMachine hotDrinkVendingMachine = new HotDrinkVendingMachine();
        hotDrinkVendingMachine.initVendingMachine();
        String searchProduct = "drink1";
        String searchStr = "";
        if (hotDrinkVendingMachine.getProduct(searchProduct) != null) {
            searchStr = hotDrinkVendingMachine.getProduct(searchProduct).toString();
        }
        System.out.printf("В автомате ищем %s :\n%s%n", searchProduct, searchStr);

        String[] searchParams = {"drink1", "2", "30"};
        if (hotDrinkVendingMachine.getProduct(searchParams[0], Integer.parseInt(searchParams[1]), Integer.parseInt(searchParams[2])) != null) {
            searchStr = hotDrinkVendingMachine.getProduct(searchProduct, 2, 30).toString();
        }
        System.out.printf("В автомате ищем %s :\n%s%n", Arrays.toString(searchParams), searchStr);
    }
}
