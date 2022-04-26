class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0, min = Integer.MAX_VALUE, maxProfit = 0;
        
        for(int i=0; i<prices.length; i++){
            if(prices[i]<min){
                min = prices[i];
            }
            profit = prices[i] - min;
            if(profit>maxProfit){
                maxProfit = profit;
            }
        }
        return maxProfit;
    }
}
