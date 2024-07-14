package July;
//DAY 1
public class BuySellStock {
    public static void main(String[] args) {
        int[] stock = {7,1,5,3,6,4};
        System.out.println(maxProfit(stock));
    }
    static int maxProfit(int[] prices) {
        int l = 0, r = 0;
        int maxProfit = 0;
        while (r < prices.length) {
            maxProfit = Math.max(prices[r] - prices[l], maxProfit);
            if (prices[r] < prices[l]) l = r;
            r++;
        }
        return maxProfit;
    }
}
