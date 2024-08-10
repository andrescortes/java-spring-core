package co.com.app.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class InsertAnItemSortedArray {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int item, index = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an item: ");
        item = sc.nextInt();
        if (array[array.length - 1] <= item) {
            array[array.length - 1] = item;
            System.out.println("Item " + item + " was added to the array " + Arrays.toString(array));
        } else {
            for (int i = 0; i < array.length; i++) {
                if (item > array[i]) {
                    index = i + 1;
                }
            }
            System.out.println("Index: " + index);
            for (int i = array.length - 2; i >= index; i--) {
                array[i + 1] = array[i];
            }
            array[index] = item;

            System.out.println("The elements in the array are: " + Arrays.toString(array));
        }
    }
}
