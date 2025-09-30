package com.pluralsight;

import java.util.Scanner;

public class TextAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text to analyze: ");
        String sentence = scanner.nextLine().trim();

        int char_total = sentence.length();

        String[] sentence_split = sentence.split(" ");

        int word_count = sentence_split.length;

        int char_amount = char_total - word_count;

        System.out.println("Total Characters: " + char_total);
        System.out.println("Characters (no spaces) " + char_amount);
        System.out.println("Estimated word count " + word_count);

        System.out.println("First Character: " + sentence_split[0].charAt(0));
        System.out.println("Last Character: " + sentence.charAt(sentence.length() - 1));
        boolean java = sentence.contains("Java") || sentence.contains("java");
        boolean python = sentence.contains("Python") || sentence.contains("python");
        System.out.println("Contains 'Java': " + java);
        System.out.println("Contains 'Python': " + python);

        System.out.println("First Word: " + sentence.substring(0,sentence.lastIndexOf(sentence_split[1])));
        System.out.println("Last word: " + sentence.substring(sentence.lastIndexOf(" " ) + 1));
        System.out.println("Middle section: " + sentence.substring(sentence.indexOf(" "), sentence.lastIndexOf(" ")));








    }
}
