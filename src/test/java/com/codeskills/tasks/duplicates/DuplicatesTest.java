package com.codeskills.tasks.duplicates;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DuplicatesTest {

    Duplicates duplicates = new Duplicates();
    @Test
    void getDuplicatesEq() {
        String[] d = {"A","B","c","d","c","ef","t","g","R","A","a","b","G","Q","w","eF"};
        List<String> expected = Arrays.asList("a","b","c","ef","g" );

        List<String> result = this.duplicates.getDuplicates(d);

        assertEquals(expected, result);
    }

    @Test
    void getDuplicatesEq2() {
        String[] d = {"A","B","Q","q","b","a"};
        List<String> expected = Arrays.asList("a","b","q");

        List<String> result = this.duplicates.getDuplicates(d);

        assertEquals(expected, result);
    }

    @Test
    void getDuplicatesEq3() {
        String[] d = {"A","B","c","d","ef","g","R"};
        List<String> expected = Collections.emptyList();

        List<String> result = this.duplicates.getDuplicates(d);

        assertEquals(expected, result);
    }

    @Test
    void getDuplicatesEq0() {
        String[] d = new String[0];
        List<String> expected = Collections.emptyList();

        List<String> result = this.duplicates.getDuplicates(d);

        assertEquals(expected, result);
    }

    @Test
    void getDuplicatesEq01() {
        String[] d = new String[10];
        List<String> expected = Collections.emptyList();

        List<String> result = this.duplicates.getDuplicates(d);

        assertEquals(expected, result);
    }
}