package com.company;

public class Hatchback extends Car {
    String type;
    float height;
    float length;
    float weight;

    protected Hatchback() {
        this.type = "Hatchback";
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public float getWeight() {
        return weight;
    }

    @Override
    public float getLength() {
        return length;
    }

    @Override
    public float getHeight() {
        return height;
    }
    @Override
    public void go(){
        System.out.println("Hrrr...");
    }
}
