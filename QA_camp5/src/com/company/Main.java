package com.company;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal("Topaz", 12, 50);
        Animal cat = new Animal("Bars", 2,  30);
        dog.say();
        cat.say();
        dog.printInfo();
        cat.printInfo();
        dog.go(30);
        cat.go(50);
        dog.printInfo();
        cat.printInfo();
    }
}
