package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] numbers = {6, 12, 3, 90};
        boolean isSorted = false;
        int tmp;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    isSorted = false;
                    tmp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}