public class SortedRotatedArray {
    // Function to check if the array is sorted and rotated.
    public static boolean checkRotatedAndSorted(int arr[], int num) {
        int pivotalPoint = 0; // Declare pivotalPoint outside the if blocks
        
        // For ascending array type
        if (arr[num - 1] < arr[0]) {
            for (int i = 0; i < num - 1; i++) {
                if (arr[i + 1] < arr[i]) {
                    pivotalPoint++;
                }
            }
        }

        // For descending array type
        if (arr[num - 1] > arr[0]) {
            for (int i = 0; i < num - 1; i++) {
                if (arr[i + 1] > arr[i]) {
                    pivotalPoint++;
                }
            }
        }

        // Return false if more than one pivotal point found
        return pivotalPoint <= 1; // This simplifies the return statement
    }

    public static void main(String[] args) {
        int[] arr1 = {3, 4, 1, 2}; // Example sorted rotated array
        boolean result = checkRotatedAndSorted(arr1, arr1.length);
        System.out.println(result); // Output will be true for a rotated sorted array
    }
}
