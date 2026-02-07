package gr.aueb.cf.cf9.ch18Challenges;

import java.util.Arrays;

public class SumArray {
    public static void main(String[] args) {
        int[] arr = {3, 7, 1, 9};
        System.out.println(sumOfArray(arr));
    }

    public static int sumOfArray(int[] arr) { return Arrays.stream(arr).sum(); }
}
