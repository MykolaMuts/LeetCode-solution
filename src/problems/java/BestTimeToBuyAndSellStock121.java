package problems.java;

public class BestTimeToBuyAndSellStock121 {

    public int maxProfit(int[] prices) {

        int maxProfit = 0;

        int butPrice = prices[0];

        int n = prices.length;

        for (int i = 1; i < n; i++) {
            if (butPrice > prices[i]) {
                butPrice = prices[i];
            }

            maxProfit = Math.max(maxProfit, prices[i] - butPrice);
        }

        return maxProfit;
    }

    public int maxProfitNotOptimized(int[] prices) {

        int maxProfit = 0;

        int n = prices.length;

        for (int left = 0; left < n; left++) {
            for (int right = left; right < n; right++) {
                if(prices[right] > prices[left]){
                    maxProfit = Math.max(maxProfit, prices[right] - prices[left]);
                }
            }
        }

        return maxProfit;
    }

    public static void test() {

        int[] nums2 = new int[]{7, 1, 5, 3, 6, 4};
        int[] nums = new int[]{0, 1, 1, 1, 1, 1, 2, 3, 3};

        BestTimeToBuyAndSellStock121 solution = new BestTimeToBuyAndSellStock121();

        System.out.println(solution.maxProfit(nums2));

    }
}
