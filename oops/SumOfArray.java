
public class SumOfArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        sumoffarray(arr);
    }

    public static void sumoffarray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum of array elements: " + sum);
    }
}
