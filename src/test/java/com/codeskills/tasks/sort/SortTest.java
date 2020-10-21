package com.codeskills.tasks.sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SortTest {

    Sort sort = new Sort();

    @Test
    void sortVals1() {
        int[] input = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int[] expected = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] res = sort.sortVals(input);

        assertArrayEquals(expected, res);
    }

    @Test
    void sortVals2() {
        int[] input = {9, -8, 7, -6, 5, -4, 3, -2, -1, 0};
        int[] expected = {-8, -6, -4, -2, -1, 0, 3, 5, 7, 9};
        int[] res = sort.sortVals(input);

        assertArrayEquals(expected, res);
    }

    @Test
    void sortVals4() {
        int[] input = new int[0];
        int[] res = sort.sortVals(input);
        assertArrayEquals(input, res);
    }
}
