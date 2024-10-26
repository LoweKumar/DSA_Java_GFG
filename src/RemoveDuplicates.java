public class RemoveDuplicates {

    public static int removeDup(int arr[], int n)
        {
            int res = 1;
            int temp[] = new int[n];
            temp[0]=arr[0];
            for(int i=1; i<n; i++)
            {
                if(temp[res-1]!=arr[i])
                {temp[res]=arr[i];
                res++;
                }
            }
            for(int i=0; i<res; i++)
            {
                arr[i]=temp[i];
            }
            return res;
        }
    public static void main(String[] args){
        int arr[] = {10, 20, 20, 30, 30, 30}, n=6;
        System.out.println("Array before duplicate element removal");
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
        n = removeDup(arr, n);
        System.out.println("Array after duplicate element removal ");
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}
