package problems.java;

import java.util.Arrays;
import java.util.stream.IntStream;

public class RemoveDuplicatesFromSortedArray26 {


    public int removeDuplicates(int[] nums) {

        int k = 1;

        for (int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[i-1]){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;

    }

    public int removeDuplicatesNotCorrect(int[] nums) {

        System.out.println(Arrays.toString(nums));

        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                if (nums[i] == nums[j]) {
                    nums[i + 1] = nums[j + 1];
                }
                if (nums[i] != nums[i+1]) {
                    continue;
                }   else {
                    k++;
                }
            }
        }
        if(nums[nums.length-1] == nums[nums.length - 2]){
            k++;
        }

        System.out.println(Arrays.toString(nums));

        return k;
    }

    public int removeDuplicatesWithSecondArray(int[] nums) {

        int[] res = new int[nums.length];
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                res[i] = nums[i];
                k++;
            } else if (nums[i - 1] != nums[i]) {
                res[k] = nums[i];
                k++;
            }

        }

        System.out.println(Arrays.toString(res));

        return k;
    }

    public int removeDuplicatesStream(int[] nums) {

        int[] res = IntStream.range(0, nums.length)
                .filter(i -> !contains(nums, i))
                .map(i -> nums[i])
                .toArray();

        System.out.println(Arrays.toString(res));

        return res.length;
    }

    private static boolean contains(int[] nums, int value) {
        for (int num : nums) {
            if (num == value) {
                return false;
            }
        }
        return true;
    }


    public static void test() {

        int[] nums2 = new int[]{1, 4, 5, 5, 5, 6, 6, 7, 9, 10, 11, 12, 14, 14};
        int[] nums = new int[]{1, 1, 2};

        RemoveDuplicatesFromSortedArray26 removeDuplicatesFromSortedArray26 = new RemoveDuplicatesFromSortedArray26();

        System.out.println(removeDuplicatesFromSortedArray26.removeDuplicates(nums2));

    }
}
