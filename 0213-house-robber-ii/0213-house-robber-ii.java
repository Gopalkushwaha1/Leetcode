class Solution {
    public int maxRob(int[] nums , int idx , int len , int[] dp  ) {
        if ( idx >= len  ) {
            return 0 ; 
        }
        if ( dp[idx] != -1 ) return dp[idx] ; 

        int skip = maxRob(nums , idx + 1 , len  , dp  ) ; 
        int take = nums[idx] + maxRob(nums , idx + 2 , len , dp  ) ; 

        return dp[idx] =  Math.max(skip , take ) ; 
    }
    public int rob(int[] nums) {
        int[] dp = new int[nums.length ] ; 
        Arrays.fill(dp , -1 ) ; 
        int zeroTake = maxRob(nums , 0 , nums.length - 1 , dp ) ; 
        Arrays.fill(dp , -1 ) ; 
        int zeroNotTake = maxRob(nums , 1 , nums.length , dp ) ; 

        return Math.max(zeroTake , zeroNotTake ) ;  
    }
}