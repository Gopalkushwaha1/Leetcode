class Solution {
    public int maxSubArray(int[] nums) {
        int sum = nums[0] ; 
        int localSum = 0 ; 

        for ( int ele : nums ) {
            localSum += ele ; 
            sum = Math.max(localSum , sum ) ; 
            if ( localSum < 0 ) localSum = 0 ; 
        }

        return sum ; 
    }
}