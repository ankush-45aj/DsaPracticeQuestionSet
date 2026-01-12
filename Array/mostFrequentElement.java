package Array;

public class mostFrequentElement {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 3, 3, 4 };

        int maxFreq = 0;
        int mostFrequent = arr[0];

        for (int i = 0; i < arr.length; i++) {
            int count = 0;

            // Count frequency of arr[i]
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            // Update most frequent element
            if (count > maxFreq) {
                maxFreq = count;
                mostFrequent = arr[i];
            }
        }

        System.out.println("Most frequent element: " + mostFrequent);
        System.out.println("Frequency: " + maxFreq);
    }
}
