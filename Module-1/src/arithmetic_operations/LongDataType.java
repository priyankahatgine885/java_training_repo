package arithmetic_operations;

import java.util.Scanner;

public class LongDataType {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter first number ");
        final Long a = scanner.nextLong();
        System.out.println("Enter second number ");
        final Long b = scanner.nextLong();

        System.out.printf("Addition of %d and %d is %d \n", a, b, additionOfInteger(a, b));

        System.out.printf("Subtraction of %d and %d is %d \n", a, b, subtractionOfInteger(a, b));

        System.out.printf("Multiplication of %d and %d is %d \n", a, b, multiplicationOfInteger(a, b));

        if (b == 0) {
            System.out.printf("Division of %d and %d is not possible \n");
        } else {
            System.out.printf("Division of %d and %d is %d \n", a, b, divisionOfInteger(a, b));
        }
    }

    private static long divisionOfInteger(final long a, final long b) {
        return a / b;
    }

    private static long multiplicationOfInteger(final long a, final long b) {
        return a * b;
    }

    private static long subtractionOfInteger(final long a, final long b) {
        return a - b;
    }

    private static long additionOfInteger(final long a, final long b) {
        return a + b;
    }

}
