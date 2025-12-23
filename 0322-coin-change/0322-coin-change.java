class Solution {
    public long coinSol(int i , int[] c, int a , long[][] dp) {
       if(i == c.length){
         return (a != 0) ? Integer.MAX_VALUE : 0;
       } 
       if(dp[i][a] != -1)return dp[i][a] ;
       long skip = coinSol(i+1,c,a,dp);
       if(a - c[i] < 0 )return dp[i][a] = skip;
       long take = 1 + coinSol(i , c, a-c[i] , dp);
       return dp[i][a] = Math.min(skip,take);
    }
    public int coinChange(int[] coins, int amount) {
        long[][] dp = new long[coins.length][amount+1];
        for(int i = 0 ;  i <coins.length ; i++){
            Arrays.fill(dp[i],-1);
        }
        int ans = (int)coinSol(0,coins,amount,dp);
        return (ans != Integer.MAX_VALUE) ? ans : -1 ; 
    }
}