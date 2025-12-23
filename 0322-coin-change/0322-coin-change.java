class Solution {
    public int ans(int[] coins , int amount ,int idx , int[][] dp ) {
        if( amount == 0 ) return 0 ; 
        if ( idx < 0 || amount < 0 ) return Integer.MAX_VALUE  ; 

        if ( dp[idx][amount] != -1 ) return dp[idx][amount] ; 

        int skip = ans(coins , amount , idx-1 , dp ) ;
        int take = Integer.MAX_VALUE ;  
        int res = ans(coins , amount - coins[idx] , idx , dp ) ;
        if(res != Integer.MAX_VALUE ) {
            res = res + 1 ; 
        } 

        return dp[idx][amount] =  Math.min(res , skip ) ; 


    }
    public int coinChange(int[] coins, int amount) { 
        int[][] dp = new int[coins.length][amount+1] ; 
        for ( int i = 0  ; i < coins.length ; i++ ) {
            Arrays.fill(dp[i] , -1 ) ; 
        }
       int result = ans( coins , amount , coins.length -1 , dp   ) ; 
       return result == Integer.MAX_VALUE ? -1 : result ; 
    }
}

// My Approch 
// keep one count to coun the coin that i use 
// step 1 : Sort the array for gready approch 
// step 2 : Start from last idx 
// step 3 : if amount is >= coint of that idx 
//        -->> just reduce the amount to that idx coint keep at same idx 
//        -->> if amount is less than curr idx coin decrese the idx by 1 
// if idx < 0 then return -1
// return min coin use 