public class MaximumDifference {

    public static int maxdifference(int arr[], int n)
    {
        
        int max_diff = arr[1]-arr[0];
        // int ans = Integer.MIN_VALUE;
        int min_so_far = arr[0];
        for(int i=1; i<n; i++)
        {   
           if(arr[i]-min_so_far>max_diff)
            {
                max_diff = arr[i] - min_so_far;
            }
            if(arr[i]<min_so_far)
            {
                min_so_far = arr[i];
            }
        }
        return max_diff;

    }

    public static void main(String[] args){
        int arr[] = {2,3,10,6,4,8,1};
        // int arr[] = {7, 9, 5, 6, 3, 2};
        int result = maxdifference(arr, arr.length);
        System.out.println("Result is ="+result);
    }
    
}
