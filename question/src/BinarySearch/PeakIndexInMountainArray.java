package BinarySearch;

public class PeakIndexInMountainArray {
    public static void main(String[] args) {
        int[] arr = {0,2,1,0};
        System.out.println("Peak Index in above mountain array is " + peakIndex(arr));
    }

    static int peakIndex(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end) {
            int mid = (start + (end - start)/2);

            if(arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}
