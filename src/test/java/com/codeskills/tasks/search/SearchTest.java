package com.codeskills.tasks.search;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchTest {

    Search search = new Search();
    @Test
    void findElement0() {
        int[] initial = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int value=8;
        int expected=8;
        int result = search.findElement(initial, value);
        assertEquals(expected, result);
    }

    @Test
    void findElement1() {
        int[] initial = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int value=20;
        int expected=-1;
        int result = search.findElement(initial, value);
        assertEquals(expected, result);
    }

    @Test
    void findElement00() {
        int[] initial = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int value=1;
        int expected=0;
        int result = search.findElement(initial, value);
        assertEquals(expected, result);
    }
    @Test
    void findElement000() {
        int[] initial = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int value=9;
        int expected=8;
        int result = search.findElement(initial, value);
        assertEquals(expected, result);
    }

    @Test
    void findElement3() {
        int[] initial = {0, 2, 4, 50, 66, 77, 80, 91};
        int value=80;
        int expected=6;
        int result = search.findElement(initial, value);
        assertEquals(expected, result);
    }
}