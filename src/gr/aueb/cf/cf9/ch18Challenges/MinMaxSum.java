package gr.aueb.cf.cf9.ch18Challenges;

import java.util.Arrays;

public class MinMaxSum {
    public static void main(String[] args) {
        int[] arr = {3, 5, 4, 10, 1};
        sum4From5(arr);
    }

    public static void sum4From5(int[] arr) {
        int min = Arrays.stream(arr).min().orElse(0);
        int max = Arrays.stream(arr).max().orElse(0);
        int sum = Arrays.stream(arr).sum();
        System.out.println("MinSum: " + (sum - max));
        System.out.println("MaxSum: " + (sum - min));
    }
}
