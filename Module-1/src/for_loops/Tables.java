package for_loops;

import java.util.Scanner;

public class Tables {
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        final int range = sc.nextInt();
        final int[] arr = getTables(range);
        displayTables(arr, range);

    }

    private static void displayTables(final int[] arr, final int range) {
        int j = 1;
        for (int i = 0; i < arr.length; i++, j++) {
            System.out.println(range + " * " + j + " = " + arr[i]);
        }
    }

    private static int[] getTables(final int range) {
        final int[] arr = new int[10];
        int mult = 1;
        for (int i = 0; i < arr.length; i++, mult++) {
            arr[i] = range * mult;
        }
        return arr;
    }
}
