import java.util.*;

public class validAnagram {


    static boolean isValidAnagram(String s, String t) {
          if (s.length() != t.length())
            return false;
          Map result = new HashMap<>();
          for (int i = 0; i < s.length(); i++){
            result.put(s.charAt(i), result.getOrDefault(s.charAt(i), 0) + 1);
            result.put(t.charAt(i), result.getOrDefault(t.charAt(i), 0) - 1);
          }

          for(int v : result.values()) {
            if(v != 0)
              return false;
          }
          return true;
    }

    public static void main(String args[]) {

        String a1 = "anagram";
        String a2 = "nagaram";
        assert (validAnagram(a1, a2) == true) : "Expect true for Strings : anagram & nagaram";

        String b1 = "rat";
        String b2 = "car";
        assert (validAnagram(b1, b2) == false): "Expect false for Strings : rat & car";
        System.out.println("All test cases in main function passed");

    }
}
 