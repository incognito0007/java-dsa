package Arrays;

import java.util.*;

public class MethodsAndArrays {
    public static void main(String[] args) {
        int[] num = new int[5];
        inputValues(num);
        outputValues(num);
        changeValue(num, 4);
        outputValues(num);
    }

    static void inputValues(int[] arr) {
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    static void outputValues(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    static void changeValue(int[] arr, int index) {
        Scanner sc = new Scanner(System.in);
        arr[index] = sc.nextInt();
    }
}
