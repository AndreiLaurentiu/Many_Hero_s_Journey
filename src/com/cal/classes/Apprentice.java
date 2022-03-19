package com.cal.classes;

public class Apprentice implements Hero{
    int healthPoints = 80;
    final int baseDamage = 3;
    final int baseArmorLevel = 1;
    int realDamage;
    int realArmorLevel;
    final String className = "Apprentice";
    Weapon weapon;
    public Apprentice(){

    }

    Apprentice(Weapon weapon) throws CloneNotSupportedException {
        if(weapon.getClassId() != 2){
            throw new RuntimeException("An apprentice only uses magic weapons!");
        }
        this.weapon = new Weapon();
        this.weapon = (Weapon) weapon.clone();
    }

    @Override
    public int doDamage(){
        return 0;
    }

    @Override
    public void getHealed(int healPotion){

    }

    @Override
    public void getDamaged(Enemy enemy) {
        this.healthPoints -=  enemy.doDamage();
    }

    @Override
    public void getCoins() {

    }
}
