package com.csc;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class TestQuickSort {

    @Test
    void testSmallArray() {
        int[] arr = {3, 1, 4};
        int[] result = {1, 3, 4};
        QuickSort.quickSort(arr, 0, arr.length-1);
        assertArrayEquals(result, arr);
    }

    @Test
    void testMediumArray() {
        int[] arr = {7, 4, 3, 6, 5};
        int[] expected = {3, 4, 5, 6, 7};
        QuickSort.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(expected, arr);
    }

    @Test
    void testLargeArray() {
        int[] arr = {10, 7, 8, 9, 1, 5};
        int[] expected = {1, 5, 7, 8, 9, 10};
        QuickSort.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(expected, arr);
    }

    @Test
    void testReverseSortedArray() {
        int[] arr = {5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5};
        QuickSort.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(expected, arr);
    }

    @Test
    void testArrayWithDuplicates() {
        int[] arr = {4, 2, 3, 1, 2, 3, 4};
        int[] expected = {1, 2, 2, 3, 3, 4, 4};
        QuickSort.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(expected, arr);
    }
}
