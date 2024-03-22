package problems.java;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class MajorityElement169 {

    public int majorityElement(int[] nums) {

        double halfLength = (double) nums.length / 2;

        Map<Integer, Integer> appears = new HashMap<>();

        for (int num : nums) {
            if (appears.containsKey(num)) {
                appears.put(num, appears.get(num) + 1);
                if (appears.get(num) > halfLength) {
                    return num;
                }
            } else {
                appears.put(num, 1);
            }
        }

        return nums[0];

    }


    public static void test() {

        int[] nums2 = new int[]{3, 2, 3};
        int[] nums = new int[]{0, 1, 1, 1, 1, 1, 2, 3, 3};

        MajorityElement169 solution = new MajorityElement169();

        System.out.println(solution.majorityElement(nums2));

    }
}
