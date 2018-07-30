package com.company;

public class Animal {
    private String name;
    private int age;
    private int height;
    private int steps;

    protected Animal(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height =height;
    }
    public void say(){
        System.out.println("say, my mane is "+name);
    }
    public void printInfo() {
        System.out.println("Age of " +name+ " is " + age);
        System.out.println("Height of " +name+ " is " + height);
        System.out.println(name+" wakls " +steps+ " for now");
    }
    public void go(int steps){
        this.steps = steps + this.steps;
    }
}