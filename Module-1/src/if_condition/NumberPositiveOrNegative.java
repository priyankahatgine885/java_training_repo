package if_condition;

import java.util.Scanner;

public class NumberPositiveOrNegative {
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        System.out.print("Enter the candidate age : ");
        final int number = sc.nextInt();
        final boolean check = isNumberPositiveOrNegative(number);
        if (check) {
            System.out.println("Number is positive....");
        } else {
            System.out.println("Number is negative..");
        }

    }

    private static boolean isNumberPositiveOrNegative(final int number) {
        return number > 0;
    }
}
