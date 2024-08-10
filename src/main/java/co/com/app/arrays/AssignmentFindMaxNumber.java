package co.com.app.arrays;

public class AssignmentFindMaxNumber {
    public static void main(String[] args) {
        int[] array = {14, 33, 15, 36, 78, 21, 43};
        int max = array[0];
        for (int j : array) {
            if (j > max) {
                max = j;
            }
        }
        System.out.println("The max number is -> " + max);
    }
}
