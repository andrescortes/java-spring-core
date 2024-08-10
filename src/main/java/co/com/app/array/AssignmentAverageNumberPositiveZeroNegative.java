package co.com.app.array;

import java.util.Scanner;

public class AssignmentAverageNumberPositiveZeroNegative {
    public static void main(String[] args) {
        int[] array = new int[7];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter a number to be added to the array: ");
            Scanner sc = new Scanner(System.in);
            array[i] = sc.nextInt();
        }

        int positives = 0;
        int negatives = 0;
        int zeros = 0;
        for (int j : array) {
            if (j == 0) {
                zeros += 1;
            }
            if (j < 0) {
                negatives += 1;
            }
            if (j > 0) {
                positives += 1;
            }
        }
        double positivesAverage = (double) positives / array.length;
        double negativesAverage = (double) negatives / array.length;
        System.out.println("The positives number is => " + positivesAverage);
        System.out.println("The negatives number is => " + negativesAverage);
        System.out.println("The zeros number is => " + zeros);
    }
}
