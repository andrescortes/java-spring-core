package co.com.app.array;

import java.util.Arrays;
import java.util.Scanner;

public class AssignmentRevertArray {
    public static void main(String[] args) {
        int[] array = new int[7];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter a number to be added to the array: ");
            Scanner sc = new Scanner(System.in);
            array[i] = sc.nextInt();
        }

        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
        System.out.println( "The array is -> " + Arrays.toString(array));
    }
}
