package BinarySearch;

public class CeilingAndFloor {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,11,13,15,17,19};
        int target = 14;
        System.out.println("Ceiling of the number " + target + " is " + ceilingNumber(arr, target));
        System.out.println("Floor of the number " + target + " is " + floorNumber(arr, target));
    }

    static int ceilingNumber(int[] arr, int target) {
        if(target > arr[arr.length - 1]) return -1;

        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];

        while(start <= end) {
            int mid = (start + (end - start)/2);

            if(target == arr[mid]) return arr[mid];

            if(isAsc) {
                if(target < arr[mid]) {
                    end = mid -1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                }
            }else{
                if(target > arr[mid]) {
                    end = mid -1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                }
            }
        }
        return arr[start];
    }

    static int floorNumber(int[] arr, int target) {
        if(target < arr[0]) return -1;

        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];

        while(start <= end) {
            int mid = (start + (end - start)/2);

            if(target == arr[mid]) return arr[mid];

            if(isAsc) {
                if(target < arr[mid]) {
                    end = mid -1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                }
            }else{
                if(target > arr[mid]) {
                    end = mid -1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                }
            }
        }
        return arr[end];
    }
}
