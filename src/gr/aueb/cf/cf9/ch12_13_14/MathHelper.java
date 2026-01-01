package gr.aueb.cf.cf9.ch12_13_14;

public class MathHelper {
    private MathHelper() {}

    public static int getMax(int[] arr) {
        if (arr == null || arr.length == 0) return 0;
        int max = Integer.MIN_VALUE;
        for (int value : arr) {
            if (value > max) max = value;
        }
        return max;
    }

    public static int getMin(int[] arr) {
        if (arr == null || arr.length == 0) return 0;
        int min = Integer.MAX_VALUE;
        for (int value : arr) {
            if (value < min) min = value;
        }
        return min;
    }

    private static int getSum(int[] arr) {
        if (arr == null || arr.length == 0) return 0;
        int sum = 0;
        for (int value : arr) {
            sum += value;
        }
        return sum;
    }

    public static int getAvg(int[] arr) {
        if (arr == null || arr.length == 0) return 0;
        return getSum(arr) / arr.length;
    }
}
