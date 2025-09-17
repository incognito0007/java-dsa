package SearchAlgorithm.BinarySearch;

public class BinarySearchTwoDimensional {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 50}
        };
        int target = 3;
        binarySearchTwoDimensional(arr, target);
    }

    static void binarySearchTwoDimensional(int[][] arr, int target) {
        int rows = arr.length;
        int cols = arr[0].length;
        int start = 0;
        int end = rows * cols -1;

        while(start <= end) {
            int mid = start + (end - start) / 2;
            int midElement = arr[mid / cols][mid % cols];

            if(midElement == target) {
                System.out.println("Element found at index: [" + (mid / cols) + "][" + (mid % cols) + "]");
                return;
            }
            else if(midElement < target) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        System.out.println("Element not found in the array.");
    }
}
