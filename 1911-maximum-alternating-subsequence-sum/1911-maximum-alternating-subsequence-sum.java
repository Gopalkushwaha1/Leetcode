class Solution {
    public long ans(int[] nums , int idx ,  int count , long[][] dp ) {
        if(idx == nums.length ) return 0*1L ; 
        if(dp[idx][count%2] != -1 ) return dp[idx][count%2]  ; 

        long skip = ans(nums , idx + 1 , count , dp ) ; 
        long take = 0*1L ; 
        if(count % 2 != 0 ) {
            take =  ans(nums , idx+1 , count + 1 , dp  ) - nums[idx]  ; 
        }
        else{
            take = nums[idx] + ans(nums , idx + 1 ,  count+1  , dp ) ; 
        }

        return dp[idx][count%2] =  Math.max(take , skip ) ; 
    }
    public long maxAlternatingSum(int[] nums) {
        long[][] dp = new long[nums.length][2] ; 
        for ( int i = 0 ; i < dp.length ; i++ ) {
            Arrays.fill(dp[i],-1*1L) ; 
        }
        return ans(nums,0,0 , dp ) ;
    }
}