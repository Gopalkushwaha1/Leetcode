class Solution {
    public long rob(int[] nums, int[] colors) {
        if(nums.length == 1 ) return nums[0] ; 
        if(nums.length == 2 ) {
            if(colors[0] != colors[1]) return nums[0] + nums[1] ; 
            return Math.max(nums[0] , nums[1]) ; 
        }
        long[] dp = new long[nums.length] ; 

        dp[0] = nums[0] ; 
        if(colors[0] != colors[1]) {
            dp[1] = nums[0] + nums[1] ; 
        }
        else {
            dp[1] = nums[1] ; 
        }

        for ( int i = 2 ; i < nums.length ; i++ ) {
            if(colors[i] == colors[i-1]) {
                dp[i] = Math.max(nums[i] + dp[i-2] , dp[i-1]) ; 
            }
            else dp[i] = Math.max(nums[i] + dp[i-1] , nums[i] + dp[i-2]) ; 
        }
        return Math.max(dp[nums.length - 1 ],dp[nums.length - 2 ]) ; 
    }
}