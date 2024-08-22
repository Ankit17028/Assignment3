package Ineuron.Assignment_3;

import java.util.Arrays;
import java.util.HashMap;

public class Question_6 {
    public static String sortString(String str) {
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }

    public static void main(String[] args) {
        String inputString = "orange";
        String sortedString = sortString(inputString);
        System.out.println("Original String: " + inputString);
        System.out.println("Sorted String: " + sortedString);
    }
}



