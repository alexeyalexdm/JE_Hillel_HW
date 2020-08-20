package HW10V2;

public class Flower {

    private String name;
    private int price;
    private int stemLength;
    private String colour;

    public Flower(String name, int price, int stemLength, String colour) {
        this.name = name;
        this.price = price;
        this.stemLength = stemLength;
        this.colour = colour;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStemLength() {
        return stemLength;
    }

    public void setStemLength(int stemLength) {
        this.stemLength = stemLength;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", stemLength=" + stemLength +
                ", colour='" + colour + '\'' +
                '}';
    }
}
