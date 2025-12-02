package gr.aueb.cf.cf9.ch5;

import java.util.Scanner;

/**
 * The user enters 3 numbers and the program
 * calculates which is the max of the 3 with
 * a method.
 */
public class MaxOfThree {
    /**
     * Finds the max number from 3 numbers.
     * @param num1 First Number.
     * @param num2 Second Number.
     * @param num3 Third Number.
     * @return Max Number.
     */
    public static int findMax(int num1, int num2, int num3) {
        int maxOfTwo = 0;
        int totalMax = 0;
        maxOfTwo = Math.max(num1, num2);
        totalMax = Math.max(maxOfTwo, num3);
        return totalMax;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        System.out.println("Please enter 3 different numbers: ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();
        int totalMax = findMax(num1, num2, num3);
        System.out.println("The maximum number is: " + totalMax);
    }
}
