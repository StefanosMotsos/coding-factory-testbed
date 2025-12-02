package gr.aueb.cf.cf9.ch5;
import java.util.Scanner;

/**
 * The user enters a number which
 * they think is a prime number and the program
 * calculates if it is a prime number through
 * a method.
 */
public class PrimeMethod {
    /**
     * Checks for prime numbers.
     * @param number the number we check if it's a prime
     * @return true if the number is prime, false otherwise
     */
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        if (number == 2) return true;
        if (number % 2 == 0) return false;
        for(int i = 3; i <= number / 2; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;

        System.out.println("Please enter a number you think is a prime number: ");
        number = scanner.nextInt();
        System.out.println("Is the number a prime number? " + isPrime(number));
    }
}
