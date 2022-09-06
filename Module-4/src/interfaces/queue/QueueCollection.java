package interfaces.queue;


public class QueueCollection implements Queue {
    public int Max = 5;
    int queue_array[] = new int[Max];
    int rear = -1;
    int front = -1;

    public QueueCollection() {

    }

    @Override
    public int[] insert(int data) {
        int item = 0;
        if (rear == Max - 1)
            System.out.println("Queue Overflow n");
        else {
            if (front == -1)
                front = 0;
            rear = rear + 1;
            queue_array[rear] = data;

        }
        return queue_array;
    }

    @Override
    public void delete() {
        if (front == -1 || front > rear) {
            System.out.println("Queue Underflow n");
            return;
        } else {
            System.out.println("Element deleted from queue is :" + queue_array[front]);
            front = front + 1;
        }
    }

    @Override
    public void display(int[] queue_array) {
        int i;
        if (front == -1)
            System.out.println("Queue is empty n");
        else {
            System.out.println("Queue is : ");
            for (i = front; i <= rear; i++)
                System.out.println(queue_array[i]);
            System.out.println();
        }
    }
}
