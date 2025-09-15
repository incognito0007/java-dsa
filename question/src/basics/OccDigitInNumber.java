package basics;

public class OccDigitInNumber {
    public static void main(String[] args) {
        int n = 12344321;
        int digit = 7;
        int count = 0;

        while(n != 0) {
            int rem = n % 10;
            if(rem == digit) {
                count++;
            }
            n = n / 10;
        }

        System.out.println("The digit " + digit + " occurs " + count + " times in the number.");
    }
}
