//Problem Link-https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/?envType=study-plan-v2&envId=top-interview-150
public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int num=0;
        int max=0;
        for(int i=1;i<n;i++){
            int p=prices[i]  -   prices[i-1];
            num= Math.max((p + num), 0);
            max=Math.max(num,max);
        }

        return max;
    }
}
