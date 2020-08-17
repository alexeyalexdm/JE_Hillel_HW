package HW7;

public class Truck extends Vehicle {
    private int loadCapacity;

    public Truck(int price, int maximumSpeed, int fuelConsumption, int loadCapacity) {
        super(price, maximumSpeed, fuelConsumption);
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "loadCapacity=" + loadCapacity +
                "price=" + getPrice() +
                ", maximumSpeed=" + getMaximumSpeed() +
                ", fuelConsumption=" + getFuelConsumption() +
                '}';
    }
}
