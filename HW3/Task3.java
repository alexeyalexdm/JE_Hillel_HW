package HW3;

/*Числа Фибоначчи

 */
public class Task3 {
    public static void main(String[] args) {
        int[] nums = new int[20];
        nums[0] = 1;
        nums[1] = 1;
        System.out.println("Числа Фибоначчи: ");
        for (int i = 2; i < nums.length; i++) {
            nums[i] = nums[i - 1] + nums[i - 2];
        }
        for (int i = 0; i < 20; ++i) {
            System.out.println(nums[i]);
        }
    }
}


