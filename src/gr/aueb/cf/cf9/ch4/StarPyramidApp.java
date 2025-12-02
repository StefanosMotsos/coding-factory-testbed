package gr.aueb.cf.cf9.ch4;

/**
 * The program prints a pyramid made with stars.
 * The pyramid consists of 4 lines and every line adds
 * 2 more stars from the previous line. The 1st line is
 * 1 star, the 2nd line is 3 stars...
 */
public class StarPyramidApp {
    public static void main(String[] args) {
        int space = 0;
        int stars = 0;
        int numberOfRows = 4;

        for (int i = numberOfRows; i >= 1; i--) {
            space = numberOfRows - i;
            stars = (2 * i) - 1;

            for (int j = space; j >= 1; j--) {
                System.out.print(" ");
            }

            for (int k = stars; k >= 1; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
