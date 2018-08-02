package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] numbers = new int[4];
        numbers[0] = 1;
        numbers[1] = 12;
        numbers[2] = 6;
        numbers[3] = 10;
        Arrays.sort(numbers);
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        // write your code here
    }
}
