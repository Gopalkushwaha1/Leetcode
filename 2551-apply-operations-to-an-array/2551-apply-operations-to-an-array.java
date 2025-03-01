class Solution {
    public int[] applyOperations(int[] nums) {
        for ( int i = 0 ; i <= nums.length - 2 ; i++ ) {
            if ( nums[i] == nums[i+1 ]) {
                nums[i] = 2*nums[i] ; 
                nums[i+1] = 0 ; 
            }
        }
        int idx = 0 ; 

        for ( int i = 0 ; i < nums.length ; i++ ) {
            if ( nums[i] != 0 ) {
                int temp = nums[i] ; 
                nums[i] = nums[idx] ; 
                nums[idx] = temp;
                idx++;
            }
        } 
        return nums ; 
    }
}