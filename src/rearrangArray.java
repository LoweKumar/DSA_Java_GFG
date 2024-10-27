// Method 1 - using extra temp array
public class rearrangArray {

    public static int[] rearrageArray(int arr[], int n)
    {   
        int temp[] = new int[n];
        for(int i=0; i<n; i++)
        {
            int count = arr[i];
            int res = arr[count];
            temp[i] = res;
        }
        return temp;
        
    }

    public static int rearrageArrayWithoutExtraArray(int arr[], int n)
    {
        int i = 0;
        
        //Increasing all values by (arr[arr[i]]%n)*n to store the new element.
        for(i = 0; i < n; i++)
         arr[(int)i]+=(arr[(int)arr[(int)i]]%n)*n;
        
        //Since we had multiplied each element with n.
        //We will divide by n too to get the new element at that 
        //position after rearranging.
        for(i = 0; i < n; i++)
            arr[(int)i] = arr[(int)i]/n;
        

        return n;

    }

    public static void main(String[] args){
        int arr[] = {4,0,2,1,3}, n = arr.length;

       System.out.println("Before Removal");

       for(int i = 0; i < n; i++)
       {
       		System.out.print(arr[i]+" ");
       }

       System.out.println();

    //    int temp[] = rearrageArray(arr, n);

    //    System.out.println("After Rearrangement using extra temp array");
    //    for(int i = 0; i < n; i++)
    //    {
    //    		System.out.print(temp[i]+" ");
    //    }

       int n1 = rearrageArrayWithoutExtraArray(arr, n);

       System.out.println("After Rearrangement without using extra temp array");
       for(int i = 0; i < n1; i++)
       {
       		System.out.print(arr[i]+" ");
       }

       

    } 
    
}
