package com.cal.classes;

public class Weapon implements Cloneable{
    private String name;
    private String quality;
    private int classId;
    private int extraDamagePoints;
    private int price;

    public Weapon(String name, String quality, int classId, int extraDamagePoints, int price){
        this.name = name;
        this.quality = quality;
        this.classId = classId;
        this.extraDamagePoints = extraDamagePoints;
        this.price = price;
    }
    public Weapon(){

    }


    public String getQuality() {
        return quality;
    }

    public int getExtraDamagePoints() {
        return extraDamagePoints;
    }

    public Weapon(int classId){
        this.classId = classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public int getClassId(){
        return classId;
    }

    public Weapon clone() throws CloneNotSupportedException {
        return (Weapon) super.clone();
    }
}
