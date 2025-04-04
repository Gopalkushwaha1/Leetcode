class Solution {
    public boolean canJump(int[] nums) {
    if ( nums.length == 1 && nums[0] == 0 ) return true ; 
       int jumpCount = 0 , maxJump = 0 , currJump = 0 ; 

       for ( int i = 0 ; i < nums.length ; i++) {
        maxJump = Math.max(maxJump , i + nums[i]) ; 
        if(currJump == i && currJump == maxJump ) return false ; 
        if ( currJump == i ) {
            currJump = maxJump ; 
            if( currJump >= nums.length-1 ) return true ; 
        }
       } 

       return true ; 
    }
}