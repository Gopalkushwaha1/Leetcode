class Solution {
    public boolean isArraySpecial(int[] nums) {
        for ( int i = 1 ; i < nums.length ; i++ ) {
            // Check if alternate ele not special pair return false 
            if ( (nums[i] & 1 ) == (nums[i-1] & 1)) return false ; 
        }
        return true ; 
    }
}