package problems.java;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ReversedInteger7 {

    public int reverse(int x) {

        double res = reverseHelper(x,0);

        if(res>(double)(Integer.MAX_VALUE) || res<(double)(Integer.MIN_VALUE)){
            return 0;
        }
        return (int) res;
    }

    /**
     * That's a recursion solution that use helper function
     * @param x number that need to be reverse
     * @return reversed int
     */

    public double reverseHelper(int x, double reversed) {
        if (x == 0) {
            return reversed;

        } else {
            return reverseHelper(x / 10, 10 * reversed + x % 10);
        }
    }

    static int reverse = 0;

    /**
     /**
     * That's a recursion solution that use static value
     * @param x number that need to be reverse
     * @return reversed int
     */

    public int reverseStatic(int x) {
        if (x == 0) {
            return x;
        } else {
            reverse = 10 * reverse + x % 10;
            reverseStatic(x/10);
            return reverse;
        }
    }


    /**
     * Solution that use array of int that will be reversed and convert back to int
     * @param x number that need to be reverse
     * @return reversed int
     */
    public int reverseArray(int x) {

        int belowZero = 1;

        if(x <= 0){
            belowZero = -1;
            x *= belowZero;
        }

        int length = (int) Math.log10(x) + 1;

        int[] array = new int[length];

        int rev = 0;

        for (int i = 0; i < length; i++) {
            rev += (rev + (x % 10)) * 10;
            x /= 10;
        }

        return rev * belowZero;

    }

    /**
     * Solution that use log to reverse int
     * @param x number that need to be reverse
     * @return reversed int
     */
    public static int reverseLog(int x) {
        int reverse = 0;
        int belowZero = 1;
        if(x < 0){
            belowZero = -1;
            x *= belowZero;
        }
        int log = (int) Math.log10(x);
        if (x > -10 && x < 10) {
            return x;
        } else {
            reverse += x % 10;
            x = x/10;
            return belowZero * (int) (Math.pow(10, log)*reverse+ reverseLog(x));
        }
    }

    /**
     * Solution that use loop to reverse int
     * @param x number that need to be reverse
     * @return reversed int
     */
    public static int reverseLoop(int x) {
        int degree = (int) Math.log10(x);
        System.out.println(degree);
        int y = 0;
        for (int i = degree; i >= 0; i--) {
            int pow = (int) Math.pow(10, i);
            System.out.println("y + " + pow);
            y += pow;
        }
        return y;
    }

    public static void test(){


        ReversedInteger7 reversedInteger7 = new ReversedInteger7();

        int rev = reversedInteger7.reverse(1534236469);
        System.out.println(rev);
    }
}
