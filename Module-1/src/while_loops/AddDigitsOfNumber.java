package while_loops;

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
        int sum = 0;
        if (number < 0) {
            number = -number;
        }
        while (number != 0) {
            digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }
        return sum;
    }
}
