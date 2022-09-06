package interfaces.main;

import interfaces.queue.QueueCollection;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueCollection queue = new QueueCollection();
        int[] queueArray = new int[5];
        for(int i = 0; i < queueArray.length; i++) {
            System.out.println("Enter the element : ");
            int data = sc.nextInt();

             queueArray = queue.insert(data);
        }
        queue.display(queueArray);
        queue.delete();
        queue.display(queueArray);
    }
}
