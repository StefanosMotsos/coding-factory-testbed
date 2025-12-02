package gr.aueb.cf.cf9.review;

import java.util.Arrays;

/**
 * The program has an array, and calculates
 * which subarray has the biggest sum. Then the sum
 * is saved in globalMax. For example if array {3,5,-1}
 * then the subarray with the biggest sum is {3,5}
 */
public class ContiguousSumSubarray {

    static int[] globalMax = new int[1];

    public static void main(String[] args) {
        int[] arr = {2, -3, 5, 3, -1};
        int[] subArr = localMax(arr);

        System.out.println("The maximum subarray sum is: " + globalMax[0]);
        System.out.println("The subarray is: " + Arrays.toString(subArr));

    }

    /**
     * The method traverses the array and
     * finds a contiguous subarray with the biggest sum.
     * @param arr       The array.
     * @return          The subarray.
     */
    public static int[] localMax(int[] arr) {
        if (arr == null || arr.length == 0) return null;
        int localM = arr[0];
        int temp = 0;
        int start = 0;
        int end = 0;
        int maxSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (localM + arr[i] >= arr[i]) localM += arr[i];
            else {
                localM = arr[i];
                temp = i;
            }

            if (localM > maxSum) {
                maxSum = localM;
                start = temp;
                end = i;
            }
        }
        globalMax[0] = maxSum;
        return Arrays.copyOfRange(arr, start, end + 1);
    }
}
