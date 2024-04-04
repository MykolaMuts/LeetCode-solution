package problems.java;

public class MaximumNestingDepthOfTheParentheses1614 {

    public int maxDepth(String s) {

        int maxDepth = 0;
        int depth = 0;

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '('){
                depth += 1;
            } else if (s.charAt(i) == ')') {
                depth -=1;
            }
            if(depth > maxDepth){
                maxDepth = depth;
            }

        }

        return maxDepth;

    }

    public static void test(){


        MaximumNestingDepthOfTheParentheses1614 solution = new MaximumNestingDepthOfTheParentheses1614();


        System.out.println(solution.maxDepth("(1)+((2))+(((3)))"));

    }
}
