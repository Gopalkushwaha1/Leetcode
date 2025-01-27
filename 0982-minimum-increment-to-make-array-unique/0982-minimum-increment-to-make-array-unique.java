class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums) ; 
        int  ans = 0 , move = 0 ;

        for ( int i = 1 ; i < nums.length ; i++ ) {
            
            if ( ans + nums[i-1] >= nums[i] ) {
                ans = (ans + nums[i-1] ) - nums[i] + 1 ; 
                move += ans ; 
            }
            else {
                ans = 0 ;
            }
        }
        return move ; 
    }
}