package SortingAlgorithm;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        insertionSort(arr);
    }

    static void insertionSort(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = i + 1; j > 0; j--) {
                if(arr[j] < arr[j - 1]) {
                    // swap arr[j] and arr[j - 1]
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break; // since the left side is already sorted
                }
            }
        }

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
