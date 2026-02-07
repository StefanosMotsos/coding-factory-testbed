package gr.aueb.cf.cf9.ch18Challenges;

import java.util.Arrays;

public class Scores {
    public static void main(String[] args) {
        int[] scores = {10, 5, 20, 20, 4, 5, 2, 25, 1};
        System.out.println(Arrays.toString(countRecords(scores)));
    }

    public static int[] countRecords(int[] scores) {
        int[] recordsCount = new int[2];
        int max = scores[0];
        int min = scores[0];

        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < min) {
                min = scores[i];
                recordsCount[1]++;
            } else if (scores[i] > max) {
                max = scores[i];
                recordsCount[0]++;
            }
        }
        return recordsCount;
    }
}
