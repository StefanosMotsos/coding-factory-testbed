package gr.aueb.cf.cf9.ch18Challenges;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SumTarget {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSums(nums, target)));
    }

    public static int[] twoSums(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {

            int key = target - nums[i];
            if (map.containsKey(key)) {
                return new int[] {map.get(key), i};
            }

            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No solution");
    }
}
