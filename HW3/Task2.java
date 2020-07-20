package HW3;

/*
простые числа
 */
public class Task2 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Простые числа : ");
        for (int i = 0; i < nums.length; i++) {
            if (prostoeChislo(nums[i]) == 1) {
                System.out.print(nums[i] + " ");
            }
        }
    }

    private static int prostoeChislo(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return 0;
            }

            if ((i == number) || (i > Math.sqrt(number))) {
                return 1;
            }
        }

        return 0;
    }
}

