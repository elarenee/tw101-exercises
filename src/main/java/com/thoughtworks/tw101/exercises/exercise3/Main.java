package com.thoughtworks.tw101.exercises.exercise3;

public class Main {

//    Exercise #3: Create a function 'of' in the class OddSum that returns the sum of all odd integers between a starting
//    and ending integer value.

    public static void main(String[] args) {
        OddSum oddSum = new OddSum();

        Integer sum = oddSum.of(1, 100);
        //Integer sum = oddSum.of(2, 4); // returns 3
        //Integer sum = oddSum.of(2, 3); // returns 0
        //Integer sum = oddSum.of(3, 4); // returns 3 (should return 0, though, right?)
        
        System.out.println(sum);
    }
}
