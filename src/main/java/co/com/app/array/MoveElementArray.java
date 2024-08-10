package co.com.app.array;

import java.util.Arrays;

public class MoveElementArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int lastItem = array[array.length - 1];
        for (int i = array.length - 2; i >= 0; i--) {
            array[i + 1] = array[i];
        }
        System.out.println("The elements in the array are: " + Arrays.toString(array));
        array[0] = lastItem;
        System.out.println("The elements in the array are: " + Arrays.toString(array));
    }
}
