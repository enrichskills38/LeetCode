class Solution {
  public int maxProfit(int[] prices) {

        int minPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        int profit=0;
        for (int i = 0; i < prices.length; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            maxProfit=prices[i]-minPrice;
            profit=Math.max(profit,maxProfit);
        }

        return profit;
    }
}