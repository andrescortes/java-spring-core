package co.com.app.array;

import java.util.Arrays;
import java.util.Scanner;

public class AddAnItemArray {
    public static void main(String[] args) {
        int[] array = new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int itemToAdd, itemPosition;
        System.out.println("Enter a number to add an item: ");
        Scanner sc = new Scanner(System.in);
        itemToAdd = sc.nextInt();
        int k = 0;
        while (k < array.length && array[k] < itemToAdd) {
            k++;
        }
        itemPosition = k;
        System.out.println(k);
        int[] aux = new int[array.length + 1];
        int j = 0;
        for (int i = 0; i < aux.length; i++) {
            if (i == itemPosition) {
                aux[i] = itemToAdd;
            } else {
                aux[i] = array[j];
                j++;
            }
        }
        System.out.println(Arrays.toString(aux));

    }
}
