package CyclicSort;
//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/

import java.util.ArrayList;

class DisappearedNumbers {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println("Disappeared numbers in the array are " + findDisappearedNumbers(arr));
    }

    static ArrayList<Integer> findDisappearedNumbers(int[] arr) {
        int i = 0;
        ArrayList<Integer> ansList = new ArrayList<>();
        while(i < arr.length) {
            int correctIndex = arr[i] - 1;
            if(arr[i] != arr[correctIndex]){
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            }else{
                i++;
            }
        }

        for(int j = 0; j < arr.length; j++){
            if(arr[j] - 1 != j) ansList.add(j + 1);
        }

        return ansList;
    }
}