package GFG_Hashing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class longestConsSubsequence{

    public static ArrayList<Integer> findLongestCommonSubsequence(int arr[], int n)
    {
        Set<Integer> set = new HashSet<>();
        for(int elements : arr)
        {
            set.add(elements);
        }

        int longestLength = 0;
        ArrayList<Integer> longestSequence = new ArrayList<>();

        for(int ele:arr)
        {
            if(!set.contains(ele-1))
            {
                int current = ele;
                ArrayList<Integer> currentSequence = new ArrayList<>();

                while(set.contains(current))
                {
                    currentSequence.add(current);
                    current++;
                }

                //update this if this is the longest subsequence
                if(currentSequence.size()>longestLength)
                {
                    longestLength = currentSequence.size();
                    longestSequence = currentSequence;
                }
            }
        }
        // return new ArrayList<>(longestSequence);
        return longestSequence; 
    } 

    public static void main(String[] args)
    {
        int arr[] ={1, 9, 3, 10, 4, 20, 2};
        ArrayList<Integer> ans = findLongestCommonSubsequence(arr, arr.length);
        System.out.println("Longest common subsequence is = "+ ans);
    }
    
}
