package com.company;

public class Main {

    public static void main(String[] args) {
	    Car sedan = ProductFactory.createCar("Sedan");
	    Car hatchback = ProductFactory.createCar("Hatchback");
        Car mini = ProductFactory.createCar("Mini");
        Car limousine = ProductFactory.createCar("Limousine");
        Car suv = ProductFactory.createCar("SUV");
        Car defaultCar = ProductFactory.createCar("");
        Car unknown = ProductFactory.createCar("Lorry");

        sedan.go();
        hatchback.go();
        mini.go();
        limousine.go();
        suv.go();
        defaultCar.go();
        unknown.go();
    }
}
