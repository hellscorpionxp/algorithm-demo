package com.example;

import java.util.Arrays;

import org.junit.Test;

public class QuickSortTest {

    @Test
    public void testSort() {
        int SIZE = 15;
        Integer[] array1 = new Integer[SIZE];
        Integer[] array2 = new Integer[SIZE];
        for (int i = 0; i < SIZE; i++) {
            array1[i] = (int) (Math.random() * (100 + 1) + 100);
        }
        array2 = Arrays.copyOf(array1, array1.length);
        System.out.println("Before: " + Arrays.toString(array1));
        new QuickSort<>(array1).sort1();
        System.out.println("After: " + Arrays.toString(array1));
        new QuickSort<>(array2).sort2();
        System.out.println("After: " + Arrays.toString(array2));
    }

}
