package com.cal.classes;

public class Goblin implements Enemy{
    int healthPoints = 20;
    @Override
    public void tauntHero(){
        System.out.println("Quick slashes, piles of gold!");
    }
    @Override
    public int doDamage(){
        return 3;
    }

    public Goblin() {

    }
    public void getDamage(Hero hero){
        this.healthPoints -= hero.doDamage();
    }

    @Override
    public String toString() {
        return "Goblin{" +
                "healthPoints=" + healthPoints +
                '}';
    }
}
