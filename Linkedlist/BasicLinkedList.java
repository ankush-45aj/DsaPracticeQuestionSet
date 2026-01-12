
public class BasicLinkedList {

    public static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            // this.next = next;
        }
    }

    public static void displayRecursion(Node head) {
        if (head == null)
            return;
        System.out.println(head.data);
        head = head.next;
        displayRecursion(head);

    }

    public int count = 0;

    public static int Length(Node head) {

        if (head == null)
            return 0;
        // int count;
        // count = count + 1;
        head = head.next;
        // Length(head);
        return 1 + Length(head);

    }

    public static void main(String[] args) {
        Node x = new Node(10);
        Node y = new Node(20);
        Node z = new Node(30);
        Node b = new Node(40);
        Node a = new Node(50);

        x.next = y;
        y.next = z;
        z.next = b;
        // System.err.println("Linked List Created" + " with nodes: " + x.data + ", " +
        // y.data + ", " + z.data);
        b.next = a;
        Node temp = x;
        // for (int i = 0; i < 3; i++) {
        // System.out.println(temp.data);
        // temp = temp.next;

        displayRecursion(x);
        System.out.println(Length(x));

        // System.out.println(x.data);
    }

}
