package problems.java;

public class RemoveDuplicatesFromSortedArrayII80 {

    public int removeDuplicates(int[] nums) {

        if (nums.length <= 2) {
            return nums.length;
        }

        int k = 2;

        for (int i = 2; i < nums.length; i++) {
            if(nums[i] != nums[k - 2]){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public int removeDuplicatesAnyNumber(int[] nums, int number) {

        if (nums.length <= number) {
            return nums.length;
        }

        int k = number;

        for (int i = number; i < nums.length; i++) {
            if(nums[i] != nums[k - number]){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void test() {

        int[] nums2 = new int[]{1, 1, 1, 2, 2, 3};
        int[] nums = new int[]{0, 1, 1, 1, 1, 1, 2, 3, 3};

        RemoveDuplicatesFromSortedArrayII80 solution = new RemoveDuplicatesFromSortedArrayII80();

        System.out.println(solution.removeDuplicates(nums));

    }
}
