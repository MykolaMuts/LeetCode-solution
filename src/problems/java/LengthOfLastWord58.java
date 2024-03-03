package problems.java;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class LengthOfLastWord58 {
    public int lengthOfLastWord(String s)  {

        String[] reversed = s.trim().split(" ");

        Collections.reverse(Arrays.asList(reversed));

        return reversed[0].length();

    }

    public static void test(){

        String test = "   fly me   to   the moon  ";



        LengthOfLastWord58 lengthOfLastWord58 = new LengthOfLastWord58();

        int res = lengthOfLastWord58.lengthOfLastWord(test);



        System.out.println(res);

    }
}
