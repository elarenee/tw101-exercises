package com.thoughtworks.tw101.exercises.exercise8;

// Exercise #8: Create a new version of Exercise #7 where you also record all of the user’s guesses and print them out
// once they guess correctly. Use an ArrayList to store the guesses. Catch the NumberFormatException and handle the case
// where the user entered a String that is not parseable.

public class Main {
    public static void main(String[] args) {
        GameRound round = new GameRound();
        int randomNumber = (int) (Math.random() * 101);
        int userGuess = IO.getUserInput("Choose a number from 1-100. ");
        while(userGuess != randomNumber) {
            if(userGuess < randomNumber)
                IO.tellUserTheyGuessedTooLow();
            else
                IO.tellUserTheyGuessedTooHigh();

            userGuess = IO.getUserInput("Choose a number from 1-100. ");
            round.updateGuesses(userGuess);
        }
        IO.tellUserTheyWon();
        round.printPreviousGuesses();
    }
}
