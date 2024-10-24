// import java.util.Arrays;

public class SortedRotatedArray {
    // Function to check if the array is sorted and rotated.
    public static boolean checkRotatedAndSorted(int arr[], int num) {

        // Step 1: Check for non-decreasing sorted and rotated.
        int countAsc = 0; // Count for the number of order violations in ascending case
        for (int i = 0; i < num; i++) {
            if (arr[i] > arr[(i + 1) % num]) {
                countAsc++;
            }
        }

        // Step 2: Check for non-increasing sorted and rotated.
        int countDesc = 0; // Count for the number of order violations in descending case
        for (int i = 0; i < num; i++) {
            if (arr[i] < arr[(i + 1) % num]) {
                countDesc++;
            }
        }

        // Step 3: Return true if the array is sorted and rotated in either way (exactly one violation in order)
        return (countAsc == 1 || countDesc == 1);
    }

    public static void main(String[] args) {
        int[] arr1 = {3, 4, 1, 2}; // Example sorted array 1
        // int[] arr2 = {2, 4, 6, 8}; // Example sorted array 2
        
        boolean result = checkRotatedAndSorted(arr1,arr1.length);
        System.out.println(result);
    }
}   

