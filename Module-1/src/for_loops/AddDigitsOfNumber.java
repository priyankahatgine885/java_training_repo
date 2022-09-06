package for_loops;

import java.util.Scanner;

public class AddDigitsOfNumber {
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        final int number = sc.nextInt();
        final int sum = sumOfDigits(number);
        displaySumOfDigits(sum);
    }

    private static void displaySumOfDigits(final int sum) {
        System.out.println("Added digits of a number is : " + sum);
    }

    private static int sumOfDigits(int number) {
        int digit;
        int sum;
        if (number < 0) {
            number = -number;
        }
        for (sum = 0; number != 0; number = number / 10) {
            digit = number % 10;
            sum = sum + digit;
        }
        return sum;
    }
}
