package gr.aueb.cf.cf9.ch6;

/**
 * The program finds the second-smallest
 * number of an array with a method.
 */
public class SecondMin {
    public static void main(String[] args) {
        int[] arr = {2, 6, 8, 7, 12};
        int min2 = getSecondMin(arr);
        System.out.printf("The 2nd smallest number is: %d", min2);
    }

    /**
     * The method to find the second-smallest.
     *
     * @param arr The array we search in.
     * @return The second-smallest.
     */
    public static int getSecondMin(int[] arr) {
        if (arr == null || arr.length < 2) {
            return Integer.MAX_VALUE;
        }
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min1) {
                min2 = min1;
                min1 = arr[i];
            } else if (arr[i] != min1 && arr[i] < min2) {
                min2 = arr[i];
            }
        }
        return min2;
    }
}
