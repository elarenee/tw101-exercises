package com.thoughtworks.tw101.exercises.exercise7;
import java.io.*;
import java.text.ParseException;
import java.util.*;
import java.util.Scanner;

/**
 * Created by lauren on 7/29/15.
 */
public class IO {

    public static int getUserInput(String prompt) {
        String userInput = new String();
        System.out.print(prompt + " ");
        Scanner cmdLineInput = new Scanner(System.in);
        userInput = cmdLineInput.next();
        int userGuess = 0;
        try {
            userGuess = Integer.parseInt(userInput);
        }
        catch (NumberFormatException e) {
            System.out.println("Error: Please enter an integer value.");
            getUserInput(prompt);
        }
        return userGuess;
    }

    public static void tellUserTheyGuessedTooLow() {
        System.out.println("Sorry, your number was too low. Guess again.");
    }

    public static void tellUserTheyGuessedTooHigh() {
        System.out.println("Sorry, your number was too high. Guess again.");
    }

    public static void tellUserTheyWon() {
        System.out.println("Congratulations! You've guessed correctly!");
    }
}
