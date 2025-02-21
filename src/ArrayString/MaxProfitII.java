package ArrayString;

public class MaxProfitII {
    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int buy = prices[0];
        //[7, 1, 4, 2, 5, 4]
        //[1,2,3,4,5]
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buy) {
                buy = prices[i];
            } else if (prices[i] > buy) {
                maxProfit += prices[i] - buy;
                buy = prices[i];
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] nums = {7, 1, 4, 2, 5, 4};
        System.out.println(maxProfit(nums));
    }
}
