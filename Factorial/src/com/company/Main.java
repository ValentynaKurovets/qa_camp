package com.company;

public class Main {

    public static void main(String[] args) {
        int f = 5;
        int n;
        for (n = f; n > 1; n--) {
            f = f * (n - 1);
        }
        System.out.println(f);
    }
}