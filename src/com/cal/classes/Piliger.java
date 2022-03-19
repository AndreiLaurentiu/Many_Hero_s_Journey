package com.cal.classes;

public class Piliger implements Enemy{
    final int healthPoints = 30;
    @Override
    public void tauntHero(){
        System.out.println("Can't escape my aim!");
    }
    @Override
    public int doDamage(){
        return 0;
    }
}
