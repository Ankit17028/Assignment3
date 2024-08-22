package Ineuron.Assignment_3;

import java.util.Arrays;

public class Question_7 {

    public static void countVowelsConsonants(String str) {
        int vowelCount = 0;
        int consonantCount = 0;

        // Convert the string to lowercase for case-insensitive counting
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Check if the character is a vowel or consonant
            if (isVowel(ch)) {
                vowelCount++;
            } else if (isConsonant(ch)) {
                consonantCount++;
            }
        }

        System.out.println("Vowels: " + vowelCount);
        System.out.println("Consonants: " + consonantCount);
    }

    // Helper method to check if a character is a vowel
    private static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    // Helper method to check if a character is a consonant
    // (Assumes only alphabets are considered, excluding special characters and spaces)
    private static boolean isConsonant(char ch) {
        return ch >= 'a' && ch <= 'z' && !isVowel(ch);
    }

    public static void main(String[] args) {
        String inputString = "Hello, World!";
        countVowelsConsonants(inputString);
    }
}



