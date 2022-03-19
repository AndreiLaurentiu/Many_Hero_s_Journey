package com.cal.classes;

public class Swordsman implements Hero{
    int healthPoints = 100;
    final int baseDamage = 5;
    final int baseArmorLevel = 3;
    int realDamage;
    int realArmorLevel;
    final String className = "Swordsman";
    private int coins;
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

    public void setRealDamage() {
        if(weapon.getQuality().equals("basic"))
            this.realDamage = (int) (baseDamage + weapon.getExtraDamagePoints()*1.25);
    }

    @Override
    public int doDamage(){
        return 0;
    }

    @Override
    public void getHealed(int healPotion){
        if(healthPoints <= 90)
            healthPoints += healPotion;
    }

    @Override
    public void getDamaged(Enemy enemy) {
        this.healthPoints -= enemy.doDamage();
    }

    @Override
    public void getCoins() {

    }

    @Override
    public String toString() {
        return "Swordsman{" +
                "healthPoints=" + healthPoints +
                '}';
    }
}
