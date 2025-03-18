class Solution {
    public int longestNiceSubarray(int[] nums) {
        int userBit = 0 ; 
        int maxLen = 1 ; 
        int start = 0 ; 

        for ( int check = 0 ; check < nums.length ; ++check ) {
            while ( (userBit & nums[check]) != 0 ) {
                userBit ^= nums[start] ; 
                start++ ; 
            }
            userBit |= nums[check] ; 

            maxLen = Math.max(maxLen , check - start + 1 ) ; 
        }

        return maxLen ; 
    }
}