package problems.java;

import java.util.Arrays;
import java.util.stream.IntStream;

public class RotateArray189 {

    public void rotate(int[] nums, int k) {

        k = k % nums.length;

        rotateReverser(nums, 0, nums.length - 1);
        rotateReverser(nums, 0, k - 1);
        rotateReverser(nums, k, nums.length - 1);

        System.out.println(Arrays.toString(nums));

    }

    public void rotateReverser(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }


    public void rotateForLoop(int[] nums, int k) {

        for (int i = 0; i < k; i++) {
            int temp = nums[0];
            nums[0] = nums[nums.length - 1];
            for (int j = 1; j < nums.length; j++) {
                int temp2 = nums[j];
                nums[j] = temp;
                temp = temp2;
            }
        }

        System.out.println(Arrays.toString(nums));

    }

    public void rotateStream(int[] nums, int k) {

        nums = IntStream
                .concat(
                        Arrays.stream(nums, nums.length - k, nums.length),
                        Arrays.stream(nums, 0, nums.length - k))
                .toArray();

        System.out.println(Arrays.toString(nums));

    }

    public static void test() {


        RotateArray189 solution = new RotateArray189();

        int[] test = {-1};
        int[] test2 = {1, 2, 3, 4, 5, 6, 7};

        solution.rotate(test2, 9);


    }
}
