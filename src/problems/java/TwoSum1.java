package problems.java;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class TwoSum1 {
    public int[] twoSum(int[] nums, int target) {
        int[] twoSum = new int[2];
        for (int i = 0; i < nums.length; i++) {
            final int index = i;
            int oneSum = nums[index];
            int lookingSum = target - oneSum;
            OptionalInt nextSum = IntStream.range(0, nums.length)
                    .filter(value -> value != index && nums[value] == lookingSum)
                    .findFirst();

            if(nextSum.isPresent()){
                twoSum[0] = i;
                twoSum[1] = nextSum.getAsInt();
            }

        }
        return twoSum;
    }

    public static void test(){
        TwoSum1 twoSum1 = new TwoSum1();

        int[] test = {2,7,11,15};

        int[] arr = twoSum1.twoSum(test,9);

        System.out.println(arr[0]);
        System.out.println(arr[1]);

    }
}