package if_condition;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        final int number = sc.nextInt();
        final boolean check = isEvenOrOdd(number);
        if (check) {
            System.out.println("Entered number is even");
        } else {
            System.out.println("Entered number is odd");
        }
    }

    private static boolean isEvenOrOdd(final int number) {
        return (number % 2) == 0;
    }
}
