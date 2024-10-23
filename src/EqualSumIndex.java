public class EqualSumIndex {
    public static int findEqualSumIndex(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            // Calculate left sum
            int leftSum = 0;
            for (int j = 0; j < i; j++) {
                leftSum += arr[j];
            }

            // Calculate right sum
            int rightSum = 0;
            for (int j = i + 1; j < n; j++) {
                rightSum += arr[j];
            }

            // Check if left sum equals right sum
            if (leftSum == rightSum) {
                return i; // Return the index if found
            }
        }

        return -1; // Return -1 if no such index exists
    }

    public static void main(String[] args) {
        int[] arr = {-7, 1, 5, 2, -4, 3, 0}; // Example array
        int index = findEqualSumIndex(arr);

        if (index != -1) {
            System.out.println("Index with equal left and right sum: " + index);
        } else {
            System.out.println("No such index found.");
        }
    }
}

