import java.util.HashSet;
import java.util.Set;

public class uniqueWords {

    public static Set<String> getUniqueWords(String input) {
        Set<String> uniqueWords = new HashSet<>();

        // Split the string into words using space or punctuation
        String[] words = input.toLowerCase().split("\\W+");

        for (String word : words) {
            if (word != null && !word.isEmpty()) {
                uniqueWords.add(word);
            }
        }

        return uniqueWords;
    }

    public static void main(String[] args) {
        String text = "This is a test. This test is only a test.";

        Set<String> result = getUniqueWords(text);

        System.out.println("Unique words: " + result);
    }
}

