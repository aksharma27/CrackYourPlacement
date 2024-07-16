package July;

import java.util.Arrays;

public class BuySellStock2 {
    public static void main(String[] args) {
        //    DAY - 3

        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
    static int maxProfit(int[] prices) {
        int n = prices.length;
        // int cur = prices[0];
        int ans = 0;

        for (int i = 1; i < n; i++) {
            if (prices[i] > prices[i - 1]) ans += prices[i] - prices[i - 1];
        }
        return ans;
    }
}
