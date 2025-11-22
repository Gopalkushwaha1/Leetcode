class Solution {
    public int minimumOperations(int[] nums) {
        for ( int i = 0 ; i < nums.length ; i++ ) {
            nums[i] = nums[i] % 3 ; 
        }
        int count = 0 ; 
        for ( int i = 0 ; i < nums.length ; i++ ) {
            if(nums[i] != 0 ) {
                count++ ; 
            }
        }
        return count ; 
    }
}