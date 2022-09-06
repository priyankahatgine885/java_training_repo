package while_loops;

import java.util.Scanner;

public class ReverseDigits {
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        final int number = sc.nextInt();
        final int rev = reverseDigits(number);
        displayReverseDigits(rev);

    }

    private static void displayReverseDigits(final int rev) {
        System.out.println("The reverse of the given number is: " + rev);
    }

    private static int reverseDigits(int number) {
        int rev = 0;
        int remainder;
        if (number < 0) {
            number = -number;
        }
        while (number != 0) {
            remainder = number % 10;
            rev = rev * 10 + remainder;
            number = number / 10;
        }
        return rev;
    }
}
