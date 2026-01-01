class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0 ; 
        int j = 0 ; 

        while ( j < nums.length ) {
            if( nums[j] != 0 ) {
                nums[i] = nums[j] ; 
                i++ ; 
            }
            j++ ; 
        }

        for ( int k = i ; k < nums.length ; k++ ) {
            nums[k] = 0 ; 
        }
    }
}