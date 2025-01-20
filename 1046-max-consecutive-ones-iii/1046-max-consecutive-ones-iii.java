class Solution {
    public int longestOnes(int[] nums, int k) {
        int start = 0 , end = 0 , maxLen = 0 ;  // define prereqistie
        while ( end < nums.length ) {           // itrate each element 
            if ( nums[end] == 0 ) k-- ;         // if last ele is 0 slink the window
            if( k < 0 ){                        // checking at most k 0 condition
                if(nums[start] == 0 ) k++ ;     // slink the window
                start++;                        // update start
            }
            maxLen = Math.max(maxLen , end - start + 1 ) ;  // Geting max len 
            end++ ;                            // increase the window
        }
        return maxLen ;      // return ans 
    }
}