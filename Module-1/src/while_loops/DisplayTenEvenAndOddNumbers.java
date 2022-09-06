package while_loops;

import java.util.Objects;

public class DisplayTenEvenAndOddNumbers {
    public static void main(final String[] args) {
        final int[] evenArr = getFirstTenEvenNumbers();
        final String evenStr = "First ten even numbers is : ";
        displayNumbers(evenArr, evenStr);
        System.out.println();
        final int[] oddArr = getFirstTenOddNumbers();
        final String oddStr = "First ten odd numbers is : ";
        displayNumbers(oddArr, oddStr);
    }

    private static int[] getFirstTenEvenNumbers() {
        final int[] arr = new int[10];
        int index = 0;
        int i = 0;
        while (i < 20) {
            if (isEvenNumber(i)) {
                arr[index] = i;
                index++;
            }
            i++;
        }
        return arr;
    }

    private static int[] getFirstTenOddNumbers() {
        final int[] arr = new int[10];
        int index = 0;
        int i = 0;
        while (i < 20) {
            if (isOddNumber(i)) {
                arr[index] = i;
                index++;
            }
            i++;
        }
        return arr;
    }

    private static void displayNumbers(final int[] arr, final String string) {
        if (Objects.isNull(arr)) {
            return;
        }
        System.out.print(string);
        for (final int j : arr) {
            System.out.print(j + " ");
        }
    }

    private static boolean isEvenNumber(final int number) {
        return (number % 2) == 0;
    }

    private static boolean isOddNumber(final int number) {
        return (number % 2) != 0;
    }
}
