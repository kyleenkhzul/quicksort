package com.csc; 

public class QuickSort {

     /*
     * This function swaps two indices in an int array 
     * @param int[] arr, array to sort
     * @param int i, the first index
     * @param int j, the second index
     */
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /*
     * This function takes the last element as the pivot element and
     * places it at the correct position in the sorted array. It places all
     * of the smaller elements to the left of the pivot element and all
     * of the greater elements to the right of the pivot element. 
     * @param int[] arr, array to sort
     * @param int a, represents positions at the front of the array
     * @param int b, represents the pivot element, initially, the last element
     */
    public static int pivotElement(int[] arr, int a, int b) {
        // Choosing the pivot
        int pivot = arr[b];

        // Index of smaller element 
        int i = (a - 1);
        for(int j = a; j <= b - 1; j++) {

            // If current element is smaller then pivot, swap
            if(arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, b);
        return(i+1);
    }

    /*
     * This function puts together all of the helper functions and Quick Sorts an array
     * @param int[] arr, array to be sorted
     * @param int low, starting index
     * @param int high, ending index
     */
    public static void quickSort(int[] arr, int low, int high) {
        if(low < high) {
            int partition = pivotElement(arr, low, high);
            quickSort(arr, low, partition-1);
            quickSort(arr, partition+1, high);
        }
    }

    /*
     * This function prints out an array
     * @param int[] arr, array to be printed
     */
    public static void printArr(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}