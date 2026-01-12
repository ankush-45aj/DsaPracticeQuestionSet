package practice;
class TimePass {
 static  class Queue {
    int front = 0, rear = -1;
    int max = 10;
    int[] arr = new int[max];

    void enqueue(int x) {
        if (rear == max - 1) {
            System.out.println("Overflow");
            return;
        }
        arr[++rear] = x;
    }

    void dequeue() {
        if (front > rear) {
            System.out.println("Underflow");
            return;
        }
        front++;
    }

    void display() {
        for (int i = front; i <= rear; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
} 
public static void main(String[] args) {
Queue q = new Queue();
q.enqueue(10);
q.enqueue(8);
q.enqueue(7);
q.enqueue(6);
q.dequeue();
q.display();

}


}