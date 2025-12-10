class Solution {
    public int minCost(int[] cost , int idx , int[] dp ) {
        if ( idx < 2 ) return cost[idx]  ; 
        if ( dp[idx] != -1 ) return dp[idx] ; 

        return dp[idx] =  cost[idx] + Math.min(minCost(cost , idx -1, dp ) , minCost(cost , idx - 2 , dp )); 
    }
    public int minCostClimbingStairs(int[] cost) {
        int len = cost.length ; 
        int[] dp = new int[len] ; 
        Arrays.fill(dp , -1) ; 
        return Math.min(minCost(cost , len-1 , dp ) , minCost(cost , len-2 , dp )) ; 
    }
}