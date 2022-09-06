package for_loops;

import java.util.Scanner;

public class Fibonacci {
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        final int number = sc.nextInt();
        final int[] arr = getFibonacci(number);
        displayFibonacci(arr);
    }

    private static void displayFibonacci(final int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static int[] getFibonacci(final int number) {
        int no1 = 0;
        int no2 = 1;
        int no3;
        final int[] arr = new int[number];
        arr[0] = no1;
        arr[1] = no2;
        for (int i = 2; i < number; ++i) {
            no3 = no1 + no2;
            arr[i] = no3;
            no1 = no2;
            no2 = no3;
        }
        return arr;
    }
}
