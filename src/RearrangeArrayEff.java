public class RearrangeArrayEff {

    // Function to rearrange array alternately
    public static void rearrange(long[] arr, int n)
    {
        // Initialize index of first minimum and first
        // maximum element
        int maxIdx = n - 1, minIdx = 0;

        // Store maximum element of array
        long M = arr[n - 1] + 1;

        // Traverse array elements
        for (int i = 0; i < n; i++) {
            // At even index : we have to put maximum
            // element
            if (i % 2 == 0) {
                arr[i] += (arr[maxIdx] % M) * M;
                maxIdx--;
            }
            // At odd index : we have to put minimum element
            else {
                arr[i] += (arr[minIdx] % M) * M;
                minIdx++;
            }
        }

        // Reduce array elements to store the new value
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] / M;
        }
    }

    // Driver code
    public static void main(String args[])
    {
        long[] arr = { 1, 2, 3, 4, 5, 6 };
        int n = arr.length;

        System.out.println("Original Array");
        for (long num : arr) {
            System.out.print(num + " ");
        }

        rearrange(arr, n);

        System.out.println("\nModified Array");
        for (long num : arr) {
            System.out.print(num + " ");
        }
    }
}