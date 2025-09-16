package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrays {
    public static void main(String[] args) {
        int[] num = new int[5];
        inputValues(num);
        outputValues(num);
        reverseArray(num);
        outputValues(num);
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

    static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start < end) {
            swapArrayIndex(arr, start, end);
            start++;
            end--;
        }
    }

    static void swapArrayIndex(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
