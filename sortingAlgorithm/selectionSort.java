package sortingAlgorithm;

public class selectionSort {

    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 5, 6, 7, 4, 8, 9, 0};
        selectionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int mndix = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {

                    mndix = j;
                    min = arr[j];
                }
            }
            int temp;
            temp = arr[i];
            arr[i] = arr[mndix];
            arr[mndix] = temp;

        }
    }
}
