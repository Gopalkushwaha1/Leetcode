class Solution {
    public boolean check(int[] nums) {
        int i = 0 ; 
        if ( nums[0] < nums[nums.length-1]) {
            for ( int j = 1 ; j < nums.length ; j++ ) {
                if ( nums[j] < nums[j-1]) return false ; 
            }
        }
        for ( i = 1 ; i < nums.length ; i++ ) {
            if ( nums[i] < nums[i-1]) break ; 
        }
        boolean check = false ;
        for ( int j = i+ 1  ; j < nums.length ; j++ ) {
            if ( nums[j] < nums[j-1]) return false ; 
        }
        return true ; 
    }
}