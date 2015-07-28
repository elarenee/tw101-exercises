package com.thoughtworks.tw101.exercises.exercise3;

public class OddSum {

    public int of(int start, int end) {
        int x = start;
        int y = end;
        int sum = 0;
        while (x < y) {
            if (isOdd(x)) {
                sum += x;
            }
            x++;
        }
        return sum;
    }

    // should this method be part of this class? is it too general?
    public static boolean isOdd(int n) {
        if(n % 2 != 0)
            return true;
        return false;
    }
}

