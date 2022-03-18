package com.cal.classes;

public class Archer implements Hero{
    final int baseDamage = 4;
    final int baseArmorLevel = 2;
    int realDamage;
    int realArmorLevel;
    final String className = "Archer";
    Weapon weapon;
    public Archer(){

    }

    public Archer(Weapon weapon) throws CloneNotSupportedException {
        if(weapon.getClassId() != 1){
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
