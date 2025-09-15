package methodsInJava.Advance;

public class Shadowing {
    static int x = 90; // This is a global variable

    public static void main(String[] args) {
        System.out.println("value of x in main: " + x);
        fun(x);

        int x = 40; // This is a local variable, it shadows the global variable
        System.out.println("value of x in main after shadowing: " + x);

        fun();
    }

    static void fun() {
        int x = 700; // This is another local variable, it shadows the global variable
        System.out.println("value of x in fun: " + x);
    }

    static void fun(int x) {
        System.out.println("value of x in fun with parameter: " + x);
    }
}
