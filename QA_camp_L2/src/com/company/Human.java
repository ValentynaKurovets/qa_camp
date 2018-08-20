package com.company;

public class Human implements java.io.Serializable {

    private String name;
    private int age;

    public Human(){}

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String humanData() {
        return "Name: " + name + ", " + " age: " + age;
    }
}
