package HW5;

public class CarProcessor {


    public void ShowModel() {
        System.out.println("Автомобиль марки Honda: ");
        for (int i = 0; i < 3; i++) {
            if (Runner.cars[i].marka == "Honda") {
                System.out.println("Модель: " + (Runner.cars[i].model));
            }
        }
    }

    public void ShowNOld() {
        System.out.println("----------------------------");
        System.out.println("Автомобили марки BMW,которые эксплуатируются больше 10 лет: ");
        for (int i = 0; i < 3; i++) {
            if (Runner.cars[i].marka == "BMW" && Runner.cars[i].god < 2010) {
                System.out.println("Модель: " + (Runner.cars[i].model) + " Год: " + Runner.cars[i].god);
            }
        }
    }

    public void ShowMPrice() {
        System.out.println("----------------------------");
        System.out.println("Модель 1982 года выпуска,цена которой больше 9000 : ");
        for (int i = 0; i < 3; i++) {
            if (Runner.cars[i].god == 1982 && Runner.cars[i].price > 9000) {
                System.out.println("Модель: " + (Runner.cars[i].model) + " Цена: " + Runner.cars[i].price);
            }
        }
    }
}