package Array;

import java.util.Scanner;

public class InsertDelFind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take array input
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("enter value to insert and position :");
        int val = sc.nextInt();
        int pos = sc.nextInt();
        if (pos > 0 && pos <= size) {
            arr[pos - 1] = val;
            System.out.println("updated array is ");
            for (int i = 0; i < size; i++) {
                System.out.print(arr[i] + " ");
            }
        } else {
            System.out.println("give right position number");
        }
        System.out.println();

        // Step 2: Take the value to delete
        System.out.print("Enter the value to delete: ");
        int value = sc.nextInt();

        // Step 3: Find and delete the value
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (arr[i] == value) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Value not found in the array.");
        } else {
            // Shift elements to the left to delete the value
            for (int i = index; i < size - 1; i++) {
                arr[i] = arr[i + 1];
            }
            size--; // reduce array size count

            // Step 4: Print the updated array
            System.out.println("Array after deleting " + value + ":");
            for (int i = 0; i < size; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
