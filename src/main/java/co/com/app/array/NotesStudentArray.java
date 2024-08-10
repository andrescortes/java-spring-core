package co.com.app.array;

import java.util.Scanner;

public class NotesStudentArray {
    public static void main(String[] args) {
        double[] mathClass, historyClass, languageClass;
        double sumMath = 0, sumHistory = 0, sumLanguage = 0;
        mathClass = new double[3];
        historyClass = new double[3];
        languageClass = new double[3];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 notes of math class: ");
        for (int i = 0; i < mathClass.length; i++) {
            mathClass[i] = sc.nextDouble();
        }
        System.out.println("Enter 3 history of history class ");
        for (int i = 0; i < mathClass.length; i++) {
            historyClass[i] = sc.nextDouble();
        }
        System.out.println("Enter 3 language of language class: ");
        for (int i = 0; i < languageClass.length; i++) {
            languageClass[i] = sc.nextDouble();
        }

        for (int i = 0; i < mathClass.length; i++) {
            sumMath += mathClass[i];
            sumHistory += historyClass[i];
            sumLanguage += languageClass[i];
        }
        System.out.println("The average of the math classes is: " + (sumMath / mathClass.length));
        System.out.println("The average of the history classes is: " + (sumHistory / historyClass.length));
        System.out.println("The average of the languages classes is: " + (sumLanguage / languageClass.length));

        System.out.println("Input dni of student: ");
        int studentId = sc.nextInt();
        double studentAverage = mathClass[studentId] + historyClass[studentId] + languageClass[studentId];
        System.out.println("The average of the student is: " + (studentAverage / 3));
    }
}
