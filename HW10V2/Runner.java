package HW10V2;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Flower flower = new Flower("rose", 50, 10, "red");
        WildFlower flower1 = new WildFlower("romaska", 30, 10, "white", 3);
        Accessory accessory = new Accessory("tape", 10);
        Accessory accessory1 = new Accessory("bow", 5);


        System.out.println("Меню");
        System.out.println("1.Список цветов");
        System.out.println("2.Добавить цветы(в разработке)");
        System.out.println("3.Создать букет");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        if (choice == 1) {
            System.out.println(flower.toString());
            System.out.println(flower1.toString());

        } else if (choice == 2) {
            System.out.println("В разработке");

        } else if (choice == 3) {
            System.out.println("Выберите цветы");
            System.out.println("1." + flower.toString());
            System.out.println("2." + flower1.toString());
            System.out.println("Все виды");
            Scanner scannerOfFlowers = new Scanner(System.in);
            int chooseFlowers = scannerOfFlowers.nextInt();
            if (chooseFlowers == 1) {
                System.out.println("Введите количество штук:");
                Scanner scannerOfQuantity = new Scanner(System.in);
                int QuantityOfFlowers = scannerOfQuantity.nextInt();
                int flowersTotalPrice = QuantityOfFlowers * flower.getPrice();
                System.out.println("Сумма букета: " + flowersTotalPrice);
                System.out.println("Не хотите ли добавить аксессуары ?");
                System.out.println("1.Да");
                System.out.println("2.Нет");
                int choiceOfAccessory = scanner.nextInt();
                if (choiceOfAccessory == 1 ) {
                    System.out.println("1." + accessory.toString());
                    System.out.println("2." + accessory1.toString());
                    System.out.println("3.Все виды");
                    int chooseOfAccessory =scanner.nextInt();
                    if(chooseOfAccessory == 1 ){
                        System.out.println("Введите количество: ");
                        int quantityOfAccessory = scanner.nextInt();
                        int totalPrice = (quantityOfAccessory * accessory.getPrice()) + flowersTotalPrice;
                        System.out.println("Стоимость букета с акссессуарами:");
                        System.out.println(totalPrice);
                    }



                }
                if (choiceOfAccessory == 2) {
                    System.out.println("Итоговая стоимость: " + flowersTotalPrice);
                } else {
                    System.out.println("Введите число от 1 до 2");

                }


            }
        }
    }
}

