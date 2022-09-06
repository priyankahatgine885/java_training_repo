package do_while;

import java.util.Scanner;

public class AddDigitsOfNumber {
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        final int sum = sumOfDigits(sc.nextInt());
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
        do {
            digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        } while (number != 0);
        return sum;
    }
}
