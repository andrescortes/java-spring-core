package co.com.app.array;

import java.util.Arrays;

public class InsertAnItemArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int item = 100, index = 4;
        for (int i = array.length - 2; i >= index; i--) {
            array[i + 1] = array[i];
        }
        array[index] = item;

        System.out.println("The elements in the array are: " + Arrays.toString(array));
    }
}
