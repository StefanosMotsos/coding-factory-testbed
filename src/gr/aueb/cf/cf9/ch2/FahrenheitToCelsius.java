package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

/**
 * The user inserts the temperature in Fahrenheit
 * and the program converts it into Celsius.
 */
public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fahrenheitTemp = 0;
        int celsiusTemp = 0;

        System.out.println("Please insert the temperature in Fahrenheit: ");
        fahrenheitTemp = scanner.nextInt();
        final int CONVERTOR_RESULT = 5 * (fahrenheitTemp -32) / 9;
        celsiusTemp = CONVERTOR_RESULT;
        System.out.printf("The temperature is %d Celsius", celsiusTemp);

    }
}
