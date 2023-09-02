package org.launchcode;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        String firstLine = "Alice was beginning to get very tired of sitting by her sister on the " +
                "bank, and of having nothing to do: once or twice she had peeped into the book her sister " +
                "was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' " +
                "thought Alice 'without pictures or conversation?'" ;

        Scanner input = new Scanner(System.in);

        System.out.println("Search for a word in the first line.");

        String word = input.nextLine();

            if (firstLine.contains(word)) {
                System.out.println("The word '" + word + "' was found.");
            } else {
                System.out.println("The word " + word + " was not found.");
            }

        Integer index = firstLine.indexOf(word);
        Integer length = word.length();
        System.out.println("Your search term first appears at index " + index + ". Your term is " + length + " characters long.");
        String modifiedSentence = firstLine.replace(word, "");
        System.out.println(modifiedSentence);

    }
}

