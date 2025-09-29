package CyclicSort;
// https://leetcode.com/problems/find-all-duplicates-in-an-array/

import java.util.ArrayList;

class FindAllDuplicates {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println("Duplicate numbers in the array are " + findAllDuplicates(arr));
    }

    static ArrayList<Integer> findAllDuplicates(int[] arr) {
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
            if(arr[j] - 1 != j) ansList.add(arr[j]);
        }
        return ansList;
    }
}