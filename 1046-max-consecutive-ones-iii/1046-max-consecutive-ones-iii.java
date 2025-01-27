class Solution {
    public int longestOnes(int[] nums, int k) {
        int i = 0 , j = 0 , len = 0 , maxLen = 0 ;

        while ( j < nums.length ) {

            if ( nums[ j ] == 0 ) k-- ; 
            while ( k < 0 ) {
                if ( nums[i] == 0 ) {
                    k++ ; 
                }
                i++ ; 
            }
 
                maxLen = Math.max ( maxLen , j - i + 1 ) ; 
                j++ ; 
          
            
        }
        return maxLen ; 
    }
}