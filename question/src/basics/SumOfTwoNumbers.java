package basics;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        int a = 12, b = 20;
        int result = sum(a, b);
        System.out.println("The sum of " + a + " and " + b + " is: " + result);
    }

    public static int sum(int a, int b) {
        return a + b;
    }
}
