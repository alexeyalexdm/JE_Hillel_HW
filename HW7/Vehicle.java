package HW7;

public class Vehicle {
    private int price;
    private int maximumSpeed;
    private int fuelConsumption;

    public Vehicle(int price, int maximumSpeed) {
        this(price, 0, maximumSpeed);
    }


    public Vehicle(int price, int maximumSpeed, int fuelConsumption) {
        this.price = price;
        this.maximumSpeed = maximumSpeed;
        this.fuelConsumption = fuelConsumption;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }


    public int getMaximumSpeed() {
        return maximumSpeed;
    }

    public void setMaximumSpeed(int maximumSpeed) {
        this.maximumSpeed = maximumSpeed;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "price=" + price +
                ", maximumSpeed=" + maximumSpeed +
                ", fuelConsumption=" + fuelConsumption +
                '}';
    }
}
