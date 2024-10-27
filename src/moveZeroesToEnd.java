public class moveZeroesToEnd {

    public static int movZeroToEnd(int arr[], int n)
    {
        int count = 0; 
        for(int i=0; i<n; i++)
        {
            if(arr[i]!=0)
            {
                arr[count++]=arr[i];
            }
        }
        for(int i=count; i<n; i++)
        {
            arr[i]=0;
        }
        return n;

    }
    
    public static void main(String[] args){
        int arr[] = {0, 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9}, n = arr.length;

       System.out.println("Before Removal");

       for(int i = 0; i < n; i++)
       {
       		System.out.print(arr[i]+" ");
       }

       System.out.println();

       n = movZeroToEnd(arr, n);

       System.out.println("After Removal");

       for(int i = 0; i < n; i++)
       {
       		System.out.print(arr[i]+" ");
       }

    } 
    
}
