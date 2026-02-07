package gr.aueb.cf.cf9.ch18Challenges;

public class Staircase {
    public static void main(String[] args) {
        printStair(10);
    }

    public static void printStair(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
