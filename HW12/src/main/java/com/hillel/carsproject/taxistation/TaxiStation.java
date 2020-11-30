package com.hillel.carsproject.taxistation;

import com.hillel.carsproject.taxistation.car.Car;

public class TaxiStation {

    public int carsPrice(Car[] cars) {
        int sum = 0;

        for (Car car : cars) {
            sum = sum + car.getPrice();
        }
        return sum;
    }

    public void sortByFuelConsumption(Car[] cars) {
        bubbleSort(cars);
    }

    public Car[] filterCarsBySpeed(Car[] cars, int max, int min) {
        int counter = 0;
        Car[] result = new Car[counter];
        for (Car car : cars) {
            if (car.getSpeed() >= min && car.getSpeed() <= max) {
                result = increaseCars(result);
                result[counter] = car;
                counter++;
            }
        }
        return result;
    }

    private void bubbleSort(Car[] cars) {
        int n = cars.length;
        Car temp;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (cars[j - 1].getFuelConsumption() > cars[j].getFuelConsumption()) {
                    temp = cars[j - 1];
                    cars[j - 1] = cars[j];
                    cars[j] = temp;
                }

            }
        }
    }

    private Car[] increaseCars(Car[] cars) {
        Car[] result = new Car[cars.length + 1];
        for (int i = 0; i < cars.length; i++) {
            result[i] = cars[i];
        }
        return result;
    }
}