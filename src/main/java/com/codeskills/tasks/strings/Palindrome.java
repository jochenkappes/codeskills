package com.codeskills.tasks.strings;

import java.util.Arrays;

public class Palindrome {
    /**
     * Java program to check if a string is a palindrome or not, it's a palindrome if it remains the same on reversal.
     * <p>
     * For example, "dad" is a palindrome, as its reverse is "dad," whereas "program" isn't, as its reverse is "margorp" that is different from "program."
     * <p>
     * Some palindrome strings examples are: "j", "mom", "madam", "ab1ba", “12321.”
     */
    public boolean isPalindrome(String s) {

        if (s == null) {
           throw new IllegalArgumentException("String cannot be null!");
            }

        if (s.isEmpty())
            return false;

        char[] arrayS1 = s.toUpperCase().toCharArray();
        char[] arrayS2 = new char[arrayS1.length];

        // Fill Array arrayS2 Inverted
        for(int i=0; i<arrayS1.length; i++) {
            arrayS2[i] = arrayS1[(arrayS1.length - 1) - i];
        }

        System.out.println(String.valueOf(arrayS1) + " | " + String.valueOf(arrayS2) );

        return Arrays.equals(arrayS1, arrayS2);
    }
}
