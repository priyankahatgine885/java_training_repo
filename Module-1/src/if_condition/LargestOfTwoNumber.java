package if_condition;

import java.util.Scanner;

public class LargestOfTwoNumber {
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        final int numberFirst = sc.nextInt();
        System.out.print("Enter the second number : ");
        final int numberSec = sc.nextInt();
        final int large = getLargestNumber(numberFirst, numberSec);
        System.out.println("Largest number is : " + large);
    }

    private static int getLargestNumber(final int numberFirst, final int numberSec) {
        final int largest;
        if (numberFirst > numberSec) {
            largest = numberFirst;
        } else {
            largest = numberSec;
        }
        return largest;
    }
}
