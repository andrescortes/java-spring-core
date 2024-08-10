package co.com.app.array;

public class AssignmentMaxOccurrenceHistogram {
    public static void main(String[] args) {
        int[] array = {4, 3, 4, 6, 6, 4, 1, 4, 5, 4, 1, 1};
        int[] occurrences = new int[array.length / 2];

        for (int k : array) {
            occurrences[k - 1]++;
        }

        for (int i = 0; i < 6; i++) {
            System.out.print((i + 1) + ": ");
            for (int j = 0; j < occurrences[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
