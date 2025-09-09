package GFG_Hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class electionWinner {

    public static String[] maxVotes(String[] array, int size)
    {
        Map<String, Integer> voteCount = new HashMap<>();
        for(String ele: array)
        {
            voteCount.put(ele, voteCount.getOrDefault(ele, 0)+1);
        }

        String winner = ""; int maxVotes = 0;

        for(Map.Entry<String, Integer> entry : voteCount.entrySet())
        {
            String candidate = entry.getKey();
            int votes = entry.getValue();

            if(votes>maxVotes)
            {
                maxVotes = votes;
                 winner = candidate;
            }

//            for same votes of two different candidates
            else if(votes == maxVotes)
            {
                if(candidate.compareTo(winner)<0) // it means candidate is smaller in length as compared to winner string length
                winner = candidate;
            }
        }

        return new String[]{winner, String.valueOf(maxVotes)};
    }

    public static void main(String[] args)
    {
     String[] candidates = {"John", "Johny", "John", "Johny", "Steve"};
     String[] winner = maxVotes(candidates, candidates.length);
        System.out.println(Arrays.toString(winner));
    }
}
