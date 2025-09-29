package SortingAlgorithm;

import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 1, 4};
        cycleSort(arr);
    }

    static void cycleSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if(arr[i] != arr[correctIndex]){
                // swap arr[i] and arr[correctIndex]
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            } else {
                i++;
            }
        }

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
