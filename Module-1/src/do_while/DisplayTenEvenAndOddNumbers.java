package do_while;

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
        do {
            if (isEvenNumber(i)) {
                arr[index] = i;
                index++;
            }
            i++;
        } while (i < 20);
        return arr;
    }

    private static int[] getFirstTenOddNumbers() {
        final int[] arr = new int[10];
        int index = 0;
        int i = 0;
        do {
            if (isOddNumber(i)) {
                arr[index] = i;
                index++;
            }
            i++;
        } while (i < 20);
        return arr;
    }

    private static void displayNumbers(final int[] arr, final String string) {
        if (Objects.isNull(arr)) {
            return;
        }
        System.out.print(string);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static boolean isEvenNumber(final int number) {
        return (number % 2) == 0;
    }

    private static boolean isOddNumber(final int number) {
        return (number % 2) != 0;
    }
}
