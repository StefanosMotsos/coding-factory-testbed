package gr.aueb.cf.cf9.review;

import java.util.Scanner;

public class Theater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[][] seats = new boolean[30][12];

        System.out.println("Please select a column: ");
        String input = sc.next();
        char col = input.charAt(0);
        while (col < 'A' || col > 'L') {
            System.out.println("There's no seat with that letter!");
            input = sc.next();
            col = input.charAt(0);
        }

        int row = 0;
        while (true) {
            System.out.println("Please select a row:");
            if (sc.hasNextInt()) {
                row = sc.nextInt();
                if (row >= 1 && row <= 30) break;
                else System.out.println("Row out of range, try again!");
            } else {
                System.out.println("Invalid input, try again!");
                sc.next();
            }
        }

        int colIndex = col - 'A';
        int rowIndex = row - 1;
        book(colIndex, rowIndex, seats);

    }

    public static void book(int col, int row, boolean[][] seats) {
        if (!seats[col][row]) {
            seats[col][row] = true;
            System.out.println("The seat is now yours!");
        } else System.out.println("Seat is already booked!");
    }

    public static void cancel(int col, int row, boolean[][] seats) {
        if (seats[col][row]) {
            seats[col][row] =  false;
            System.out.println("The booking is cancelled!");
        } else System.out.println("This seat is not reserved!");
    }
}
