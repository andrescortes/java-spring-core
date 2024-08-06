package co.com.app.arrays;

import java.util.Arrays;

public class BubbleSort {

    public static void sortBubble(Object[] array) {
        int total = array.length;
        int counter = 0;
        for (int i = 0; i < total - 1; i++) {
            for (int j = 0; j < total - i - 1; j++) {
                if (((Comparable) array[j + 1]).compareTo(array[j]) < 0) {
                    Object temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
                counter++;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(counter);
    }

    public static void main(String[] args) {
        String[] products = {
                "Kingston Pen drive 64GB",
                "Samsung Galaxy",
                "Hard Disk Samsung",
                "MacBook Air",
                "Chromecast 4th generation",
                "Asus notebook",
                "Oxford Bicycle"
        };
        sortBubble(products);
//        System.out.println(counter);
//        System.out.println("products = " + Arrays.toString(products));

        Integer[] numbers = new Integer[4];
        numbers[0] = 51;
        numbers[1] = Integer.parseInt("25");
        numbers[2] = 33;
        numbers[3] = 41;

        sortBubble(numbers);
    }
}
