package Recursion;

public class Factorial {
    public static void main(String[] args) {
        //write a function to calculate nth fibonacci number
        int n = 5;
        System.out.println("Factorial of " + n +  " is " + factorial(n));
    }

    static int factorial(int n) {
        if(n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
