package Ineuron.Assignment_3;

import java.util.HashMap;

public class Question_5 {
    static void printRepeatedChars(String str) {
        // Create a hash map to store character counts
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        // Iterate through the string and count character occurrences
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = charCountMap.getOrDefault(ch, 0) + 1;
            charCountMap.put(ch, count);
        }

        // Print characters that occur more than once
        for (Character ch : charCountMap.keySet()) {
            if (charCountMap.get(ch) > 1) {
                System.out.println("Character '" + ch + "' repeated " + charCountMap.get(ch) + " times");
            }
        }
    }

    public static void main(String[] args) {
        String str = "Mississippi";
        printRepeatedChars(str);
    }
}



