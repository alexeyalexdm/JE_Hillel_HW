package com.hillel.taxistation.comparator;

import com.hillel.taxistation.models.Car;

import java.util.Comparator;

public class SortFuelComparator implements Comparator<Car>{

    @Override
    public int compare(Car car1, Car car2) {
        return Double.compare(car1.getFuelConsumption(),car2.getFuelConsumption());
    }
}