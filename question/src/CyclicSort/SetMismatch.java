package CyclicSort;
// https://leetcode.com/problems/set-mismatch/

class SetMismatch {
    public static void main(String[] args) {
        int[] arr = {1,2,2,4};
        int[] ans = findErrorNums(arr);
        System.out.println("The number that occurs twice and the missing number are " + ans[0] + " and " + ans[1]);
    }

    static int[] findErrorNums(int[] arr) {
        int i = 0;
        int repeatVal = 0;
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

        for(int j = 0; j < arr.length; j++){
            if(arr[j] - 1 != j) repeatVal = j;
        }

        int twiceOccVal = arr[repeatVal];
        int missingVal = repeatVal + 1;

        return new int[] {twiceOccVal, missingVal};
    }
}