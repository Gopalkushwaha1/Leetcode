class Solution {
    public int ans(int n , int[] dp ) {
        if ( n <= 3 ) return n ;
        if ( dp[n] != -1 ) return dp[n] ; 
        return dp[n] =  ans(n-1 , dp ) + ans(n-2 , dp ) ; 
    }
    public int climbStairs(int n) { 
        if ( n <= 3 ) return n ;
        int[] dp = new int[n+1] ; 
        dp[0] = 1 ; 
        dp[1] = 1 ; 
        dp[2] = 1 ; 
        Arrays.fill(dp , -1) ; 
        ans(n , dp ) ; 
        return dp[n] ; 
    }
}