package problems.java;

public class ReversedInteger7 {

    static int reverse = 0;

    public static int reverse(int value) {
        if (value == 0) {
            return value;
        } else {
            reverse = 10*reverse + value % 10;
            reverse(value/10);
            return reverse;
        }
    }


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


    public static int pow(int value, int powValue) {
        if (powValue == 1) {
            return value;
        } else {
            return value * pow(value, powValue - 1);
        }
    }

//    public static int reverseLoop(int x) {
//        int degree = (int) Math.log10(x);
//        System.out.println(degree);
//        int y = 0;
//        for (int i = degree; i >= 0; i--) {
//            int pow = (int) Math.pow(10, i);
//            System.out.println("y + " + pow);
//            y += pow;
//        }
//        return y;
//
//    }

    public static void test(){
        int rev = reverseLog(-132423);
        System.out.println(rev);
    }
}
