class Solution {
    public boolean isArraySpecial(int[] nums) {
        // Return true if only 1 ele 
        if ( nums.length == 1 ) return true ; 

        for ( int i = 1 ; i < nums.length ; i++ ) {
            // Check if alternate ele not special pair return false 
            if ( (nums[i] % 2 == 0 && nums[i-1] % 2 == 0) || ((nums[i] % 2 != 0 && nums[i-1] % 2 != 0)) ){
                return false ; 
            }
        }
        return true ; 
    }
}