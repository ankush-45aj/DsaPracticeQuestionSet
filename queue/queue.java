package queue;

public class queue {

    int[] q;
    int front, rear, capacity;

    queue(int size) {
        q = new int[size];
        capacity = size;
        front = rear = -1;

    }

    public void enquee(int val) {
        if (rear == capacity - 1) {
            System.out.println("queue is fulled");
            return;
        }
        if (rear == -1)
            front = 0;
        q[++rear] = val;
        System.out.println(val + " enqued");

    }

    public void dequee() {
        if (front == -1)
            return;
        else {
            System.out.println(q[front] + " is dequee");
            if (front == rear)
                front = rear = -1;
            front++;
            return;
        }

    }

    public void printQueue() {
        for (int i = front; i <= rear; i++) {
            System.out.print(q[i] + " ");
        }
    }

    public static void main(String[] args) {
        queue q = new queue(5);
        q.enquee(5);
        q.enquee(4);
        q.enquee(3);
        q.enquee(2);
        q.enquee(1);
        q.enquee(0);
        q.dequee();
        q.printQueue();

    }

}
