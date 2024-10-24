public class VerifySortedArray {

    public static boolean isSorted(int arr[], int n){
        if(n==0 || n==1){
            return true;
        }
        for(int i=1; i<n; i++){
            if(arr[i-1]>arr[i])
            return false;
            
        }
        return false;
    }

    public static void main(String[] args){
        int arr[] = {7, 2, 30, 10};

        System.out.println(isSorted(arr, arr.length));
     } 
    
}
