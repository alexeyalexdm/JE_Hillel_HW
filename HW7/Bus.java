package HW7;

public class Bus extends Vehicle {
    private int numberOfSeats;

    public Bus(int price, int maximumSpeed, int fuelConsumption, int numberOfSeats) {
        super(price, maximumSpeed, fuelConsumption);
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "numberOfSeats=" + numberOfSeats +
                "price=" + getPrice() +
                ", maximumSpeed=" + getMaximumSpeed() +
                ", fuelConsumption=" + getFuelConsumption() +
                '}';
    }
}
