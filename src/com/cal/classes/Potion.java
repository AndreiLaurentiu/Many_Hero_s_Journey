package com.cal.classes;

public abstract class Potion {
    String type;
    int price;

    public Potion(String type, int price) {
        this.type = type;
        this.price = price;
    }
    public abstract void applyEffect(Hero hero);
}
