class Solution {
    public int ans(int[] nums , int curr , int prev , int[][] dp ) {
        if ( curr == nums.length ) {
            return 0 ; 
        }
        if( dp[curr][prev+1] != -1 ) return dp[curr][prev+1] ; 
        int skip = ans(nums , curr + 1 , prev , dp ) ; 
        int take = 0 ; 
        if( prev == -1 || nums[curr] > nums[prev]) {
            take = 1 + ans(nums , curr+1 , curr , dp ) ; 
        }

        return dp[curr][prev+1] =  Math.max(skip , take) ; 
    }
    public int lengthOfLIS(int[] nums) {
        int[][] dp = new int[nums.length][nums.length+1] ; 
        for ( int i = 0 ; i < nums.length ; i++ ) {
            Arrays.fill(dp[i] , -1) ;
        }
        return ans(nums , 0 , -1 , dp ) ; 
    }
}