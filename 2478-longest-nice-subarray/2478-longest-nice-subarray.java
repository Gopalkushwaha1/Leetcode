class Solution {
    public int longestNiceSubarray(int[] nums) {
        int userBit = 0 , maxLen = 1 ,  start = 0 ; 

        for ( int check = 0 ; check < nums.length ; ++check ) {
            while ( (userBit & nums[check]) != 0 ) {
                userBit ^= nums[start++] ;  
            }
            userBit |= nums[check] ; 
            maxLen = Math.max(maxLen , check - start + 1 ) ; 
        }
        return maxLen ; 
    }
}