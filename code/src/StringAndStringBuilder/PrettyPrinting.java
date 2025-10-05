package StringAndStringBuilder;

public class PrettyPrinting {
    public static void main(String[] args) {
        float a = 453.1274567f;
        System.out.printf("Formatted number is %.2f\n", a); // 2 decimal places
        System.out.printf("Formatted number is %.3f\n", a); // 3 decimal places
        System.out.printf("Hello, my name is %s and I am %d years old.\n", "Ankit", 23);
        System.out.printf("Hello, my name is %S and I am %d years old.\n", "Ankit", 23); // Uppercase name
        System.out.printf("Hello, my name is %s and I am %d years old.\n", "Ankit", 23);
        System.out.printf("Hello, my name is %10s and I am %d years old.\n", "Ankit", 23); // Name right-aligned in a field of width 10
        System.out.printf("Hello, my name is %-10s and I am %d years old.\n", "Ankit", 23); // Name left-aligned in a field of width 10
        System.out.printf("Hello, my name is %-10s and I am %05d years old.\n", "Ankit", 23); // Age padded with leading zeros to width 5
    }
}
