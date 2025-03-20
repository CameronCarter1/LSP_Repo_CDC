package org.howard.edu.lsp.midterm.question4;

import java.util.ArrayList;
import java.util.List;

public class WordProcessor {
    private String sentence;

    public WordProcessor(String sentence) {
        this.sentence = sentence;
    }

    public List<String> findLongestWords() {
        List<String> longestWords = new ArrayList<>();
        if (sentence == null || sentence.trim().isEmpty()) return longestWords;

        String[] words = sentence.split("\\s+");
        int maxLen = 0;

        for (String word : words) {
            if (word.length() > maxLen) {
                maxLen = word.length();
                longestWords.clear();
                longestWords.add(word);
            } else if (word.length() == maxLen) {
                longestWords.add(word);
            }
        }
        return longestWords;
    }
}
