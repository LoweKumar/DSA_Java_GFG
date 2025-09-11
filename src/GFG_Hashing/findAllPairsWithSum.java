package GFG_Hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class findAllPairsWithSum
{
    public static List<int[]> findALlPairs(int[] arr, int sum)
    {
        HashSet<Integer> seen = new HashSet<>();
        HashSet<String> uniquePairs = new HashSet<>();
        List<int[]> result = new ArrayList<>();

        for(int element: arr)
        {
            int complement = sum - element;
            if(seen.contains(complement))
            {
                int min = Math.min(complement, element);
                int max = Math.max(complement, element);
                String key = min+ ","+ max;

                if(!uniquePairs.contains(key))
                {
                    uniquePairs.add(key);
                    result.add(new int[]{min, max});
                }
            }
            seen.add(element);

        }
        return result;
    }

    public static void main(String[] args)
    {
        int[] arr = {8, 4, 1, 6, 2, 8};
        int sum = 10;

        List<int[]> result = findALlPairs(arr, sum);
        for(int[] pair: result)
        {
            System.out.println(Arrays.toString(pair));
        }

    }
}
