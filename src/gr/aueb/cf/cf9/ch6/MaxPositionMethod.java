package gr.aueb.cf.cf9.ch6;

/**
 * The program has an array and finds
 * the biggest int number inside the array
 * and returns the position of the number's index
 * with a method.
 */
public class MaxPositionMethod {
    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 10, 12};
        int maxPos = getMaxPosition(arr, 0, arr.length);
        int max = arr[maxPos];
        if (maxPos == -1) System.out.println("Wrong data");

        System.out.printf("The biggest number is: %d", max);
    }

    /**
     * Finds the biggest number of an array.
     * @param arr   The array.
     * @param low   1st index of the array.
     * @param high  Last index of the array.
     * @return      The index of the biggest number found.
     */
    public static int getMaxPosition(int[] arr, int low, int high) {
        if (low < 0 || high > arr.length || arr == null || low >= high) return -1;
        int max = arr[low];
        int maxPosition = low;
        for (int i = low + 1; i < high; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxPosition = i;
            }
        }
        return maxPosition;
    }
}
