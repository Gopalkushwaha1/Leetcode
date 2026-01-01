class Solution {
    public int maxProfit(int[] prices) {
        int max = prices[0] ; 
        int maxProfit = 0 ; 

        for ( int i = 1 ; i < prices.length ; i++ ) {
            if(max > prices[i]) {
                max = prices[i] ; 
                continue ; 
            }
            maxProfit = Math.max(maxProfit , prices[i]-max) ; 
        }

        return maxProfit ; 
    }
}