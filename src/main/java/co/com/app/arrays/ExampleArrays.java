package co.com.app.arrays;

public class ExampleArrays {
    public static void main(String[] args) {
        int[][] numbers = new int[2][4];
        System.out.println("The length of the row is: " + numbers.length);
        System.out.println("The length of the second array is: " + numbers[0].length);
        System.out.println("The first item in the first array is: " + numbers[0][0]);
        System.out.println("The last item in the first array is: " + numbers[0][numbers.length - 1]);
        System.out.println("The last item in the second array is: " + numbers[numbers.length - 1][numbers[0].length - 1]);
    }

}
