package CyclicSort;

//https://leetcode.com/problems/missing-number/description/
//Missing Number

class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {3, 0, 1, 4, 2};
        System.out.println("Missing number in the array is " + missingNumber(arr));
    }

    static int missingNumber(int[] arr) {
        int i = 0;
        int ans = 0;
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

        for(int j = 0; j < arr.length; j++) {
            if(arr[j] == 0) ans = j + 1;
        }

        return ans;
    }

}