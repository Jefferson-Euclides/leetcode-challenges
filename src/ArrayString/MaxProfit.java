package ArrayString;

public class MaxProfit {
    public static int maxProfit(int[] prices) {
        int buy = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buy) {
                buy = prices[i];
            } else if (prices[i] - buy > maxProfit){
                maxProfit = prices[i] - buy;
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] nums = {7, 1, 1, 4, 1, 2, 1, 5, 4};
        System.out.println(maxProfit(nums));
    }
}
