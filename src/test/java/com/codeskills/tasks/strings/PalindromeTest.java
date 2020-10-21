package com.codeskills.tasks.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    Palindrome palindrome = new Palindrome();

    @Test
    void isPalindrome0() {
        String s="";
        //run
        boolean result = palindrome.isPalindrome(s);
        assertFalse(result);
    }

    @Test
    void isPalindrome1() {
        String s="o";
        //run
        boolean result = palindrome.isPalindrome(s);
        assertTrue(result);
    }

    @Test
    void isPalindrome2() {
        String s="Apo1opA";

        //run
        boolean result = palindrome.isPalindrome(s);
        assertTrue(result);
    }

    @Test
    void isPalindromeCaseSence() {
        String s="low2WOl";

        //run
        boolean result = palindrome.isPalindrome(s);
        assertTrue(result);
    }

    @Test
    void isPalindromeTrue() {
        String s="lowwol";

        //run
        boolean result = palindrome.isPalindrome(s);
        assertTrue(result);
    }

    @Test
    void isPalindromeFalse() {
        String s="program";

        //run
        boolean result = palindrome.isPalindrome(s);
        assertFalse(result);
    }

    @Test
    void isPalindromeFalse2() {
        String s="ab";

        //run
        boolean result = palindrome.isPalindrome(s);
        assertFalse(result);
    }

    @Test
    public void isPalindromeEx() {
        String s=null;

        //run
        assertThrows(IllegalArgumentException.class, () -> palindrome.isPalindrome(s));
        //assert: exception
    }
}