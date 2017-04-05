package com.example;

public class QuickSort<T extends Comparable<? super T>> {

    private T[] array;

    public QuickSort(T[] array) {
        this.array = array;
    }

    public void sort1() {
        sort1(0, array.length - 1);
    }

    private void sort1(int left, int right) {
        int l = left;
        int r = right;
        int pivot = left;
        T tmp = array[left];
        while (l <= r) {
            while (r >= pivot && array[r].compareTo(tmp) >= 0) {
                r--;
            }
            if (r >= pivot) {
                array[pivot] = array[r];
                pivot = r;
            }
            while (l <= pivot && array[l].compareTo(tmp) <= 0) {
                l++;
            }
            if (l <= pivot) {
                array[pivot] = array[l];
                pivot = l;
            }
        }
        array[pivot] = tmp;

        if (left < pivot) {
            sort1(left, pivot - 1);
        }
        if (right > pivot) {
            sort1(pivot + 1, right);
        }
    }

    public void sort2() {
        sort2(0, array.length - 1);
    }

    private void sort2(int left, int right) {
        int l = left - 1;
        int r = right;
        T pivot = array[right];
        while (l < r) {
            while (l < r && array[++l].compareTo(pivot) < 0)
                ;
            while (l < r && array[--r].compareTo(pivot) > 0)
                ;
            if (l < r) {
                swap(l, r);
            }
        }
        swap(l, right);

        if (left < l) {
            sort2(left, l - 1);
        }
        if (right > l) {
            sort2(l + 1, right);
        }
    }

    private void swap(int i, int j) {
        T tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

}
