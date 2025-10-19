package Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        //write a function to calculate nth fibonacci number
        int n = 5;
        System.out.println("Fibonacci number at position " + n +  " is " + fibonacci(n));
    }

    static int fibonacci(int n) {
        if(n == 1) {
            return 0;
        }
        if(n == 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
