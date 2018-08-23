package com.company;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        int[] intArray = {10, 10, 11, 15, 2, 4, 0};

        List<Integer> intList = IntStream.of(intArray).boxed().collect(Collectors.toList());

        intList.forEach(System.out::println);

        intList.stream().min(Integer::compareTo).ifPresent(i -> System.out.println("min = " + i));

        intList.stream().max(Integer::compareTo).ifPresent(i -> System.out.println("max = " + i));

        intList.stream().mapToInt(Integer::intValue).average().ifPresent(i -> System.out.println("average = " + i));

        intList.stream().sorted(Comparator.reverseOrder()).forEach(i -> System.out.println("sorted: " + i));

        intList.stream().filter(i -> i.equals(10)).forEach(i -> System.out.println("filtered = " + i));
    }
}
