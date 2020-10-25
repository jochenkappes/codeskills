package com.codeskills.tasks.strings;

import java.util.Arrays;

public class Anagrams {
    /**
     * Two strings, x  and y , are called anagrams if they contain all the same characters in the same frequencies.
     * For example, the anagrams of CAT are CAT, ACT, TAC, TCA, ATC, and CTA.
     * <p>
     * If x and y are case-insensitive anagrams, return true; otherwise, return false instead.
     * Constraints
     * The comparison should NOT be case sensitive.
     */
    public boolean isAnagrams(String a, String b) {
        // TODO: Implement the logic here



        if (a == null || b == null) {
            //System.out.println("A oder B = null");
            throw new IllegalArgumentException("String cannot be null!");
        }

        if (a.length() != b.length())
            return false;

        char[] arrayA = a.toUpperCase().toCharArray();
        char[] arrayB = b.toUpperCase().toCharArray();


        Arrays.sort(arrayA);
        Arrays.sort(arrayB);

        if (Arrays.equals(arrayA, arrayB))
            return true;

        return false;
    }
}
