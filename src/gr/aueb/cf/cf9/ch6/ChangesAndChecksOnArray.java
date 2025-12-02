package gr.aueb.cf.cf9.ch6;

import java.util.Arrays;
import java.util.Scanner;

/**
 * This program contains a collection of small exercises
 * designed to practice working with arrays, including
 * checking and modifying their values through methods.
 */
public class ChangesAndChecksOnArray {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5};

        System.out.println("Please enter a value: ");
        int value = scanner.nextInt();
        int position = getPosition(arr, value);
        if (position == -1) System.out.println("Value not found!");
        else System.out.printf("The value is in the position: %d", position);
        System.out.println();

        int[] evens = filterEven(arr);
        System.out.print("The even numbers are: ");
        for (int el : evens) {
            System.out.print(el + " ");
        }
        System.out.println();

        int[] doubled = mapToDouble(arr);
        System.out.print("The double numbers are: ");
        for (int d : doubled) {
            System.out.print(d + " ");
        }
        System.out.println();

        System.out.printf("There is 1 positive: %b\n", onePositive(arr));
        System.out.printf("There is only positives: %b\n", allPositive(arr));

    }
    /**
     * Finds the position of the value in an array.
     * @param arr   The array.
     * @param value The value.
     * @return      Either returns the position of the value or -1 if it doesn't find it.
     */
    public static int getPosition(int[] arr, int value) {
        for (int el = 0; el < arr.length; el++) {
            if (arr[el] == value) return el;
        }
        return -1;
    }

    /**
     * Makes a new array with the even numbers of the parameter array.
     * @param arr   The array.
     * @return      The even array.
     */
    public static int[] filterEven(int[] arr) {
        if (arr == null || arr.length == 0) return new int[0];
        int[] evens = new int[arr.length];
        int count = 0;

        for (int el : arr) {
            if (el % 2 == 0) {
                evens[count++] = el;
            }
        }
        return Arrays.copyOf(evens, count);
    }

    /**
     * Doubles the values inside the array and returns a new array.
     * @param arr   The array.
     * @return      The new "double" array.
     */
    public static int[] mapToDouble(int[] arr) {
        if (arr == null || arr.length == 0) return new int[0];
        int[] mapped = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            mapped[i] = arr[i] * 2;
        }
        return mapped;
    }

    /**
     * Checks if the array has at least one positive number.
     * @param arr The array.
     * @return  True if one positive is found, false if not.
     */
    public static boolean onePositive(int[] arr) {
        if (arr == null || arr.length == 0) return false;
        for (int el : arr) {
            if (el > 0) return true;
        }
        return false;
    }

    /**
     * Checks if the array has only positive numbers.
     * @param arr The array.
     * @return  True if all numbers are positive, false if not.
     */
    public static boolean allPositive(int[] arr) {
        if (arr == null || arr.length == 0) return false;
        for (int el : arr) {
            if (el < 0) return false;
        }
        return true;
    }
}
