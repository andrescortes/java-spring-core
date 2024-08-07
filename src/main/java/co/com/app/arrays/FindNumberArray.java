package co.com.app.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FindNumberArray {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println("The array contains " + numbers.length + " numbers" + " and its contents is " + Arrays.toString(numbers));
        System.out.println("Input the number to be searched: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == number) {
                System.out.println("The number is: " + numbers[i] + " at index " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("The number not found");
        }
    }
}
