package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaxValueInArray {
    public static void main(String[] args) {
        int num[] = new int[5];
        inputValues(num);
        outputValues(num);
        System.out.println("Max value in array: " + maxValue(num));
    }

    static void inputValues(int[] arr) {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    static void outputValues(int[] arr) {
        System.out.print(Arrays.toString(arr) + " ");
        System.out.println();
    }

    static int maxValue(int[] arr) {
        int max = arr[0];
        for (int value : arr) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }
}
