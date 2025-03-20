package org.howard.edu.lsp.midterm.question4;

import java.util.List;

public class WordProcessorDriver {
    public static void main(String[] args) {
        WordProcessor wp = new WordProcessor("Java is a powerful tool!");
        List<String> longestWords = wp.findLongestWords();
        System.out.println("Longest words: " + longestWords);
    }
}
