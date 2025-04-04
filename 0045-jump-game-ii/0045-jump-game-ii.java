class Solution {
    public int jump(int[] nums) {
        int jump = 0 , maxJump = 0 , currJump = 0 ;
        if(nums.length == 1 ) return 0 ;  

        for ( int i = 0 ; i < nums.length ; i++ ) {
            maxJump = Math.max(maxJump  , i + nums[i]) ; 
            
            if ( currJump == i ) {
                jump++;
                currJump = maxJump ; 
                if(currJump >= nums.length - 1 ) break ; 
            }
        }

        return jump ; 
    }
}