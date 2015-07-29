package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by lauren on 7/29/15.
 */
public interface Monster {
    // instance variables in interface are automatically public, static, and final
    //public int hitpoints;

    // methods in interfaces are automatically public and abstract
    public abstract void takeDamage(int amount);
    public abstract void reportStatus();
}
