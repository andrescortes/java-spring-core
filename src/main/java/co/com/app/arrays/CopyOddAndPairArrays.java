package co.com.app.arrays;

import java.util.Arrays;

public class CopyOddAndPairArrays {
    public static void main(String[] args) {
        int[] a, pair, unpair;
        int totalPairs = 0;
        int totalOddPairs = 0;
        a = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int item : a) {
            if (item % 2 == 0) {
                totalPairs++;
            } else {
                totalOddPairs++;
            }
        }
        pair = new int[totalPairs];
        unpair = new int[totalOddPairs];
        int j = 0;
        int k = 0;
        for (int value : a) {
            if (value % 2 == 0) {
                pair[j++] = value;
            } else {
                unpair[k++] = value;
            }
        }
        System.out.println("Total pairs: " + Arrays.toString(pair));
        System.out.println("Total odd pairs: " + Arrays.toString(unpair));
    }
}
