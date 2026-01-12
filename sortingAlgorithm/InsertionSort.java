// package sortingAlgorithm;
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 5, 6, 7, 4, 36, -4, 100, 0 };
        InsertionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void InsertionSort(int[] arr) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method
        // 'InsertionSort'");
        for (int i = 0; i < arr.length; i++) {
            int j = i;
            int temp;
            while (j > 0 && arr[j] < arr[j - 1]) {
                temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;

            }
        }
    }
}
