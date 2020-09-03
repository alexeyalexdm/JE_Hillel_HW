package HW11;

public class ArrayUtils {

    public static int[] extendArrayByLength(int[] current, int lengthToAdd) {
        int temp[] = new int[current.length + lengthToAdd];
        for (int i = 0; i < current.length; i++) {
            temp[i] = current[i];
        }
        return temp;
    }
}
