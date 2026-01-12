
public class LinkedListRecursion {

    public static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class LinkedListr {

        Node head = null;
        Node tail = null;

        void add(int data) {
            Node temp = new Node(data);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
        }

        void delete(int data) {

        }

        void displayR(Node head) {
            if (head == null) {
                return;
            }
            Node temp = head;

            System.out.println(temp.data);
            temp = temp.next;
            displayR(temp);
        }

    }

    public static void main(String[] args) {
        LinkedListr ll = new LinkedListr();
        // Node a = new Node(5);
        //    node a = ll.add(5);
        ll.add(5);
        ll.add(6);
        ll.displayR(ll.head);
    }

}
