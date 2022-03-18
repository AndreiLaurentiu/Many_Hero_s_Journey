package com.cal.classes;

public class Apprentice implements Hero{
    final int baseDamage = 3;
    final int baseArmorLevel = 1;
    int realDamage;
    int realArmorLevel;
    final String className = "Apprentice";
    Weapon weapon;
    public Apprentice(){

    }

    Apprentice(Weapon weapon) throws CloneNotSupportedException {
        if(weapon.getClassId() != 0){
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
    public void getHealed(int HealPotion){

    }
}
