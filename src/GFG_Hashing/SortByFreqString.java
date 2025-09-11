package GFG_Hashing;

import java.util.*;

public class SortByFreqString {

    static List<String> sortByFrequency(String[] arr, int n) {
        // Step 1: Count frequencies using a HashMap
        Map<String, Integer> freqMap = new HashMap<>();
        for (String s : arr) {
            freqMap.put(s, freqMap.getOrDefault(s, 0) + 1);
        }

        // Step 2: Convert entries to a list of [frequency, string] pairs
        List<List<Object>> freqList = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : freqMap.entrySet()) {
            List<Object> temp = new ArrayList<>();
            temp.add(entry.getValue()); // frequency
            temp.add(entry.getKey());   // string
            freqList.add(temp);
        }

        // Step 3: Sort the list by frequency (desc), then string (asc)
        Collections.sort(freqList, new Comparator<List<Object>>() {
            @Override
            public int compare(List<Object> o1, List<Object> o2) {
                int freq1 = (int) o1.get(0);
                int freq2 = (int) o2.get(0);
                String str1 = (String) o1.get(1);
                String str2 = (String) o2.get(1);

                if (freq1 == freq2) {
                    return str1.compareTo(str2); // lexicographically smaller first
                }
                return freq2 - freq1; // higher frequency first
            }
        });

        // Step 4: Reconstruct sorted output
        List<String> result = new ArrayList<>();
        for (List<Object> pair : freqList) {
            int count = (int) pair.get(0);
            String value = (String) pair.get(1);
            for (int i = 0; i < count; i++) {
                result.add(value);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String[] arr = {"apple", "banana", "apple", "orange", "banana", "banana"};
        int n = arr.length;

        List<String> result = sortByFrequency(arr, n);

        for (String s : result) {
            System.out.print(s + " ");
        }
    }
}
