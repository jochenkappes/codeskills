package com.codeskills.tasks.fibonacci;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    Fibonacci fibonacci = new Fibonacci();

    @Test
    void createFibonacciOfSize0() {
        int x=0; // initial size

        List<Integer> fibonacciOfSize = fibonacci.createFibonacciOfSize(x);
        assertEquals(Collections.emptyList(), fibonacciOfSize);
    }

    @Test
    void createFibonacciOfSizeMinus() {
        int x=-1; // initial size
        assertThrows(IllegalArgumentException.class, () -> fibonacci.createFibonacciOfSize(x));
    }

    @Test
    void createFibonacciOfSize10() {
        int x=10; // initial size
        List<Integer> expected = Arrays.asList(1,1,2,3,5,8,13,21,34,55);
        List<Integer> fibonacciOfSize = fibonacci.createFibonacciOfSize(x);
        assertEquals(expected, fibonacciOfSize);
    }
    @Test
    void createFibonacciOfSize1() {
        int x=1; // initial size
        List<Integer> expected = Arrays.asList(1);
        List<Integer> fibonacciOfSize = fibonacci.createFibonacciOfSize(x);
        assertEquals(expected, fibonacciOfSize);
    }
    @Test
    void createFibonacciOfSize2() {
        int x=2; // initial size
        List<Integer> expected = Arrays.asList(1,1);
        List<Integer> fibonacciOfSize = fibonacci.createFibonacciOfSize(x);
        assertEquals(expected, fibonacciOfSize);
    }
}