package arithmetic_operations;

import java.util.Scanner;

public class DoubleDataType {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter first number ");
        final double a = scanner.nextDouble();
        System.out.println("Enter second number ");
        final double b = scanner.nextDouble();
        System.out.printf("Addition of %f and %f is %f \n", a, b, additionOfInteger(a, b));

        System.out.printf("Subtraction of %f and %f is %f \n", a, b, subtractionOfInteger(a, b));

        System.out.printf("Multiplication of %f and %f is %f \n", a, b, multiplicationOfInteger(a, b));

        if (b == 0) {
            System.out.printf("Division of %f and %f is not possible \n");
        } else {
            System.out.printf("Division of %f and %f is %f \n", a, b, divisionOfInteger(a, b));
        }
    }

    private static double divisionOfInteger(final double a, final double b) {
        return a / b;
    }

    private static double multiplicationOfInteger(final double a, final double b) {
        return a * b;
    }

    private static double subtractionOfInteger(final double a, final double b) {
        return a - b;
    }

    private static double additionOfInteger(final double a, final double b) {
        return a + b;
    }
}
