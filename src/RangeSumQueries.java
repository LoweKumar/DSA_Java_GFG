import java.util.Scanner;
public class RangeSumQueries {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //Read the size of the array
        int n = scanner.nextInt();
        int arr[] = new int[n];

        //Read the array elements
        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }

        //Initialize prefix sum array
        long prefix[] = new long[n];
        prefix[0] = arr[0];

        //Build the prefix sum array
        for(int i=1; i<n; i++){
            prefix[i] = arr[i] + prefix[i-1];
        }

        //Read the no of queries
        int q = scanner.nextInt();
        for(int i=0; i<q; i++){
            int l = scanner.nextInt();//start index of the query
            int r = scanner.nextInt();//last index of the query

            long ans;
            if(l==0){
                ans = prefix[r];               
            }
            else{
                ans = prefix[r] - prefix[l-1];
            }
            System.out.println(ans);

        }

        scanner.close();


    } 

    
}
