package basics.inputOutputDatatypes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //output from a variable
        String name = "Ankit Anand";
        System.out.println("Hello World, This is " + name);

        //user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String userName = sc.nextLine();
        System.out.println("Hello " + userName + ", Welcome to Java Programming!");

        //Primitive Datatypes
        int age = 20; // Integer datatype
        float height = 5.9f; // Floating point datatype
        char grade = 'A'; // Character datatype
        boolean isStudent = true; // Boolean datatype
        long phoneNumber = 1234567890L; // Long datatype
        double gpa = 3.75; // Double datatype
        byte smallNumber = 100; // Byte datatype
        short mediumNumber = 10000; // Short datatype

        System.out.println("User Details:");
        System.out.println("Name: " + userName);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Grade: " + grade);
        System.out.println("Is Student: " + isStudent);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("GPA: " + gpa);
        System.out.println("Small Number (byte): " + smallNumber);
        System.out.println("Medium Number (short): " + mediumNumber);
    }
}