package GFG_Hashing;

import java.util.HashMap;
import java.util.Map;

public class firstRepeatingElement {

    public static int firstRepeatingElementFound(int[] arr, int size)
    {
        int minIndex = size;
        Map<Integer, Integer> hm = new HashMap<>();

        for(int i = 0; i<size; i++)
        {
            if(hm.containsKey(arr[i])){
                minIndex = Math.min(minIndex, hm.get(arr[i]));
            }
            else{
                hm.put(arr[i], i);
            }
        }
        return arr[minIndex];
    }

    public static void main(String[] args)
    {
        int[] arr = {10,5,3,4,3,5,6};
        int ans = firstRepeatingElementFound(arr, arr.length);
        System.out.println(ans);
    }
}
