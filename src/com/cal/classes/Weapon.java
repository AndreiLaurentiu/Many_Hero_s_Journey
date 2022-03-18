package com.cal.classes;

public class Weapon implements Cloneable{
    private String name;
    private String quality;
    private int classId;
    public Weapon(String name, String quality, int classId){
        this.name = name;
        this.quality = quality;
        this.classId = classId;
    }
    public Weapon(){

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
