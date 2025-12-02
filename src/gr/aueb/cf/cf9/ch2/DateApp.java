package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

/**
 * User types a day, month and year and the program
 * prints the date in a DD/MM//YY format.
 */
public class DateApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = 0;
        int month = 0;
        int year = 0;

        System.out.println("Please enter a day, a month and a year");
        day = scanner.nextInt();
        month = scanner.nextInt();
        year = scanner.nextInt();

        System.out.printf("The date is: %02d/%02d/%04d", day, month, year);
    }
}
