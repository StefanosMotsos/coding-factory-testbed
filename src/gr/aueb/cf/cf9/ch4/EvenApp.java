package gr.aueb.cf.cf9.ch4;

/**
 * The program prints all even numbers from
 *  * 0 till 20. The result is printed 3 different
 *  times with 3 different ways. 1) while-do and if methods
 *  2) For and switch-case method. 3) For infinite loop with if and break.
 */
public class EvenApp {
    public static void main(String[] args) {
        // While-do and if methods
        int evenNumberWhileIf = 0;
        while (evenNumberWhileIf <= 20) {
            if (evenNumberWhileIf % 2 == 0) System.out.println(evenNumberWhileIf);
            evenNumberWhileIf++;
        }

        System.out.println();

        // For and switch-case methods
        for (int counterForSwitch = 0; counterForSwitch <= 20; counterForSwitch++) {
            switch (counterForSwitch % 2) {
                case 0 -> System.out.println(counterForSwitch);
                default -> { }
            }
        }

        System.out.println();

        // For and If methods
        int iterationsForIf = 0;
        for (;;) {
            if (iterationsForIf % 2 == 0) {
                System.out.println(iterationsForIf);
            }
            iterationsForIf++;
            if (iterationsForIf > 20) break;
        }
    }
}
