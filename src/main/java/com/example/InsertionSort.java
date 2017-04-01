package com.example;

import java.util.Arrays;

public class InsertionSort<T extends Comparable<? super T>> {

    private T[] array;

    public InsertionSort(T[] array) {
        this.array = array;
    }

    public void sort() {
        for (int i = 1; i < array.length; i++) {
            T tmp = array[i];
            int j = i - 1;
            for (; j >= 0 && tmp.compareTo(array[j]) < 0; j--) {
                array[j + 1] = array[j];
            }
            array[j + 1] = tmp;

            System.out.println("Step " + i + ": " + Arrays.toString(array));
        }
    }

}
