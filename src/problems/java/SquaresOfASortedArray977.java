package problems.java;

import java.util.Arrays;

public class SquaresOfASortedArray977 {
    public int[] sortedSquares(int[] nums) {
//        for (int i = 0; i < nums.length; i++) {
//            int a = 1;
//            System.out.println(Math.abs(a));
//
//        }

        return Arrays.stream(nums).map(Math::abs).map(operand -> operand*operand).sorted().toArray();

//        for (int i : result) {
//            i = Math
//
//        }

    }

    public static void test(){
        SquaresOfASortedArray977 squaresOfASortedArray977 = new SquaresOfASortedArray977();

        int[] test = {2,7,11,15};

        int[] arr = squaresOfASortedArray977.sortedSquares(test);

        System.out.println(Arrays.toString(arr));

    }

}
