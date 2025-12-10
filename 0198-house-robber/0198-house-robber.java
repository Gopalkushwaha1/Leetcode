class Solution {
    public int maxRob(int[] nums , int idx , int[] dp ) {
        if ( idx >= nums.length ) return 0 ; 

        if ( dp[idx] != -1 ) return dp[idx] ; 
        int skip = maxRob(nums , idx + 1 , dp ) ; 
        int take = nums[idx] + maxRob(nums , idx + 2 , dp  ) ; 

        return dp[idx] =  Math.max(skip , take ) ; 
    }
    public int rob(int[] nums) {
        int[] dp = new int[nums.length] ; 
        Arrays.fill(dp,-1) ; 
        return maxRob(nums , 0 , dp  ) ; 
    }
}