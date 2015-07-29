package com.thoughtworks.tw101.exercises.exercise7;

// Write a program that chooses a random number between 1 and 100. Then asks the user to enter a guess. If they guess
// right then tell them they win, otherwise tell them if they guessed too high or low. Keep asking the user to guess
// until they get the right answer. Use classes to separate the different concerns of this program.

public class Main {

    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 101);
        int userGuess = IO.getUserInput("Choose a number from 1-100. ");
        while(userGuess != randomNumber) {

            if(userGuess < randomNumber)
                IO.tellUserTheyGuessedTooLow();
            else
                IO.tellUserTheyGuessedTooHigh();

            userGuess = IO.getUserInput("Choose a number from 1-100. ");
        }
        IO.tellUserTheyWon();
    }
}
