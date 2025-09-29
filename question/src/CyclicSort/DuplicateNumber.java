package CyclicSort;
// https://leetcode.com/problems/find-the-duplicate-number/

class DuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3};
        System.out.println("Duplicate number in the array is " + findDuplicate(arr));
    }

    static int findDuplicate(int[] arr) {
        int i = 0;
        while(i < arr.length){
            int correctIndex = arr[i] - 1;
            if(arr[i] == 0){
                i++;
            }
            else if(arr[i] != arr[correctIndex]) {
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            }
            else {
                i++;
            }
        }

        return arr[arr.length - 1];
    }
}