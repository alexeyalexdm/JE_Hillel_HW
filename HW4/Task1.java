package HW4;

public class Task1 {
    public static void main(String[] args) {
        int[] arrayA = {0, 1, 2, 3, 4, 5};
        int[] arrayB = {2, 3, 5};
        boolean isSubsequense = true;
        for (int small : arrayB) {
            boolean isContains = false;
            for (int big : arrayA) {
                if (small == big) {
                    isContains = true;
                    break;
                }
            }
            if (!isContains) {
                isSubsequense = false;
                break;
            }
        }
        System.out.println(isSubsequense);
    }
}


