import java.util.Scanner;

public class SimpleProgram2 {
    public static void main(String[] args) {
        // Variable declarations and initializations
        int a = 10;
        float b = 4;
        char grade = 'A';
        boolean isPassed = true;

        // Calculations
        int c = a + a; // c is 20
        float result = c + b; // result is 20 + 4 = 24.0

        // Array declaration
        int[] marks = { 60, 70, 55, 80, 82 };

        // Print the marks array
        System.out.println("Marks in array:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        // Conditional check
        // Check if isPassed is true AND result is greater than 10
        if (isPassed && result > 10) {
            System.out.println("student passed with grade: " + grade);
            System.out.println("Result = " + result);
        } else {
            System.out.println("student failed");
        }
    }
}