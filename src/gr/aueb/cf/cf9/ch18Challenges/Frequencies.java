package gr.aueb.cf.cf9.ch18Challenges;

public class Frequencies {
    public static void main(String[] args) {
        int[] arr = {1, -2, 0, 3, 0, -4};
        printPercentages(arr);
    }

    public static void printPercentages(int[] arr) {
        int posCount = 0;
        int negCount = 0;
        int zeroCount = 0;

        if (arr.length == 0) {
            System.out.println("Array is empty!");
            return;
        }
        for (int i : arr) {
            if (i > 0) posCount++;
            else if (i < 0) negCount++;
            else zeroCount++;
        }

        System.out.printf("Positive amount: %.6f\n",  posCount / (double) arr.length);
        System.out.printf("Negative amount: %.6f\n",  negCount / (double) arr.length);
        System.out.printf("Zeroes: %.6f\n",  zeroCount / (double) arr.length);
    }
}
