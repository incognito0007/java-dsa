package methodsInJava.Advance;

public class MethodOverloading {
    public static void main(String[] args) {
        foo();
        foo(1);
        foo(1, 2);
        foo("Ankit");
        foo(1, "Ankit");
        foo("Ankit", 1);
    }

    static void foo(){
        System.out.println("Good Morning Bro");
    }
    static void foo(int a) {
        System.out.println("Good Morning " + a + " Bro");
    }
    static void foo(int a, int b) {
        System.out.println("Good Morning " + a + " Bro");
        System.out.println("Good Morning " + b + " Bro");
    }
    static void foo(String name) {
        System.out.println("Good Morning " + name + " Bro");
    }
    static void foo(int a, String name) {
        System.out.println("Good Morning " + a + " Bro");
        System.out.println("Good Morning " + name + " Bro");
    }
    static void foo(String name, int a) {
        System.out.println("Good Morning " + name + " Bro");
        System.out.println("Good Morning " + a + " Bro");
    }
}
