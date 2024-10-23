import java.util.Arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7}; // Example sorted array 1
        int[] arr2 = {2, 4, 6, 8}; // Example sorted array 2
        
        int[] mergedArray = mergeSorted(arr1, arr2, arr1.length, arr2.length);
        System.out.println("Merged sorted array: " + Arrays.toString(mergedArray));
    }

    public static int[] mergeSorted(int[] arr1, int[] arr2, int m, int n) {
        int[] arr3 = new int[m + n]; // Merged array
        int i = 0, j = 0, k = 0;

        // Merge the two arrays
        while (i < m && j < n) {
            if (arr1[i] < arr2[j]) {
                arr3[k++] = arr1[i++]; // Add from arr1
            } else {
                arr3[k++] = arr2[j++]; // Add from arr2
            }
        }

        // Add remaining elements from arr1
        while (i < m) {
            arr3[k++] = arr1[i++];
        }

        // Add remaining elements from arr2
        while (j < n) {
            arr3[k++] = arr2[j++];
        }

        return arr3; // Return the merged array
    }
}

