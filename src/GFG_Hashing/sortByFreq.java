package GFG_Hashing;
/*
 * Given an array of integers arr[], sort the array according to the frequency of elements, i.e. elements that have higher frequency comes first. If the frequencies of two elements are the same, then the smaller number comes first.

Examples:  

Input: arr[] = [5, 5, 4, 6, 4]
Output: [4, 4, 5, 5, 6]
Explanation: The highest frequency here is 2. Both 5 and 4 have that frequency. Now since the frequencies are the same the smaller element comes first. So 4 comes first then comes 5. Finally comes 6. The output is 4 4 5 5 6.

Input: arr[] = [9, 9, 9, 2, 5]
Output: [9, 9, 9, 2, 5]
Explanation: The highest frequency here is 3. Element 9 has the highest frequency So 9 comes first. Now both 2 and 5 have the same frequency. So we print smaller elements first. The output is 9 9 9 2 5.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class sortByFreq 
{

    static ArrayList<Integer> sortByFrequency(int arr[], int n)
    {   
        //step 1: store the frequency of each element in a hashmap
        HashMap<Integer, Integer> mp = new HashMap<>();

        for(int i=0; i<n; i++)
        {
            mp.put(arr[i], mp.getOrDefault(arr[i], 0)+1);
        }
       
        //step 2: convert the map to list of [frequency, element] pairs
        ArrayList<ArrayList<Integer>> freq = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry: mp.entrySet())
        {
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(entry.getValue());
            temp.add(entry.getKey());
            freq.add(temp);

        }

        //step 3: sort the frequencies descending and value ascending using Collections.sort and comparator
        Collections.sort(freq, new Comparator<ArrayList<Integer>>() 
            {
                @Override
                public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
                    if(o1.get(0).equals(o2.get(0)))
                    {
                        return o1.get(1)-o2.get(1);//ascending order of value
                    }
                    return o2.get(0)-o1.get(0);//descending order of frequency
                }
                
            });

        //step 4: Reconstruct the sorted arrays from frequecy list
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0; i<freq.size(); i++)
        {
            int count = freq.get(i).get(0);
            int value = freq.get(i).get(1);
            for(int j=0; j<count; j++)
            {
                ans.add(value);
            }
        }

        return ans;  
    }
    public static void main(String[] args)
    {
        int [] arr = {5, 5, 4, 6, 4};
        int n = arr.length;
        ArrayList<Integer> ans = sortByFrequency(arr, n);
        for(int i:ans)
        {
            System.out.print(i+" ");
        }
        
    }
    
}
