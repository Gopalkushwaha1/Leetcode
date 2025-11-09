class Solution {
    public static int find( int[] nums , int idx , int[] dp ) {
        if ( idx >= nums.length ) return 0 ;
        if( dp[idx] != -1 ) return dp[idx] ;  

        int take = nums[idx] + find( nums , idx + 2 , dp ) ; 
        int skip = find( nums , idx + 1 , dp ) ; 

        return dp[idx] =  Math.max( take , skip ) ; 
    }
    public int rob(int[] nums) {
        int n = nums.length ; 

        int[] dp = new int[n] ; 
        Arrays.fill(dp , -1) ; 
        return find( nums , 0 , dp ) ; 
    }
}