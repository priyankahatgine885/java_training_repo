package for_loops;

import java.util.Scanner;

public class Factorial {
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        final int num = sc.nextInt();
        final int factNumber = getFactorialOfNumber(num);
        displayFactorialOfNumber(factNumber, num);
    }

    private static void displayFactorialOfNumber(final int factNumber, final int num) {
        if (factNumber == -1) {
            System.out.println("Factorial of negative numbers cannot be calculated.");
        } else {
            System.out.println("Factorial of " + num + " is: " + factNumber);
        }
    }

    private static int getFactorialOfNumber(final int num) {
        int fact = 1;
        if (num == 0) {
            return 1;
        } else if (num < 0) {
            return -1;
        } else {
            for (int i = 1; i <= num; i++) {
                fact = fact * i;
            }
        }
        return fact;
    }
}
