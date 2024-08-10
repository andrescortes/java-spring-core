package co.com.app.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveAnItemArray {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int index = 0;
        int itemToRemove;
        System.out.print("Enter an item to remove => ");
        Scanner sc = new Scanner(System.in);
        itemToRemove = sc.nextInt();
        while (index < array.length) {
            if (array[index] == itemToRemove) {
                break;
            }
            index++;
        }
        System.out.println("Index: " + index);
        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        System.out.println(Arrays.toString(array));
        int[] aux = new int[array.length - 1];

        System.arraycopy(array, 0, aux, 0, aux.length);

        System.out.println(Arrays.toString(aux));
    }
}
