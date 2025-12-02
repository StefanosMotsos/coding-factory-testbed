package gr.aueb.cf.cf9.ch6;

import java.util.Scanner;

public class ExercisesOfThree {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr = new int[6];
        System.out.println("Please insert 6 numbers: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.printf("it got 3 or less evens: %s\n", threeEvens(arr));
        System.out.printf("it got 3 or less odds: %s\n", threeOdds(arr));
        System.out.printf("it got 3 or less consecutive numbers: %s\n", threeConsecutive(arr) );
        System.out.printf("it got 3 or less numbers ending on the same digit: %s\n", threeEndings(arr) );
        System.out.printf("it got 3 or less numbers with the same decimal: %s\n", threeDecimals(arr));
    }

    public static boolean threeEvens(int[] arr) {
        int count = 0;
        for (int el : arr) {
            if (el % 2 == 0) count++;
            if (count > 3) return true;
        }
        return false;
    }
    public static boolean threeOdds(int[] arr) {
        int count = 0;
        for (int el : arr) {
            if (el % 2 == 1) count++;
            if (count > 3) return true;
        }
        return false;
    }

    public static boolean threeConsecutive(int[] arr) {
        if (arr == null || arr.length < 3) return false;

        for (int i = 0; i < arr.length - 3; i++)
            if(arr[i] == arr[i + 1] + 1 &&
                    arr[i] == arr[i + 2] + 2 &&
                    arr[i] == arr[i + 3] + 3) return true;
        return false;
    }

    public static boolean threeEndings(int[] arr) {
        int[] endings = new int[10];
        for (int el : arr) {
            if (++endings[el%10] > 3) return true;
        }
        return false;
    }

    public static boolean threeDecimals(int[] arr) {
        int[] decimals = new int[10];
        for (int el : arr) {
            if (++decimals[el/10] > 3) return true;
        }
        return false;
    }

}
