class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0] ; 
        int max = 0 ;
        int ans = 0 ; 

        for ( int i = 1 ; i < prices.length ; i++ ) {
            if ( prices[i] < min ) {
                min = prices[i] ; 
                max = 0 ; 
                continue ; 
            }
            if ( prices[i] > max ) {
                max = prices[i] ; 
                ans = Math.max(ans , max - min ) ; 
            }
        } 
        return ans ; 
    }
}