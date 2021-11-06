class Solution {
    public int maxProfit(int[] prices) {
        
        int buy=prices[0];
        int sell=prices[0];
        int profit = 0;
        int maxProfit = 0;
        
        for(int i=1;i<=prices.length-1;i++)
        {
            if(prices[i]<buy)
            {
                buy=prices[i];
                sell=prices[i];
            }
            else if(prices[i]>sell)
            {
                sell=prices[i];
                profit=sell-buy;
                if(profit>maxProfit)
                {
                    maxProfit=profit;
                }
            
            }
        }
       
        return maxProfit;
    }
}