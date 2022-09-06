package arithmetic_operations;

import java.util.Scanner;

public class FloatDataType {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter first number ");
        final float a = scanner.nextFloat();
        System.out.println("Enter second number ");
        final float b = scanner.nextFloat();
        System.out.printf("Addition of %f and %f is %f \n", a, b, additionOfInteger(a, b));

        System.out.printf("Subtraction of %f and %f is %f \n", a, b, subtractionOfInteger(a, b));

        System.out.printf("Multiplication of %f and %f is %f \n", a, b, multiplicationOfInteger(a, b));

        if (b == 0) {
            System.out.printf("Division of %f and %f is not possible \n");
        } else {
            System.out.printf("Division of %f and %f is %f \n", a, b, divisionOfInteger(a, b));
        }
    }

    private static float divisionOfInteger(final float a, final float b) {
        return a / b;
    }

    private static float multiplicationOfInteger(final float a, final float b) {
        return a * b;
    }

    private static float subtractionOfInteger(final float a, final float b) {
        return a - b;
    }

    private static float additionOfInteger(final float a, final float b) {
        return a + b;
    }
}
