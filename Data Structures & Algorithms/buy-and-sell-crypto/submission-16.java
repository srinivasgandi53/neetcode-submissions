class Solution {
    public int maxProfit(int[] prices) {
     int maxProfit =0;
     int left =0;
     int right = 1;
     while( right < prices.length ) {
        int profit = prices[right]-prices[left];
        if (prices[right] < prices[left]){
           left = right;
        }  else {
            right ++;
     }
      maxProfit = Math.max(maxProfit,profit); 
    }
        return maxProfit;
    }
    
}
