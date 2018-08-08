package com.company;

public abstract class Car {
    public  String getType(){return "Unknown";};
    public abstract float getWeight();
    public abstract float getLength();
    public abstract float getHeight();
    public void go() {
        System.out.println("Dir dir dir ...");
    }
}
