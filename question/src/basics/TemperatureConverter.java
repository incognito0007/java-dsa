package basics;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select any one option (enter any number from below):");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Celsius to Kelvin");
        System.out.println("4. Kelvin to Celsius");
        System.out.println("5. Fahrenheit to Kelvin");
        System.out.println("6. Kelvin to Fahrenheit");
        int choice = sc.nextInt();

        while(choice >= 1 && choice <= 6) {
            System.out.print("Enter the temperature value: ");
            double temperature = sc.nextDouble();
            double convertedTemperature = 0.0;
            String resultUnit = "";

            switch (choice) {
                case 1:
                    convertedTemperature = (temperature * 9/5) + 32;
                    resultUnit = "Fahrenheit";
                    break;
                case 2:
                    convertedTemperature = (temperature - 32) * 5/9;
                    resultUnit = "Celsius";
                    break;
                case 3:
                    convertedTemperature = temperature + 273.15;
                    resultUnit = "Kelvin";
                    break;
                case 4:
                    convertedTemperature = temperature - 273.15;
                    resultUnit = "Celsius";
                    break;
                case 5:
                    convertedTemperature = (temperature - 32) * 5/9 + 273.15;
                    resultUnit = "Kelvin";
                    break;
                case 6:
                    convertedTemperature = (temperature - 273.15) * 9/5 + 32;
                    resultUnit = "Fahrenheit";
                    break;
            }

            System.out.printf("Converted Temperature: %.2f %s%n", convertedTemperature, resultUnit);

            System.out.println("Select any one option (enter any number from below):");
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celsius");
            System.out.println("3. Celsius to Kelvin");
            System.out.println("4. Kelvin to Celsius");
            System.out.println("5. Fahrenheit to Kelvin");
            System.out.println("6. Kelvin to Fahrenheit");
            choice = sc.nextInt();
        }

        System.out.println("Invalid input! Please select a valid option.");
    }
}
