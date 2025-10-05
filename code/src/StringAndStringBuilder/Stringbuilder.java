package StringAndStringBuilder;

public class Stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(" World");
        System.out.println(sb.toString()); // Output: Hello World
        sb.replace(0, 5, "Hi");
        System.out.println(sb.toString()); // Output: Hi World
        sb.delete(2, 8);
        System.out.println(sb.toString()); // Output: Hi
        sb.insert(2, " there");
        System.out.println(sb.toString()); // Output: Hi there
        sb.reverse();
        System.out.println(sb.toString()); // Output: ereht iH
        System.out.println("Length: " + sb.length()); // Output: Length: 8
        System.out.println("Capacity: " + sb.capacity()); // Output: Capacity: 16
    }
}
