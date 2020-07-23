package HW5;

public class Runner {
    static Car[] cars = new Car[3];

    public static void main(String[] args) {

        cars[0] = new Car(5, "BMW", "X5", 2008, "black", 50000, 1841);
        cars[1] = new Car(7, "Lada", "2109", 1982, "white", 10000, 9598);
        cars[2] = new Car(3, "Honda", "Accord", 2005, "Grey", 20000, 3684);

        CarProcessor proc = new CarProcessor();
        proc.ShowModel();
        proc.ShowNOld();
        proc.ShowMPrice();

    }
}



