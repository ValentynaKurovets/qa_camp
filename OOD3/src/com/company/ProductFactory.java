package com.company;

public class ProductFactory {
    public static Car createCar (String type) {
        switch (type) {
            case "Sedan": return new Sedan();
            case "Hatchback": return new Hatchback();
            case "Mini": return new Mini();
            case "Limousine": return new Limousine();
            case "SUV": return new Suv();
            case "": return new Sedan();
            default: return new Sedan();
        }
    }
}

