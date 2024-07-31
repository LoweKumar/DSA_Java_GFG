public class SubarraySumExist {

    public static boolean find_subarray(int array[], int n, int required){
        int sum = array[0];

        for (int i = 0; i < n; i++) {
            int start = 0;
            while (sum > required && start < i) {
                sum = sum-array[start];
                start++;
            }
            if (sum == required) {
                return true;
            }
            if(i<n){
                sum = sum + array[i];
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(find_subarray(new int[]{1,2,3,4,5,6,7}, 7, 100));
    }
}
