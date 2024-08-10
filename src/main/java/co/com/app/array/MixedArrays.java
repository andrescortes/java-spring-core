package co.com.app.array;

import java.util.Arrays;

public class MixedArrays {
    public static void main(String[] args) {
        int[] a, b, c;
        a = new int[9];
        b = new int[9];
        c = new int[18];
        int length = a.length;
        for (int i = 0; i < length; i++) {
            a[i] = i + 1;
        }
        for (int i = 0; i < length; i++) {
            b[i] = (i + 1) * 5;
        }
        int aux = 0;
        for (int i = 0; i < length; i += 3) {
            for (int j = 0; j < 3; j++) {
                c[aux++] = a[i + j];
            }
            for (int j = 0; j < 3; j++) {
                c[aux++] = b[i + j];
            }
        }
        System.out.println(Arrays.toString(c));
    }
}
