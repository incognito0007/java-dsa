package CyclicSort;
// https://leetcode.com/problems/first-missing-positive/

class FirstMissingPositive {
    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1};
        System.out.println("The first missing positive number is " + firstMissingPositive(arr));
    }

    static int firstMissingPositive(int[] arr) {
        int i = 0;
        while(i < arr.length){
            int correctIndex = arr[i] - 1;
            if(arr[i] <= arr.length && arr[i] > 0 && arr[i] != arr[correctIndex]){
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            }else{
                i++;
            }
        }

        for(int j = 0; j < arr.length; j++){
            if(arr[j] - 1 != j){
                return j + 1;
            }
        }

        return arr.length + 1;
    }
}