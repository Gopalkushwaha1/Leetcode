class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums) ; 
        int count = 0 ; 
        int min = nums[0] ; 

        for ( int i = 0 ; i < nums.length ; i++ ) {
            if( nums[i] - min > k ) {
                count++ ; 
                min = nums[i] ; 
            }
        }
        return count+1 ; 
    }
}