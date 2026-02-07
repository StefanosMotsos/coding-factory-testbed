package gr.aueb.cf.cf9.ch18Challenges;

import java.util.Arrays;

public class StudentComparisonPoints {
    public static void main(String[] args) {
        int[] alice = {7, 10, 6};
        int[] bob = {8, 6, 7};
        System.out.println(Arrays.toString(compareScore(alice, bob)));
    }

    public static int[] compareScore(int[]arr1, int[]arr2) {
        int[] points = new int[2];

        for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] > arr2[i]) points[0]++;
                else if (arr1[i] < arr2[i]) points[1]++;
        }
        return points;
    }
}
