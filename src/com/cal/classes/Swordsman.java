package com.cal.classes;

public class Swordsman implements Hero{
    final int baseDamage = 5;
    final int baseArmorLevel = 3;
    int realDamage;
    int realArmorLevel;
    final String className = "Swordsman";
    Weapon weapon;
    public Swordsman(){

    }

    public Swordsman(Weapon weapon) throws CloneNotSupportedException {
        if(weapon.getClassId() != 0){
            throw new RuntimeException("A swordsman only uses melee weapons!");
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
