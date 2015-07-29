package com.thoughtworks.tw101.exercises.exercise7;
import java.io.*;
import java.util.*;

/**
 * Created by lauren on 7/29/15.
 */
public class IO {

    // method from Chapter 5 of Head First Java :
    // doesn't check for invalid non-integer input
    public static int getUserInput(String prompt) {
        String inputLine = null;
        System.out.print(prompt + "  ");
        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputLine = is.readLine();
            if (inputLine.length() == 0 )
                getUserInput(prompt);
        } catch (IOException e) {
            System.out.println("IOException: " + e);
        }
        return Integer.parseInt(inputLine.toLowerCase());
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
