package Arrays;

import java.util.*;

public class OneDimensionalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Array declaration

//        1st Method
        int[] arr1 = new int[5]; // Declaration and memory allocation
        arr1[0] = 10; // Initialization
        arr1[1] = 20;
        arr1[2] = 30;
        arr1[3] = 40;
        arr1[4] = 50;

//        2nd Method
        int[] arr2 = {15, 25, 35, 45, 55}; // Declaration, memory allocation and initialization

//        3rd Method
        int[] arr3 = new int[]{5, 10, 15, 20, 25}; // Declaration, memory allocation and initialization

//        4th Method
        int[] arr4 = new int[5]; // Declaration and memory allocation
        for(int i = 0; i < arr4.length; i++) {
            arr4[i] = sc.nextInt(); // Initialization
        }

//        Array Traversal

//        Method 1: Using for loop
        System.out.println("Array 1:");
        for(int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println("\nArray 2:");
        for(int j : arr2) {
            System.out.print(j + " ");
        }
        System.out.println("\nArray 3:");
        for(int k = 0; k < arr3.length; k++) {
            System.out.print(arr3[k] + " ");
        }
        System.out.println("\nArray 4:");
        for(int l : arr4) {
            System.out.print(l + " ");
        }

//        Method 2: Using String Method
        System.out.println("\nArray 1: " + Arrays.toString(arr1));
        System.out.println("Array 2: " + Arrays.toString(arr2));
        System.out.println("Array 3: " + Arrays.toString(arr3));
        System.out.println("Array 4: " + Arrays.toString(arr4));
    }
}
