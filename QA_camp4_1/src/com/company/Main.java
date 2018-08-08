package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> applesList = new ArrayList<>();
        applesList.add("greenApple");
        applesList.add("redApple");
        applesList.add("yellowApple");
        applesList.add("greenApple");
        for (String first : applesList) {
            int count = 0;
            for (String second : applesList) {
                if (first.equals(second)) {
                    count++;
                }
            }
            if (count > 1) {
                System.out.println(first);
            }
        }
    }
}
