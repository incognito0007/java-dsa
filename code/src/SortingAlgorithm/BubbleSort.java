package SortingAlgorithm;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 7, 6};
        bubbleSort(arr);
    }

    static void bubbleSort(int[] arr) {
        boolean swap = false;
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] > arr[j + 1]) {
                    // swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = true;
                }
            }
            if(!swap) break; // if no swap happened, the array is already sorted
        }

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
