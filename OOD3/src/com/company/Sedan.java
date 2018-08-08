package com.company;

public class Sedan extends Car {
    String type;
    float height;
    float length;
    float weight;

    protected Sedan() {
        this.type = "Sedan";
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
        System.out.println("Sh...");
    }
}
