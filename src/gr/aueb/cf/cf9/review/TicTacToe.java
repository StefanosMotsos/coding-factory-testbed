package gr.aueb.cf.cf9.review;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] board = new int[3][3];
        int currentPlayer = 1;

        while (true) {
            printBoard(board);
            System.out.println("Please enter a row and column: ");
            int row = sc.nextInt();
            int col = sc.nextInt();
            while (!playerInput(row, col, board)) {
                System.out.println("Wrong input!");
                row = sc.nextInt();
                col = sc.nextInt();
            }

            board[row][col] = currentPlayer;
            if (checkWinner(board, currentPlayer)) {
                printBoard(board);
                System.out.printf("Congratulations player %d won!", currentPlayer);
                break;
            }
            else if (isFull(board)) {
                printBoard(board);
                System.out.println("It is a tie!");
                break;
            }
            else {
                printBoard(board);
                System.out.println("Next turn!");
                currentPlayer = checkTurn(currentPlayer);
            }
        }
    }

    public static void printBoard(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 0) System.out.print("   ");
                else System.out.print(" " + board[i][j] + " ");

                if (j < 2) System.out.print("|");
            }
            System.out.println();
            if (i < 2) System.out.println("---+---+---");
        }
    }
    public static int checkTurn(int player) {
        return (player == 1) ? 2 : 1;
    }

    public static boolean playerInput(int row, int col, int[][] board) {
        if(row < 0 || row > 2 || col < 0 || col > 2 || board[row][col] != 0) return false;
        return true;
    }

    public static boolean checkWinner(int[][] board, int player) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player)
                return true;
        }
        for (int j = 0; j < 3; j++) {
            if (board[0][j] == player && board[1][j] == player && board[2][j] == player)
                return true;
        }
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player)
            return true;
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player)
            return true;

        return false;
    }

    public static boolean isFull(int[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == 0) return false;
            }
        }
        return true;
    }
}
