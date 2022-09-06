package while_loops;

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
        for (final int j : arr) {
            System.out.print(j + " ");
        }
    }

    private static int[] getFibonacci(final int number) {
        int no1 = 0;
        int no2 = 1;
        int no3;
        int i = 2;
        final int[] arr = new int[number];
        arr[0] = no1;
        arr[1] = no2;
        while (i < number) {
            no3 = no1 + no2;
            arr[i] = no3;
            no1 = no2;
            no2 = no3;
            i++;
        }
        return arr;
    }
}
