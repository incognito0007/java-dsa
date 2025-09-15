package basics;

public class AlphabetCaseCheck {
    public static void main(String[] args) {
        char ch = System.console().readLine("Enter a character: ").charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is a lowercase alphabet.");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " is an uppercase alphabet.");
        } else {
            System.out.println(ch + " is not an alphabet.");
        }
    }
}
