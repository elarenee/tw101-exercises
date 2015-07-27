package com.thoughtworks.tw101.exercises.exercise2;

public class Accumulator {
    int numberOfCallsToIncrement;

    void increment () {
        numberOfCallsToIncrement++;
    }

    void total() {
        System.out.print(numberOfCallsToIncrement);
    }
}
