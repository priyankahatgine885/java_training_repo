package thread.main;

import thread.mythread.MyThread;

import static thread.mythread.MyThread.*;


public class MainApp {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        Thread thread = new Thread(t1);
        thread.start();
        final int[] evenArr = getFirstTwentyEvenNumbers();
        final String evenStr = "First twenty even numbers is : ";
        displayEvenNumbers(evenArr, evenStr);
        System.out.println();
    }


}
