package com.thoughtworks.tw101.introductory_programming_exercises;

//  Prime Factors Exercise
//  Write a method generate(int n) that given an integer N will return a list of integers such that the numbers
//  are the prime factors of N and are arranged in increasing numerical order.
//
//  For example, generate(1) should return an empty list and generate(30) should return the numbers: 2,3,5.

import java.util.IntSummaryStatistics;
import java.util.*;

public class PrimeFactors {
    public static void main(String[] args) {
        List<Integer> primeFactors = generate(30);
        /*List<Integer> primeFactors2 = generate(0);
        List<Integer> primeFactors3 = generate(256);
        List<Integer> primeFactors4 = generate(17);

        System.out.println(primeFactors);
        System.out.println(primeFactors2);
        System.out.println(primeFactors3);
        System.out.println(primeFactors4);*/
    }

    private static List<Integer> generate(int n) {
        List<Integer> factors = new ArrayList<Integer>();
        int divisor = 2;
        while(divisor <= n/2) {
            if(n % divisor == 0 && isPrime(divisor))
                factors.add(divisor);
            divisor++;
        }
        return factors;
    }

    private static boolean isPrime(int n) {
        int i = 2;
        while (i <= n/2) {
            if(n % i == 0)
                return false;
            i++;
        }
        return true;
    }
}
