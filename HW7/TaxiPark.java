package HW7;

import java.util.Arrays;

public class TaxiPark {
    private Vehicle[] vehicles;

    public TaxiPark(Vehicle[] vehicles) {
        this.vehicles = vehicles;
    }

    public int calculateCost() {
        int cost = 0;
        for (Vehicle vehicle : vehicles) {
            cost += vehicle.getPrice();
        }
        return cost;
    }

    public void sortCarsByFuelConsumption() {
        for (int i = 0; i < vehicles.length; i++) {
            for (int j = i + 1; j < vehicles.length; j++) {
                if (vehicles[j].getFuelConsumption() < vehicles[i].getFuelConsumption()) {
                    Vehicle temp = vehicles[j];
                    vehicles[j] = vehicles[i];
                    vehicles[i] = temp;
                }
            }
        }
    }

    public Vehicle[] findCarsBySpeedRange(int minSpeed, int maxSpeed) {
        Vehicle[] res = {};

        for (Vehicle vehicle : getVehicles()) {
            if (vehicle.getMaximumSpeed() >= minSpeed && vehicle.getMaximumSpeed() <= maxSpeed) {
                res = extendCarsArrayByNewCar(vehicle, res);

            }
        }
        return res;
    }

    private Vehicle[] extendCarsArrayByNewCar(Vehicle carToAdd, Vehicle[] vehicles) {
        if (vehicles.length == 0) {
            return new Vehicle[]{carToAdd};
        } else {
            Vehicle[] newCarsArr = new Vehicle[vehicles.length + 1];

            for (int i = 0; i < vehicles.length; i++) {
                newCarsArr[i] = vehicles[i];
            }
            newCarsArr[vehicles.length] = carToAdd;
            return newCarsArr;
        }
    }

    public Vehicle[] getVehicles() {
        return vehicles;
    }

    public void setVehicles(Vehicle[] vehicles) {
        this.vehicles = vehicles;
    }

    @Override
    public String toString() {
        String result = "";

        for (Vehicle vehicle : vehicles) {
            result += (vehicle.toString() + "\n");

        }
        return result;
    }
}
