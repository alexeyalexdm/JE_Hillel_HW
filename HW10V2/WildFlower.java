package HW10V2;

public class WildFlower extends Flower {
    private int numberOfStems;

    public WildFlower(String name, int price, int stemLength, String colour, int numberOfStems) {
        super(name, price, stemLength, colour);
        this.numberOfStems = numberOfStems;
    }

    public int getNumberOfStems() {
        return numberOfStems;
    }

    public void setNumberOfStems(int numberOfStems) {
        this.numberOfStems = numberOfStems;
    }

    @Override
    public String toString() {
        return "WildFlower{" +
                "name='" + getName() + '\'' +
                ", price=" + getPrice() +
                ", stemLength=" + getStemLength() +
                ", colour='" + getColour() + '\'' +
                "numberOfStems=" + numberOfStems +
                '}';
    }
}
