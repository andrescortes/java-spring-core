package co.com.app.array;

public class AssignmentMaxOccurrence {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 3, 4, 5, 5, 5, 6, 7};
        int[] counts = new int[array.length];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            int item = array[i];
            boolean found = false;
            for (int j = 0; j < array.length; j++) {
                if (item == array[j]) {
                    counts[j]++;
                    found = true;
                    index = counts[j] > index ? j : index;
                    break;
                }
            }
            if (!found) {
                counts[i] = 1;
            }
        }
        System.out.println("Max occurrence item is " + array[index] + " with " + counts[index] + " occurrences.");
    }
}
