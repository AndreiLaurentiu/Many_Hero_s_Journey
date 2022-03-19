package com.cal.classes;

public class HealthPotion extends Potion {
    String size;

    public HealthPotion(String type, int price, String size) {
        super(type, price);
        this.size = size;
    }

    @Override
    public void applyEffect(Hero hero) {
        if(size.equals("small"))
            hero.getHealed(10);
        if(size.equals("medium"))
            hero.getHealed(20);
        if(size.equals("large"))
            hero.getHealed(30);
    }
}
