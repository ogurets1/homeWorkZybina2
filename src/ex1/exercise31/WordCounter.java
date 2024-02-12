package ex1.exercise31;

import java.util.HashMap;

public class WordCounter {
    public static void main(String[] args) {
        String text = "Hello world hello java world Hello";
        String[] words = text.toLowerCase().split(" ");

        HashMap<String, Integer> wordCounts = new HashMap<>();

        for (String word : words) {
            if (wordCounts.containsKey(word)) {
                wordCounts.put(word, wordCounts.get(word) + 1);
            } else {
                wordCounts.put(word, 1);
            }
        }

        for (String word : wordCounts.keySet()) {
            System.out.println(word + ": " + wordCounts.get(word));
        }
    }
}
