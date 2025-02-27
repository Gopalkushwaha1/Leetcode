class Solution {
    public int minOperations(int[] nums) {
        int count = 0 ; 
        int increase = 0 ; 

        for ( int i = 1 ; i < nums.length ; i++ ) {
            if ( nums[i] <= nums[i-1]) {
                increase = nums[i-1] - nums[i] + 1 ; 
                count += increase ; 
                nums[i] = nums[i] + increase ; 
            }
            increase = 0 ; 
        }
        return count ; 
    }
}