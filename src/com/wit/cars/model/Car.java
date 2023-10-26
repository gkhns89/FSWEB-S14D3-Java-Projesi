package com.wit.cars.model;

import java.util.Objects;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;


    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine(){
        System.out.println("Class name: "+getClass().getSimpleName());
        return "The car's engine is starting!";

    }

    public String accelerate(){

        System.out.println("Class name: "+getClass().getSimpleName());
        return "The car is accelerating!";


    }

    public String brake () {

        System.out.println("Class name: "+getClass().getSimpleName());
        return "The car is braking!";
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", cylinders=" + cylinders +
                ", name='" + name + '\'' +
                ", wheels=" + wheels +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;
        return getCylinders() == car.getCylinders() && Objects.equals(getName(), car.getName());
    }
}
