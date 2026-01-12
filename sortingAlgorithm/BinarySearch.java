import java.util.Scanner;
public class BinarySearch {

    public static int BinarySearch(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            // mid MUST be inside the loop
            int mid = (start + end) / 2;

            if (arr[mid] == key) {
                return mid;
            } else if (key < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1; // key not found
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

        Scanner sc = new Scanner(System.in);
        System.out.println("enter key to find");
        int key = sc.nextInt();

        int idx = BinarySearch(arr, key);
        System.out.println("Your element is found at index: " + idx);
    }
}
