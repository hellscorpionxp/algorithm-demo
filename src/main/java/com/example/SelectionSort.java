package com.example;

import java.util.Arrays;

public class SelectionSort<T extends Comparable<? super T>> {

    private T[] array;

    public SelectionSort(T[] array) {
        this.array = array;
    }

    public void sort() {
        for (int i = 0; i < array.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j].compareTo(array[index]) < 0) {
                    index = j;
                }
            }
            if (index != i) {
                swap(i, index);
            }

            System.out.println("Step " + (i + 1) + ": " + Arrays.toString(array));
        }
    }

    private void swap(int i, int j) {
        T tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

}
