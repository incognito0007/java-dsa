package BinarySearch;

public class FirstAndLastOccurrenceOfElement {
    public static void main(String[] args) {
        int[] arr = {1,2,2,2,2,3,4,5,6};
        int target = 2;
        System.out.println("First occurrence of element " + target + " is at index " + firstOccurrence(arr, target));
        System.out.println("Last occurrence of element " + target + " is at index " + lastOccurrence(arr, target));
    }

    static int firstOccurrence(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        
        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                end = mid - 1;
            }
        }

        return ans;
    }

    static int lastOccurrence(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                start = mid + 1;
            }
        }

        return ans;
    }
}
