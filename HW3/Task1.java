package HW3;

/*
Вывести четные и нечетные числа из массива
 */
public class Task1 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Четные числа:");
        for (int i = 1; i < nums.length; i++) {
            if (i % 2 == 0) {
                System.out.print(" " + i);
            }
        }
        System.out.println("\nНечетные числа:");
        for (int i = 1; i < nums.length; i++) {
            if (i % 2 != 0) {
                System.out.print(" " + i);
            }
        }
    }
}
