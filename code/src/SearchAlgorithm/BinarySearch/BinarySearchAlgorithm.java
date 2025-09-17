package SearchAlgorithm.BinarySearch;

public class BinarySearchAlgorithm {
    public static void main(String[] args) {
        int[] arr = {3, 8, 13, 19, 27, 29, 35, 38, 45};
        int target = 29;
        binarySearch(arr, target);
    }

    static void binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start)/2;

            if(isAsc) {
                if(arr[mid] == target) {
                    System.out.println("Element found at index: " + mid);
                    return;
                }
                else if(arr[mid] < target) {
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            } else{
                if(arr[mid] == target) {
                    System.out.println("Element found at index: " + mid);
                    return;
                }
                else if(arr[mid] > target) {
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }
        }
        System.out.println("Element not found in the array.");
    }
}
