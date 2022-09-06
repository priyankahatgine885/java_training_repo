package thread.mythread;
import java.util.Objects;

public class MyThread implements Runnable {

    public MyThread(){

    }       

    @Override
    public void run(){
        final int[] arr = getTables(5);
        displayTables(arr, 5);

    }
    public static void displayEvenNumbers(final int[] arr, final String string) {
        if (Objects.isNull(arr)) {
            return;
        }
        System.out.print(string);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] getFirstTwentyEvenNumbers() {
        final int[] arr = new int[20];
        int index = 0;
        for (int i = 0; i < 40; i++) {
            if (isEvenNumber(i)) {
                arr[index] = i;
                index++;
            }
        }
        return arr;
    }

    private static boolean isEvenNumber(final int number) {
        return (number % 2) == 0;
    }
    public static void displayTables(final int[] arr, final int range) {
        int j = 1;
        int i = 0;
        while (i < arr.length) {
            System.out.println(range + " * " + j + " = " + arr[i]);
            i++;
            j++;
        }
    }

    public static int[] getTables(final int range) {
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
