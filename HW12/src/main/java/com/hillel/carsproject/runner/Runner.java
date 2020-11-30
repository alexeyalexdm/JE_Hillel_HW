package com.hillel.carsproject.runner;

import com.hillel.carsproject.input.InputAction;
import com.hillel.carsproject.taxistation.car.Car;

public class Runner {
    public static void main(String[] args) {
        InputAction ip = new InputAction();
        Car[] converted = ip.convertedCars();
        ip.readFile();
        ip.writeFile(converted);
    }
}










