package src.main.java.org.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Code1 {
    public static void main(String[] args) {
        int[] ns = {1, 3, 5, 6, 9};
        int[] ints = twoSum(ns, 4);

        assert Objects.requireNonNull(ints)[0] == 0;
        assert ints[1] == 1;
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> result = new HashMap<>();
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            if (result.containsKey(target - nums[i])) {
                return new int[]{result.get(target - nums[i]), i};
            }
            result.put(nums[i], i);
        }
        return null;
    }
}
