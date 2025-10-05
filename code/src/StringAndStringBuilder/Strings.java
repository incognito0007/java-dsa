package StringAndStringBuilder;

public class Strings {
    public static void main(String[] args) {
        String name = "Ankit Anand";
        System.out.println(name);

        String a = "Ankit";
//        a[0] = 'B'; // This will give an error because strings are immutable in Java
//        System.out.println(a);

        a = "Anand"; // This is valid because we are reassigning the reference
        System.out.println(a);

        String x = "Ankit";
        String y = "Ankit";
        System.out.println(x == y); // true, because both refer to the same string literal

        String m = new String("Ankit");
        String n = new String("Ankit");
        System.out.println(m == n); // false, because both refer to different objects in memory
        System.out.println(m.equals(n)); // true, because the content is the same

        System.out.println(x.charAt(0)); // A
        System.out.println(x.length()); // 5
        System.out.println(x.substring(1, 4)); // nki
        System.out.println(x.contains("ki")); // true
        System.out.println(x.indexOf("ki")); // 2
        System.out.println(x.equals("ankit")); // false
        System.out.println(x.equalsIgnoreCase("ankit")); // true
        System.out.println(x.isEmpty()); // false
        System.out.println("   Ankit   ".strip()); // "Ankit"
        System.out.println("Ankit".toLowerCase()); // ankit
        System.out.println("Ankit".toUpperCase()); // ANKIT
        System.out.println("Ankit".replace('A', 'B')); // Bnkit
        System.out.println("Ankit".replace("An", "Bn")); // Bnkit
        System.out.println("Ankit Anand".split(" ")); // [Ankit, Anand]
        System.out.println("Ankit Anand".split(" ")[0]); // Ankit
        System.out.println("Ankit Anand".split(" ")[1]); // Anand
    }
}
