package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[][] numbers = {{4, 0, 15, 9}, {4, 1, 6, 678, 5947}};
        int max = numbers[0][0];
        int min = numbers[0][0];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (max < numbers[i][j]) {
                    max = numbers[i][j];
                }
            }
        }
        System.out.println("Максимальне значення = " + max);

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (min > numbers[i][j]) {
                    min = numbers[i][j];
                }
            }
        }
        System.out.println("Мінімальне значення = " + min);
    }
}