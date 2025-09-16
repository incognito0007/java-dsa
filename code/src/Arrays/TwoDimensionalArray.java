package Arrays;

import java.util.*;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] arr1 = new int[4][4];

        int[][] arr2 = {
            {1, 2, 3, 4},
            {4, 5, 6},
            {7, 8, 9}
        };

        inputValues(arr1);
        outputValues(arr1);
        System.out.println();
        outputValues(arr2);
    }

    static void inputValues(int[][] arr) {
        Scanner sc = new Scanner(System.in);
        for(int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }
    }

    static void outputValues(int[][] arr) {
        for(int row = 0; row < arr.length; row++) {
            for(int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
