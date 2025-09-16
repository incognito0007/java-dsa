package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListBasic {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(); //Empty list

        System.out.println(list);

//        Add values inside list
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);

        list.add(1, 15); //Add 15 at index 1 --> this will not update the value at index 1, instead it will shift the value at index 1 and all the values after it to the right
        System.out.println(list);

        list.set(2, 25); //Update value at index 2 to 25
        System.out.println(list);

        list.remove(3); //Remove value at index 3
        System.out.println(list);

        System.out.println(list.size()); //Size of the list
        System.out.println(list.get(2)); //Get value at index 2

        inputVal(list);
        System.out.println(list);
        System.out.println(list.get(7));
    }

    static void inputVal(ArrayList<Integer> list){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <= 5; i++){
            list.add(sc.nextInt());
        }
    }
}
