class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0 ; 
        int count = 0 ; 
        int i = 0 ; 

        while ( i < nums.length ) {
            if( nums[i] == 1 ) {
                count++ ; 
                maxCount = Math.max(maxCount , count ) ; 
            }
            else {
                count = 0 ; 
            }
            i++ ; 
        }
        return maxCount ; 
    }
}