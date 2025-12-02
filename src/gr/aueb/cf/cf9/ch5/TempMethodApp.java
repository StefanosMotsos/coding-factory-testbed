package gr.aueb.cf.cf9.ch5;

import java.util.Scanner;

/**
 * The user inserts the temperature in Celsius
 * and the program, using a method, converts it
 * into Fahrenheit
 */
public class TempMethodApp {
    /**
     * The celsius to Fahrenheit converter
     * @param celsius Temperature in celsius
     * @return Temperature in Fahrenheit
     */
    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = celsius * (9.0/5) + 32;
        return fahrenheit;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius = 0.0;

        System.out.println("Please enter the temperature in celsius: ");
        celsius = scanner.nextDouble();
        double fahrenheit = celsiusToFahrenheit(celsius);
        System.out.printf("The temperature in celsius is %.2f and it is converted to %.2f Fahrenheit", celsius, fahrenheit);
    }
}
