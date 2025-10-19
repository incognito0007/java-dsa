package Recursion;

public class RecursionIntro {
    public static void main(String[] args) {
        int n = 5;
        int m = 1;
        //print numbers from 1 to n using recursion
        PrintNumOneToN(m, n);

        //write a function to print numbers from n to 1
        printNumNToOne(n);
    }

    static void PrintNumOneToN(int m, int n) {
        if (m > n) {
            return;
        }
        System.out.println(m);
        PrintNumOneToN(m + 1, n);
    }

    static void printNumNToOne(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printNumNToOne(n - 1);
    }
}
