package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * User inserts a year and the program
 * calculates if it is a leap year.
 */
public class LeapYearApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputYear = 0;
        boolean leapYear = false;
        final int LEAP_YEAR_MOD4 = 4;
        final int NOT_LEAP_YEAR_MOD = 100;
        final int LEAP_YEAR_MOD400 = 400;

        System.out.println("Please enter a year: ");
        inputYear = scanner.nextInt();

        leapYear = ((inputYear % LEAP_YEAR_MOD4 == 0 && inputYear % NOT_LEAP_YEAR_MOD != 0)
                || inputYear % LEAP_YEAR_MOD400 == 0);
        System.out.println("Is the year a leap year? " + leapYear);
    }
}
