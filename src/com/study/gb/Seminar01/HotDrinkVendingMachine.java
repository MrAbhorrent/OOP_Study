package com.study.gb.Seminar01;

import java.util.List;

public class HotDrinkVendingMachine implements VendingMachine {
    List<HotDrink> products;

    @Override
    public void initVendingMachine() {

    }

    public void initVendingMachine(List<HotDrink> products) {
        this.products = products;
    }

    @Override
    public Product getProduct(String name) throws IllegalStateException {
        for(HotDrink product: products){
            if(product instanceof BottleOfWater){
                if (product.getName().equalsIgnoreCase(name)) {
                    return product;
                }
            }
        }
        throw new IllegalStateException(String.format("Продукт c названием %s не найден.", name));

    }


    public Product getProduct(String name, int volume, double temperature){

        for(HotDrink product: products){
            if(product instanceof BottleOfWater){
                if(product.getName().equalsIgnoreCase(name)
                        && product.getVolume() == volume
                        &&  product.getTemperature() == temperature) {
                    return product;
                }
            }
        }
        throw new IllegalStateException(String.format("Продукт c названием %s не найден.", name));
    }


}
