package methodsInJava.Advance;

public class BlockScope {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("value of a outside block: " + a);
        {
            a = 50;
            System.out.println("value of a inside block: " + a);
            //If I create a variable outside a scope, then it behave normally like - if we update its value inside the scope, then it will be updated outside the scope as well.

            int b = 30;
            System.out.println("value of b inside block: " + b);
            //If I create a variable inside a scope, then it will not be accessible outside the scope.
        }
        System.out.println("value of a after block: " + a);

//        System.out.println("value of b after block: " + b); --> This will throw an error because b is not accessible outside the block where it was defined.

        int b = 70; // This is a new variable b, different from the one inside the block.
        System.out.println("value of new b outside block: " + b);

    }
}
