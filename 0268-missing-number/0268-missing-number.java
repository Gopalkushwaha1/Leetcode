class Solution {
    public int missingNumber(int[] nums) {
        boolean zero = false ; 
        for ( int i = 0 ; i < nums.length ; i++ ) {
            if ( nums[i] == 0 ) {
                zero = true ; 
                nums[i] = nums.length ; 
                break ; 
            }
        }
        if ( !zero) return 0 ; 

        for ( int i = 0 ; i < nums.length ; i++ ) {
            int idx = Math.abs(nums[i]) ; 
            if ( idx == nums.length ) {
                nums[0] *= -1 ; 
                continue ; 
            }
            nums[idx] *= -1 ; 
        }

        for ( int i = 1 ; i < nums.length ; i++ ) {
            if ( nums[i] >= 0 ) return i ; 
        }

        return nums.length ;  
    }
}