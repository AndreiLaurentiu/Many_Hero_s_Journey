package com.cal.main;

import com.cal.classes.Apprentice;
import com.cal.classes.Archer;
import com.cal.classes.Swordsman;
import com.cal.classes.Weapon;

public class Main {
    public static void main(String[] args) {
        Weapon shortSword = new Weapon("Short sword", "basic", 0);
        try {
            Swordsman swordsman = new Swordsman(shortSword);
            Archer archer = new Archer(shortSword);
            Apprentice apprentice = new Apprentice();
        }
        catch (CloneNotSupportedException exception){
            System.out.println("Clone method not working!");
        }
        catch (RuntimeException runtimeException){
            System.out.println("Runtime error from constructor! -> check weapon id");
        }
    }
}
