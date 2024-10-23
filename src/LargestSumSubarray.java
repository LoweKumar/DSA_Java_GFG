public class LargestSumSubarray {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4}; // Example array
        int largestSum = largestSum(arr, arr.length);
        System.out.println("Largest sum of contiguous subarray: " + largestSum);
    }

    public static int largestSum(int[] arr, int n) {
        int maxSoFar = Integer.MIN_VALUE; // Initialize to smallest integer
        int maxEndingHere = 0;

        for (int i = 0; i < n; i++) {
            maxEndingHere += arr[i]; // Add current element to maxEndingHere
            
            if (maxSoFar < maxEndingHere) {
                maxSoFar = maxEndingHere; // Update maxSoFar if needed
            }

            if (maxEndingHere < 0) {
                maxEndingHere = 0; // Reset maxEndingHere if it goes negative
            }
        }

        return maxSoFar; // Return the maximum sum found
    }
}


