//Problem Link-https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/?envType=study-plan-v2&envId=top-interview-150

public class BestTimeToBuyAndSellStockII {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int max=0;
        for(int i=1;i<n;i++){
            int p=prices[i]-prices[i-1];
            int val=p+max;
            max=Math.max(max,val);
        }
        return max;
    }
}
