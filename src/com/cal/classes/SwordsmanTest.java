package com.cal.classes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SwordsmanTest {

    @Test
    void doDamage() {
        Weapon weapon = new Weapon("Long sword", "basic", 0, 5, 200);
        Goblin goblin = new Goblin();
        Swordsman swordsman = new Swordsman();
        System.out.println("Player, it's your turn.");
        goblin.getDamage(swordsman);
        System.out.println("It's the enemy's turn.");
        swordsman.getDamaged(goblin);
        System.out.println(swordsman);
        System.out.println(goblin);
    }

    @Test
    void getHealed() {
    }
}