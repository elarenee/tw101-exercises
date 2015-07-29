package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by lauren on 7/29/15.
 */
public class Troll implements Monster {

    private int hitpoints;
    private String name;

    public Troll(int hitpoints, String name) {
        this.hitpoints = hitpoints;
        this.name = name;
    }

    public void takeDamage(int amount){
        hitpoints -= (amount/2);
    }
    public void reportStatus(){
        System.out.println(name + " " + hitpoints);
    }
}
