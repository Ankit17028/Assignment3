

package Ineuron.Assignment_3;

import java.util.Arrays;

public class Question_3 {
    static boolean isAnagram(String str1, String str2) {
        // Ignore whitespaces
        str1 = str1.replaceAll("\\s", "");
        str2 = str2.replaceAll("\\s", "");

        // Check if lengths are equal
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert strings to lowercase
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // Sort both strings
        char[] charArray1 = str1.toCharArray();
        Arrays.sort(charArray1);

        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray2);

        // Compare sorted strings
        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        String str1 = "silent";
        String str2 = "listen";

        if (isAnagram(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams");
        }
    }
}
