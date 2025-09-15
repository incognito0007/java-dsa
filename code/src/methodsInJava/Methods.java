package methodsInJava;

public class Methods {
    public static void main(String[] args) {
        Greet("Ankit");

        SwapNumbers(12, 14);

        int[] arr = {1, 2, 3, 4, 5};
        changeArrayValue(arr);
        for(int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }
    }

    static void Greet(String name) {
        System.out.println("Hello " + name);
    }

    static void SwapNumbers(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a: " + a + " b: " + b);
    }

    static void changeArrayValue(int[] arr) {
        arr[0] = 99;
    }
}
