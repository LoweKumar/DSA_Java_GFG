public class EqualSumIndexEff {

    public static void main(String[] args){
        int arr[] = {1,2,3,4,3,2,1};
        int index = eqIndex(arr, arr.length);
        
        if (index !=-1){
            System.out.println("Index found:"+index);
        }
        else{
            System.out.println("No index found with equal left and right sums.");
        }
    }

    public static int eqIndex(int arr[], int n){
        int sum=0;
        int leftsum=0;

        //Calculate the sum of the array
        for(int i=0; i<n; i++){
            sum += arr[i];
        }

        //Find the equilibirium index
        for(int i=0; i<n; i++){
            //Now sum will represent the right sum for index i
            sum = sum - arr[i];

            if(sum==leftsum){
                return i;// Return the index if left and right sums are equal
            }

            leftsum += arr[i];
        }
        return -1;
    }
    
}
