class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0] ; 
        int localSum = nums[0] ; 

        for ( int i = 1 ; i < nums.length ; i++  ) {
            int ele = nums[i] ;
            if ( localSum < 0 ) localSum = 0 ; 
            localSum += ele ; 
            if ( maxSum < localSum ) {
                maxSum = localSum ; 
            }
            
        }
        return maxSum ; 
    }
}