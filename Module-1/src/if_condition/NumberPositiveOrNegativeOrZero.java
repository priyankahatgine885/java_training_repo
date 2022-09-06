package if_condition;

import java.util.Scanner;

public class NumberPositiveOrNegativeOrZero {
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        final int number = sc.nextInt();
        final int no = isNumberPositiveOrNegativeOrZero(number);
        if (no == 1) {
            System.out.println("Number is positive....");
        } else if (no == -1) {
            System.out.println("Number is negative..");
        } else {
            System.out.println("Number is zero....");
        }
    }

    private static int isNumberPositiveOrNegativeOrZero(final int number) {
        if (number > 0) {
            return 1;
        } else if (number < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}
