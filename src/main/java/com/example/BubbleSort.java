package com.example;

import java.util.Arrays;

public class BubbleSort<T extends Comparable<? super T>> {

    private T[] array;

    public BubbleSort(T[] array) {
        this.array = array;
    }

    public void sort() {
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array.length - i; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    swap(j, j + 1);
                }
            }

            System.out.println("Step " + i + ": " + Arrays.toString(array));
        }
    }

    private void swap(int i, int j) {
        T tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

}
