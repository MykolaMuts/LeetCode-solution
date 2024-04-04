package problems.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class SubarraysWithKDifferentIntegers992 {

    /**
     * More optimize solution, without creating array of good array
     * @param nums array
     * @param k number of unique numbers
     * @return all possible good array
     */
    public int subarraysWithKDistinct2(int[] nums, int k) {

        int ans = 0;

        ArrayList<Integer> goodArray = new ArrayList<Integer>();
        HashSet<Integer> numbers = new HashSet<>();


        for (int i = 0; i < nums.length; i++) {



            int j = i;

            while (j < nums.length) {

                numbers.add(nums[j]);

                if (numbers.size() > k) {
                    break;
                }

                goodArray.add(nums[j]);
                j++;

                if (goodArray.size() >= k && numbers.size() == k) {
                    System.out.println(goodArray);
                    ans++;
                }
            }
            numbers.clear();
            goodArray.clear();
        }


        return ans;
    }

    public static void test() {

        SubarraysWithKDifferentIntegers992 solution = new SubarraysWithKDifferentIntegers992();

        int[] test = {1, 2, 1, 2, 3};
        int[] test2 = {1,2,1,3,4};

        System.out.println(solution.subarraysWithKDistinct(test, 2));

    }


    /**
     * Solution correct, but can't pass test with large array(over 1000 entities),
     * in this solution a make an array list of element and return amount of all good arrays
     * @param nums array
     * @param k number of unique numbers
     * @return all possible good array
     */
    public int subarraysWithKDistinctNotCorrect(int[] nums, int k) {

        ArrayList<ArrayList> goodArrays = new ArrayList<>();


        for (int i = 0; i < nums.length; i++) {

            ArrayList<Integer> goodArray = new ArrayList<Integer>();
            HashSet<Integer> numbers = new HashSet<>();

            int j = i;

            while (j < nums.length) {

                numbers.add(nums[j]);

                if (numbers.size() > k) {
                    break;
                }

                goodArray.add(nums[j]);
                j++;

                if (goodArray.size() >= k && numbers.size() == k) {
                    System.out.println(goodArray);
                    goodArrays.add(goodArray);
                }
            }
            numbers.clear();
        }


        return goodArrays.size();
    }
}
