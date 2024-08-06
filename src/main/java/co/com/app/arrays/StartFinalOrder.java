package co.com.app.arrays;

import java.util.Arrays;

public class StartFinalOrder {
    public static void main(String[] args) {
        int[] array = new int[10];
        int[] array2 = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        System.out.println(Arrays.toString(array));
        int aux = 0;
        for (int i = 0; i < array.length - i; i++) {
            System.out.print(array[i] + " " + array[array.length - 1 - i] + "\n");
            array2[aux++] = array[i];
            array2[aux++] = array[array.length - 1 - i];
        }
        System.out.println(Arrays.toString(array2));
    }
}
