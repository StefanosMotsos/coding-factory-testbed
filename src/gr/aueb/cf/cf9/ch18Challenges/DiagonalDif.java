package gr.aueb.cf.cf9.ch18Challenges;

public class DiagonalDif {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3},
                       {4, 5, 6},
                       {7, 8, 9}};
        System.out.println(absoluteDif(arr));
    }

    public static int absoluteDif(int[][] arr) {
        int diagonal1 = 0;
        int diagonal2 = 0;
        int diff = 0;
        for (int i = 0; i < arr.length; i++) {
            diagonal1 = arr[i][i];
            diagonal2 = arr[i][arr.length - i - 1];
        }

        diff = Math.abs(diagonal1 - diagonal2);
        return diff;
    }
}
