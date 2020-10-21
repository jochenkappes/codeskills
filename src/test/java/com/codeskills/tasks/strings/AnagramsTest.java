package com.codeskills.tasks.strings;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;
import static org.junit.jupiter.api.Assertions.*;

class AnagramsTest {
    Anagrams anagrams = new Anagrams();

    @Test
    void isAnagrams0() {
        String w1="";
        String w2="";
        //run
        boolean result = anagrams.isAnagrams(w1, w2);
        assertTrue(result);
    }

    @Test
    void isAnagrams1() {
        String w1="A";
        String w2="A";
        //run
        boolean result = anagrams.isAnagrams(w1, w2);
        assertTrue(result);
    }

    @Test
    void isAnagramsCaseSence() {
        String w1="Cat";
        String w2="TAc";
        //run
        boolean result = anagrams.isAnagrams(w1, w2);
        assertTrue(result);
    }

    @Test
    void isAnagrams01() {
        String w1="null";
        String w2="llun";
        //run
        boolean result = anagrams.isAnagrams(w1, w2);
        assertTrue(result);
    }
    @Test
    void isAnagramsFalse04() {
        String w1="null";
        String w2="lunn";
        //run
        boolean result = anagrams.isAnagrams(w1, w2);
        assertFalse(result);
    }

    @Test
    public void isAnagramsFalse0() {
        String w1="Horse";
        String w2="Homer";
        //run
        boolean result = anagrams.isAnagrams(w1, w2);
        assertFalse(result);
    }

    @Test
    public void isAnagramsFalse03() {
        String w1="Horse";
        String w2="Qwert";
        //run
        boolean result = anagrams.isAnagrams(w1, w2);
        assertFalse(result);
    }

    @Test
    public void isAnagramsFalse01() {
        String w1="Null";
        String w2="Lluna";
        //run
        boolean result = anagrams.isAnagrams(w1, w2);
        assertFalse(result);
    }

    @Test
    public void isAnagramsFalse02() {
        String w1="Null";
        String w2="Nulla";
        //run
        boolean result = anagrams.isAnagrams(w1, w2);
        assertFalse(result);
    }

    @Test
    public void isAnagramEx() {
        String w1=null;
        String w2="Homer";

        //run
        assertThrows(IllegalArgumentException.class, () -> anagrams.isAnagrams(w1, w2));
        //assert: exception
    }

    @Test
    public void isAnagramEx2() {
        String w1="Homer";
        String w2=null;
        //run
        assertThrows(IllegalArgumentException.class, () -> anagrams.isAnagrams(w1, w2));
        //assert: exception
    }
}