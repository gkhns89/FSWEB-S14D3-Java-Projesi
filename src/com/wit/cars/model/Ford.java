package com.wit.cars.model;

public class Ford  extends  Car{
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }
    @Override
    public String startEngine() {
      super.startEngine();
        return getName() + " the car's engine is starting!";
    }

    @Override
    public String accelerate() {
         super.accelerate();
        return getName() + " the car is accelerating!";
    }

    @Override
    public String brake() {
         super.brake();
        return getName() + " the car is braking!";
    }
}
