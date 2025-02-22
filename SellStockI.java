/*
121. You are given an array prices where prices[i] is the price of a given stock on the ith day.
You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
*/

public class SellStockI {
        public int maxProfit(int[] prices) {
            int buy_price=Integer.MAX_VALUE;
            int max_profit=0;
    
            for(int i=0;i<prices.length;i++)
            {
                if(buy_price < prices[i]) //profit
                {
                    int profit=prices[i]-buy_price;   //today's profit
                    max_profit=Math.max(profit,max_profit);
                }
                else
                {
                    buy_price=prices[i];   //no profit
                }
            }
            return max_profit;
            
        }
}
