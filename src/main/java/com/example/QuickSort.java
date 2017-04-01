package com.example;

public class QuickSort<T extends Comparable<? super T>> {

    private T[] array;

    public QuickSort(T[] array) {
        this.array = array;
    }

    public void sort() {
        sort(0, array.length - 1);
    }

    private void sort(int left, int right) {
        int l = left;
        int r = right;
        T m = array[(left + right) / 2];
        while (l < r) {
            while (array[l].compareTo(m) < 0) {
                ++l;
            }
            while (array[r].compareTo(m) > 0) {
                --r;
            }
            if (l < r) {
                swap(l, r);
                ++l;
                --r;
            }
        }
        if (l == r) {
            l++;
        }

        if (left < r) {
            sort(left, l - 1);
        }
        if (right > l) {
            sort(r + 1, right);
        }
    }

    private void swap(int i, int j) {
        T tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

}
