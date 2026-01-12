package sortingAlgorithm;

public class checkArraySort {

    public static boolean checking(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= arr[i + 1]) {
                return true;

            } else {
                System.out.println("array is not sort");
                return false;
            }

        }
        return true;

    }

    static int temp;

    public static void sorting(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                // sorting(arr);

            }
        }
    }

    public static void main(String[] args) {
        // int[] arr = new int[10];
        // for (int i = 3; i < arr.length; i++) {
        // arr[i] = i;
        // }
        int arr[] = {1, 3, 2, 4, 5, 8, 6, -1, 8, 9, 9, 0};
        System.out.println(checking(arr));
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        sorting(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
