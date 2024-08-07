package co.com.app.arrays;

public class IsSortedArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        boolean asc = false;
        boolean desc = false;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                desc = true;
            }
            if (a[i] < a[i + 1]) {
                asc = true;
            }
        }
        System.out.println(asc + " " + desc);
        if (asc && desc) {
            System.out.println("The array is sorted in ascending order");
        }
        if (asc == false && desc == false) {
            System.out.println("The array is sorted in descending order");
        }
        if (asc == true && desc == false) {
            System.out.println("The array is sorted in descending order");
        }
    }
}
