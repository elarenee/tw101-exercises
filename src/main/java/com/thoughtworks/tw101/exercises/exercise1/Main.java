package com.thoughtworks.tw101.exercises.exercise1;

// Exercise #1: Print all odd numbers from 1 to 100 and their sum.

public class Main {
    public static void main(String[] args) {

        printAllOddNumsFrom1to100AndSum();
    }

    private static void printAllOddNumsFrom1to100AndSum() {
        int x = 0;
        int sum = 0;
        while (x < 100) {
            if (isOdd(x)) {
                System.out.println(x);
                sum += x;
            }
            x++;
        }
        System.out.println("The sum of all odd numbers 1-100 is "+sum+".");
    }

    public static boolean isOdd(int n) {
        if(n % 2 != 0)
            return true;
        return false;
    }
}
