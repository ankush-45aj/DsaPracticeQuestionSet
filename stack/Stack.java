import java.util.Scanner;

public class Stack {

    public static class ArrayImplementation {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        int top = -1;

        void push(int value) {
            if (top == arr.length - 1) {
                System.out.println("Stack is full");
                
            } else {
                arr[++top] = value;
                System.out.println("Pushed " + value + " to stack");
            }
        }

        int pop() {
            if (top == -1) {
                System.out.println("Stack is empty");
                return -1; // Indicating stack is empty
            } else {
                int value = arr[top--];
                System.out.println("Popped " + value + " from stack");
                return value;
            }
        }

    }

    public static void main(String[] args) {
        System.out.println("enter size of array");
        ArrayImplementation stack = new ArrayImplementation();
        stack.push(5);
        stack.push(52);
        stack.push(53);
        stack.push(57);
        stack.push(555);
        stack.push(6);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println("enter");
    }
}
