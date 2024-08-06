package co.com.app.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FindLargeNumber {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Ingreso un numero = ");
            numbers[i] = sc.nextInt();
        }
        int max = 0;
        for (int i = 1; i < numbers.length; i++) {
            max = (numbers[max] > numbers[i]) ? max : i;
        }
        System.out.println("Number found " + numbers[max]);
    }
}
