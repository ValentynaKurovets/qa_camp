package com.company;

public class Man extends Human implements iTalk {

    @Override
    public void talk() {
        System.out.println("I talk");
    }

    @Override
    public void sleep() {
        System.out.println("I sleep better");
    }
}