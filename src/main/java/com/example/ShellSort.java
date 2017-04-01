package com.example;

import java.util.Arrays;

public class ShellSort<T extends Comparable<? super T>> {

    private T[] array;

    public ShellSort(T[] array) {
        this.array = array;
    }

    public void sort() {
        int j;
        int x = 0;
        for (int r = array.length / 2; r >= 1; r /= 2) {
            for (int i = r; i < array.length; i++) {
                T tmp = array[i];
                for (j = i - r; j >= 0 && tmp.compareTo(array[j]) < 0; j -= r) {
                    array[j + r] = array[j];
                }
                array[j + r] = tmp;
            }

            x++;
            System.out.println("Step " + x + ": " + Arrays.toString(array));
        }
    }

}
