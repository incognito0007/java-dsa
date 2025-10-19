package Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        //write a function to perform binary search using recursion
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 7;
        int start = 0;
        int end = arr.length - 1;
        System.out.println("Element " + target + " is found at index " + binarySearch(arr, target, start, end));
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        if(start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if(arr[mid] == target) {
            return mid;
        }
        else if(arr[mid] < target) {
            return binarySearch(arr, target, mid + 1, end);
        }
        else {
            return binarySearch(arr, target, start, mid - 1);
        }
    }
}
