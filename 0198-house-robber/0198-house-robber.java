class Solution {
    public int ans(int[] nums, int idx , int[] dp  ) {
        if( idx >= nums.length ) {
            return 0 ; 
        }
        if(dp[idx] != 0 ) return dp[idx] ;
        int take = nums[idx] + ans(nums , idx+2 , dp ) ; 
        int skip = ans(nums,idx+1 , dp ) ; 
         

        return dp[idx] = Math.max(skip , take) ; 
    }
    public int rob(int[] nums) {
        int[] dp = new int[nums.length] ; 
        return ans(nums , 0 , dp ) ; 
    }
}