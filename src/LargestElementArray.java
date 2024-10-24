public class LargestElementArray {

    public static int maxElement(int arr[], int n){
        int max = arr[0];
        for(int i=0; i<n; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args){
        int arr[] = {10, 324, 45, 60, 999887};
        int largest = maxElement(arr, arr.length);
        System.out.println("Maximum element in array is "+largest);
    }
    
}
