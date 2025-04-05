class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0] , max = prices[0] , ans = 0 ; 

        for ( int i = 1 ; i < prices.length ; i++ ) {
            if(prices[i] <= min || prices[i] <= max ) {
                ans += max - min ; 
                min = max = prices[i] ; 
            }
            else if ( prices[i] > max ) {
                max = prices[i] ; 
            }
        }
        ans += max - min ; 
        return ans ; 
    }
}