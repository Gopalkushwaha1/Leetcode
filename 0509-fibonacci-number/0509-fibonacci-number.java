class Solution {
    public int fib(int n) {
        if ( n == 0 ) return 0 ; 
        if ( n <= 2 ) return 1 ; 
        int[] dp = new int[n] ; 
        dp[0] = 1 ; 
        dp[1] = 1 ; 

        for ( int i = 2 ; i < n ; i++ ) {
            dp[i] = dp[i-2] + dp[i-1] ; 
        } 

        return dp[n-1] ; 
    }
}