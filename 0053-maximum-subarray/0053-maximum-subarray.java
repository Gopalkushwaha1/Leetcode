class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0] ; 
        int localmax = 0 ; 

        for ( int i = 0 ; i < nums.length ; i++ ) {
                localmax += nums[i] ; 
                if ( localmax > max ) {
                    max = localmax ; 
                }
                if ( localmax < 0 ) {
                    localmax = 0 ; 
                } 
        }
        return max ; 
    }
}