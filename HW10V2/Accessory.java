package HW10V2;

public class Accessory {

private String type;
private int price;

    public Accessory(String type, int price) {
        this.type = type;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Accessory{" +
                "type='" + type + '\'' +
                ", price=" + price +
                '}';
    }
}
