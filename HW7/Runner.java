package HW7;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        Vehicle[] vehicles = {new Bus(15000, 25, 150, 20),
                new Truck(156848, 15158, 164848, 15488)};
        TaxiPark tp = new TaxiPark(vehicles);
        System.out.println(tp.calculateCost());
        System.out.println();

        System.out.println(tp);
        System.out.println();

        tp.sortCarsByFuelConsumption();
        System.out.println(tp);

        System.out.println(Arrays.toString(tp.findCarsBySpeedRange(120, 130)));
        System.out.println(tp.findCarsBySpeedRange(120, 130));
    }
}
