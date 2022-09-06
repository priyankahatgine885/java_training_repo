package do_while;

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
        int i = 0;
        while (i < arr.length) {
            System.out.println(range + " * " + j + " = " + arr[i]);
            i++;
            j++;
        }
    }

    private static int[] getTables(final int range) {
        final int[] arr = new int[10];
        int multiplication = 1;
        int i = 0;
        do {
            arr[i] = range * multiplication;
            i++;
            multiplication++;
        } while (i < arr.length);
        return arr;
    }

}
