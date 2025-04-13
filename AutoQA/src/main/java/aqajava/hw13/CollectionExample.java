package aqajava.hw13;

import java.util.*;

public class CollectionExample {
    public static void main(String[] args) {
        /*
        Create an array with a set of words (10-20 words, including duplicates).
        Find and print the list of unique words in the array (duplicates should not be counted).
         */
        String[] words = {"five", "seven", "one", "two", "seven", "six", "five", "three", "four", "seven", "five", "five", "six",
                "four", "seven", "six", "seven", "five", "two", "three", "six", "seven", "four", "seven", "four", "three", "six", "six"};
        Set<String> wordSet = new HashSet<>(List.of(words));
        System.out.println(wordSet);

        //Count how many times each word appears.
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            if (!wordCount.containsKey(word)) {
                wordCount.put(word, 1);
            } else {
                int count = wordCount.get(word);
                wordCount.put(word, count + 1);
            }
        }
        System.out.println(wordCount);
    }
}
