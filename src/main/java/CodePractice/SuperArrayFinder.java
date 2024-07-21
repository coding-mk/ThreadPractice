package CodePractice;
import java.util.Arrays;

public class SuperArrayFinder {
    public static int[] findSuperArray(int[] A, long[] B) {
        int n = A.length;
        int m = B.length;

        // Step 1: Sort array A to prepare for counting
        Arrays.sort(A);

        // Step 2: Build the counting array
        int[] count = new int[A[n - 1] + 1];
        for (int num : A) {
            count[num]++;
        }

        // Convert count array to prefix sum array
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        // Step 3: Process each index in array B
        int[] result = new int[m];
        for (int i = 0; i < m; i++) {
            long targetIndex = B[i];

            // Binary search to find the value at targetIndex in sorted super array
            int idx = binarySearch(count, targetIndex);

            // If found within bounds of count array
            if (idx >= 0 && idx < count.length) {
                result[i] = idx;
            } else {
                result[i] = -1;
            }
        }

        return result;
    }

    private static int binarySearch(int[] count, long target) {
        int low = 0;
        int high = count.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (count[mid] > target) {
                high = mid - 1;
            } else if (count[mid] <= target) {
                low = mid + 1;
            }
        }

        // Return the first index where count[index] is greater than target
        return high;
    }

    public static void main(String[] args) {
        // Example input
        int[] A1 = {1, 2, 3};
        long[] B1 = {3, 1, 8};
        int[] result1 = findSuperArray(A1, B1);
        System.out.println("Result 1: " + Arrays.toString(result1)); // Output: [2, 1, 3]

        int[] A2 = {6, 6};
        long[] B2 = {3, 1, 4};
        int[] result2 = findSuperArray(A2, B2);
        System.out.println("Result 2: " + Arrays.toString(result2)); // Output: [6, 6, -1]
    }
}
