package GFG_Hashing;

import java.util.HashMap;
import java.util.Map;

public class frequencyArrayElements {

    public static void countFreq(int[] arr)
    {
        int n = arr.length;
        Map<Integer, Integer> hm = new HashMap<>();
//        for(int i= 0; i<n; i++)
//        {
//            int key = arr[i];
//            if(hm.containsKey(key))
//            {
//                hm.put(key, hm.get(key)+1);
//            }
//            else
//            {
//                hm.put(key, 1);
//            }
//        }
//       Java 8 way of populating the hashmap using getOrDefault()
        for(int element:arr)
        {
            hm.put(element, hm.getOrDefault(element, 0)+1);
        }

        for(Map.Entry<Integer, Integer> entry: hm.entrySet())
        {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

    }

    public static void main(String[] args)
    {
        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};
        countFreq(arr);

    }
}
