package GFG_Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class countDistinctInWindow {

    //Naive Approach - nesting and hashset using
    public static ArrayList<Integer> countDistinctNaive(int arr[], int n, int k)
    {
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0; i<n-k; i++)
        {
            HashSet<Integer> hs = new HashSet<>();
            for(int j= i; j<i+k; j++)
            {
                hs.add(arr[j]);
            }
            result.add(hs.size());
        }
        return result;
    }

    //Efficient Approach - Using Sliding window technique and HashMap
    public static ArrayList<Integer> countDistinctEfficient(int arr[], int n, int k)
    {
        ArrayList<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> freq = new HashMap<>();

        for(int i=0; i<=k; i++)
        {
            freq.put(arr[i], freq.getOrDefault(arr[i], 0)+1);
        }

        result.add(freq.size());

        for(int j=k; j<n; j++)
        {
            freq.put(arr[j], freq.getOrDefault(arr[j],0)+1);
            freq.put(arr[j-k], freq.get(arr[j-k])-1);

            if(freq.get(arr[j-k])==0)
            {
                freq.remove(arr[j-k]);
            }
            result.add(freq.size());

        }
        

        return result;
    }

    public static void main(String[] args)
    {
        int arr[] = {1,2,1,3,4,2,3};
        int n = arr.length;
        int k = 4;
        // ArrayList<Integer> ans = countDistinctNaive(arr, n, k);
        ArrayList<Integer> ans = countDistinctEfficient(arr, n, k);
        for(int i:ans)
        {
            System.out.print(i+" ");
        }
    }
    
}
