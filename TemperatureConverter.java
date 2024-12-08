import java.util.Scanner; // Adding the Scanner class to handle user input

public class TemperatureConverter {

    // Formula to convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Formula to convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        // Creating a Scanner object for capturing user input
        Scanner input = new Scanner(System.in);

        // Displaying options to the user
        System.out.println("Temperature Converter!");
        System.out.println("Select the temperature conversion:");
        System.out.println("1: Celsius to Fahrenheit");
        System.out.println("2: Fahrenheit to Celsius");

        // Obtaining the user's choice and validating the  input
        int choice = 0;
        while (choice != 1 && choice != 2) {
            System.out.print("Please enter 1 or 2 to select a conversion: ");
            if (input.hasNextInt()) {
                choice = input.nextInt();
                if (choice != 1 && choice != 2) {
                    System.out.println("Invalid input. Please enter 1 or 2.");
                }
            } else {
                System.out.println("Invalid input. Please enter 1 or 2.");
                input.next(); // Clearing the invalid input
            }
        }

        // Prompting the user for the temperature value
        System.out.print("Enter the temperature value: ");
        double temperature = 0;
        while (!input.hasNextDouble()) {
            System.out.println("Please enter a valid number for the temperature.");
            input.next(); // Clear invalid input
        }
        temperature = input.nextDouble();

        // Performing the calculation based on the user's choice
        double convertedTemperature;
        if (choice == 1) {
            convertedTemperature = convertCelsiusToFahrenheit(temperature);
            System.out.printf("%.2f Celsius is %.2f Fahrenheit.%n", temperature, convertedTemperature);
        } else {
            convertedTemperature = convertFahrenheitToCelsius(temperature);
            System.out.printf("%.2f Fahrenheit is %.2f Celsius.%n", temperature, convertedTemperature);
        }

        // Closing the scanner
        input.close();
    }
}
