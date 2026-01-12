
public class Implementation {

    public static class Node {

        int data;
        Node next;

        Node(int data) {

            this.data = data;
        }

    }

    public static class LinkedList {

        Node head = null;
        Node tail = null;

        void insert(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
                // tail = temp;
            } else {
                tail.next = temp;
                // tail = temp;
            }
            tail = temp;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.data + " ");
                temp = temp.next;
            }
        }

        void insertAtIdx(int idx, int data) {
            Node x = new Node(data);
            Node temp = head;
            for (int i = 0; i < idx - 1; i++) {
                temp = temp.next;

            }
            x.next = temp.next;
            temp.next = x;

        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insert(5);
        ll.insert(6);
        ll.insert(7);
        ll.insert(8);
        ll.insert(9);
        ll.insert(10);
        // ll.display();
        // Node p = new Node(7);
        ll.insertAtIdx(2, 15);
        ll.insertAtIdx(5, 16);
        ll.display();

    }
}
