package Ineuron.Assignment_3;

public class Question_4 {
    static boolean isPangram(String str) {
        // Convert string to lowercase
        str = str.toLowerCase();

        // Create a boolean array to mark presence of characters
        boolean[] mark = new boolean[26];

        // Check if the string contains all characters from 'a' to 'z'
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Check if the character is a lowercase letter
            if (ch >= 'a' && ch <= 'z') {
                int index = ch - 'a';
                mark[index] = true;
            }
        }

        // Check if all characters are marked present
        for (boolean b : mark) {
            if (!b) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String str1 = "The quick brown fox jumps over the lazy dog";
        String str2 = "This is not a pangram";

        if (isPangram(str1)) {
            System.out.println(str1 + " is a pangram");
        } else {
            System.out.println(str1 + " is not a pangram");
        }

        if (isPangram(str2)) {
            System.out.println(str2 + " is a pangram");
        } else {
            System.out.println(str2 + " is not a pangram");
        }
    }


}
