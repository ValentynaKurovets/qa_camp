package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List numberList = new ArrayList();
        numberList.add(5);
        numberList.add(10);
        numberList.add(2);
        numberList.add(19);
        Collections.sort(numberList);
        System.out.println(numberList);
        Collections.reverse(numberList);
        System.out.println(numberList);
//      System.out.println(numberList.get(0));
//      System.out.println(numberList.get(1));
//      System.out.println(numberList.get(2));
//      System.out.println(numberList.get(3));
        // write your code here
    }
}
