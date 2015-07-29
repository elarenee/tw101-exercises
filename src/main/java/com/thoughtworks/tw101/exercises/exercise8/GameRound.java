package com.thoughtworks.tw101.exercises.exercise8;

import java.util.ArrayList;

/**
 * Created by lauren on 7/29/15.
 */
public class GameRound {
    private static ArrayList<Integer> guessesSoFar = new ArrayList<Integer>();

    public void updateGuesses(int guess) {
        guessesSoFar.add(guess);
    }

    public void printPreviousGuesses () {
        System.out.println("These were your previous guesses: ");
        for (int guess : guessesSoFar) {
            System.out.println(guess);
        }
    }
}
