package com.thoughtworks.tw101.introductory_programming_exercises;

public class TriangleExercises {
    public static void main(String[] args) {
        drawAnAsterisk();
        System.out.println();
        drawAHorizontalLine(8);
        System.out.println();
        drawAVerticalLine(3);
        System.out.println();
        drawARightTriangle(3);
        System.out.println();
    }

//    Easiest exercise ever
//    Print one asterisk to the console.
//    Example: *
    private static void drawAnAsterisk() {
        System.out.println("*");
    }

//    Draw a horizontal line
//    Given a number n, print n asterisks on one line.
//    Example when n=8:  ********
    private static void drawAHorizontalLine(int n) {
        while (n > 0) {
            System.out.print("*");
            n--;
        }
        System.out.println();
    }

//    Draw a vertical line
//    Given a number n, print n lines, each with one asterisks
//    Example when n=3:
//            *
//            *
//            *
    private static void drawAVerticalLine(int n) {
        while (n > 0) {
            System.out.println("*");
            n--;
        }
    }

//    Draw a right triangle
//    Given a number n, print n lines, each with one more asterisk than the last (i.e. one on the first line, two on the second,etc.)
//    Example when n=3:
//            *
//            **
//            ***
    private static void drawARightTriangle(int n) {
        int width = 1;
        while (n > 0) {
            for(int i = 0; i < width; i++) {
                System.out.print("*");
            }
            System.out.println();
            width++;
            n--;
        }
    }
}
