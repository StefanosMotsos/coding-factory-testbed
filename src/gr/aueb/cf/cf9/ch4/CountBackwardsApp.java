package gr.aueb.cf.cf9.ch4;

/**
 * The program counts and prints numbers
 * backwards starting with 10 until 1. 10, 9, 8...
 */
public class CountBackwardsApp {
    public static void main(String[] args) {
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
