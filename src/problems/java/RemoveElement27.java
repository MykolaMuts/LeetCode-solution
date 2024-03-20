package problems.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class RemoveElement27 {

    public int removeElementPass(int[] nums, int val) {

        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i++] = nums[j];
            }
        }

        return i;
    }


    public int removeElement(int[] nums, int val) {

        int[] expectedNums = IntStream.of(nums)
                .filter(value -> value != val)
                .toArray();

        System.out.println(Arrays.toString(expectedNums));

        return expectedNums.length;
    }

    /**
     * Slower implementation where I first create list of indexes
     * where this element occurred, and then remove it from list
     * @param nums number array
     * @param val element that need to be removed
     * @return how many times this element occurred
     */
    public int removeElementSlow(int[] nums, int val) {

        List<Integer> unexpectedNums = new ArrayList<>();
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val){
                unexpectedNums.add(i);
                k++;
            }
        }

        // Use IntStream to filter out elements not in 'unexpectedNums' and collect them into a new array
        int[] expectedNums = IntStream.range(0, nums.length)
                .filter(i -> !contains(unexpectedNums, i))
                .map(i -> nums[i])
                .toArray();

        System.out.println(Arrays.toString(expectedNums));

        return k;
    }

    private boolean contains(List<Integer> arr, int num) {
        for (int value : arr) {
            if (value == num) {
                return true;
            }
        }
        return false;
    }

    public static void test(){

        int[] nums = new int[] {3,2,2,3};
        int val = 3;

        RemoveElement27 removeElement27 = new RemoveElement27();


        System.out.println(removeElement27.removeElement(nums, val));

    }
}
