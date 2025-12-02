package gr.aueb.cf.cf9.ch4;

/**
 * The program calculates and prints the sum
 * of all integer numbers from 1 till 50. There's
 * also a second implementation made with "for loop" for
 * exercise purposes.
 */
public class Sum50App {
    public static void main(String[] args) {
        int sum = 0;
        int number = 1;
        while (number <= 50) {
            sum += number;
            number++;
        }
        System.out.println("Sum= " + sum);

        System.out.println();
        int sum2 = 0;
        for (int counter = 1; counter <= 50; counter++) {
            sum2 += counter;
        }
        System.out.println("For example Sum: " + sum2);
    }
}
