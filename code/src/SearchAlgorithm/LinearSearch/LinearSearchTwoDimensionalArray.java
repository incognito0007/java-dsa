package SearchAlgorithm.LinearSearch;

import java.util.Scanner;

public class LinearSearchTwoDimensionalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];
        System.out.println("Enter the elements of the 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter the element to search: ");
        int target = sc.nextInt();
        linearSearch(arr, target);
    }

    static void linearSearch(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    System.out.println("Element found at index: [" + i + "][" + j + "]");
                    return;
                }
            }
        }
        System.out.println("Element not found in the array.");
    }
}
