package methodsInJava;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (isArmstrongNumber(n)) System.out.println(n + " is an Armstrong number");
        else System.out.println(n + " is not an Armstrong number");
    }

    static boolean isArmstrongNumber(int n) {
        int sum = 0;
        int digits = String.valueOf(n).length();
        int temp = n;
        while (temp > 0) {
            int rem = temp % 10;
            sum = (int) (sum + Math.pow(rem, digits));
            temp = temp / 10;
        }
        return sum == n;
    }
}
