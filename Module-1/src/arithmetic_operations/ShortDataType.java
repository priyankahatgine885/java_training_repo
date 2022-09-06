package arithmetic_operations;

import java.util.Scanner;

public class ShortDataType {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter first number ");
        final short a = scanner.nextShort();
        System.out.println("Enter second number ");
        final short b = scanner.nextShort();

        System.out.printf("Addition of %d and %d is %d \n", a, b, additionOfInteger(a, b));

        System.out.printf("Subtraction of %d and %d is %d \n", a, b, subtractionOfInteger(a, b));

        System.out.printf("Multiplication of %d and %d is %d \n", a, b, multiplicationOfInteger(a, b));

        if (b == 0) {
            System.out.printf("Division of %d and %d is not possible \n");
        } else {
            System.out.printf("Division of %d and %d is %d \n", a, b, divisionOfInteger(a, b));
        }
    }

    private static int divisionOfInteger(final short a, final short b) {
        return a / b;
    }

    private static int multiplicationOfInteger(final short a, final short b) {
        return a * b;
    }

    private static int subtractionOfInteger(final short a, final short b) {
        return a - b;
    }

    private static int additionOfInteger(final int a, final int b) {
        return a + b;
    }
}
