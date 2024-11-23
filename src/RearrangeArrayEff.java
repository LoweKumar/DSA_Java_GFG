public class RearrangeArrayEff {
    
    public static void rearrange(int[] arr) {
        int n = arr.length; 
        
        // Find the maximum element in the array
        int maxElement = arr[n - 1] + 1; // Since all elements are positive integers, maxElement is guaranteed to be larger than any array element
        
        int maxIndex = n - 1; // Pointer to the end of the array (max element)
        int minIndex = 0; // Pointer to the beginning of the array (min element)
        
        // Traverse the array and rearrange elements alternately
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                // Even index: store max value from maxIndex
                arr[i] = arr[i] + (arr[maxIndex] % maxElement) * maxElement;
                System.out.println("Value = "+arr[i]);
                maxIndex--;
            } else {
                // Odd index: store min value from minIndex
                arr[i] = arr[i] + (arr[minIndex] % maxElement) * maxElement;
                minIndex++;
            }
        }
        
        // Now decode the array values to retrieve the final rearranged array
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] / maxElement;  // Extract the new value
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        rearrange(arr);
        
        // Print the rearranged array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
