package gr.aueb.cf.cf9.ch5;

import java.util.Scanner;

/**
 * The user inserts a number and the program
 * calculates the number squared. For example if
 * the user enters 5, then the program calculates
 * 5 * 5 = 25.
 */
public class SquareMethodApp {
    /**
     * The method to calculate the square of a number
     * @param base the number for the calculation
     * @return the squared result
     */
    public static int square(int base) {
        return base * base;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base = 0;
        int result = 0;
        System.out.println("Please enter a number: ");
        base = scanner.nextInt();
        result = square(base);
        System.out.println("The result is: " + result);
    }
}
