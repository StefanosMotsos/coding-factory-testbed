package gr.aueb.cf.cf9.ch4;

import java.util.Scanner;

/**
 * The user enters an integer number from 1 till 7
 * and the program returns a day of week corresponding
 * to the number. Day 1 = Monday and so on.
 */
public class WeekApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("It is Monday!");
                break;
            case 2:
                System.out.println("It is Tuesday!");
                break;
            case 3:
                System.out.println("It is Wednesday!");
                break;
            case 4:
                System.out.println("It is Thursday!");
                break;
            case 5:
                System.out.println("It is Friday!");
                break;
            case 6:
                System.out.println("It is Saturday!");
                break;
            case 7:
                System.out.println("It is Sunday");
                break;
            default:
                System.out.println("Error in data!");
                break;
        }
    }
}
