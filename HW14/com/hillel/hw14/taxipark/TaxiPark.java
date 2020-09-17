package HW14.com.hillel.hw14.taxipark;

import HW14.com.hillel.hw14.Car.Car;

import java.util.Arrays;
import java.util.Comparator;
import java.util.StringJoiner;

public class TaxiPark {

    private Car[] cars;

    public TaxiPark(Car[] cars) {
        this.cars = cars;
    }

    public void sortByFuelConsumption() {
        Arrays.sort(cars.fuelComparatorByRealization);
    }

    private Comparator<Car> fuelComparatorByRealization = new Comparator<Car>() {
        @Override
        public int compare(Car c1, Car c2) {
            return c1.getFuelConsumption() - c2.getFuelConsumption();
        }
    };

    private Comparator<Car> fuelComparatorByLambde = (c1, c2) -> c1.getFuelConsumption() - c2.getFuelConsumption();

    private int compareFuelForTwoCars(Car c1,Car c2) {
        return c1.getFuelConsumption() - c2.getFuelConsumption();
    }

    @Override
    public String toString() {
        StringJoiner sj = new StringJoiner(",\n");
        for (Car car: cars) {
            sj.add(car.toString());
        }
        return sj.toString();
    }

    public Car[] getCars() {
        return cars;
    }

    public void setCars(Car[] cars) {
        this.cars = cars;
    }

}
