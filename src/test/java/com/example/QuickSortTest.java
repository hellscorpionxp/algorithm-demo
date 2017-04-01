package com.example;

import java.util.Arrays;

import org.junit.Test;

public class QuickSortTest {

    @Test
    public void testSort() {
        int SIZE = 15;
        Integer[] array = new Integer[SIZE];
        for (int i = 0; i < SIZE; i++) {
            array[i] = (int) (Math.random() * (100 + 1) + 100);
        }
        System.out.println("Before: " + Arrays.toString(array));
        new QuickSort<>(array).sort();
        System.out.println("After: " + Arrays.toString(array));
    }

}
