package sortingAlgorithm;

public class mergeSort {

    public static void main(String[] args) {
        int[] arr = { 3, 4, 2, 6, 7, 8, 5, 8, 9, 0 };
        mergeSortArray(arr);
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    private static void mergeSortArray(int[] arr) {

        int n = arr.length;
        if (n == 1)
            return;
        int[] a = new int[n / 2];
        int[] b = new int[n - n / 2];
        int idx = 0;
        for (int i = 0; i < a.length; i++)
            a[i] = arr[idx++];
        for (int j = 0; j < b.length; j++)
            b[j] = arr[idx++];
        mergeSortArray(a);
        mergeSortArray(b);
        merge(a, b, arr);

    }

    private static void merge(int[] a, int[] b, int[] arr) {
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                arr[k++] = a[i++];

            } else {
                arr[k++] = b[j++];
            }
        }
        while (i < a.length) {
            arr[k++] = a[i++];

        }
        while (j < b.length) {
            arr[k++] = b[j++];
        }
    }
}
