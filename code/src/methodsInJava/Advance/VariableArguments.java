package methodsInJava.Advance;

import java.util.Arrays;

public class VariableArguments {
    public static void main(String[] args) {
        System.out.println("1st Array");
        varArgs(13, 14);

        System.out.println("2nd Array");
        varArgs(5, 37, 93, 11, 27);
    }

    // Here number of arguments is variable, that is, it is not fixed, you can assign as many as you want while calling the method
    static void varArgs(int ...x) {
        System.out.println(Arrays.toString(x));
    }
}
