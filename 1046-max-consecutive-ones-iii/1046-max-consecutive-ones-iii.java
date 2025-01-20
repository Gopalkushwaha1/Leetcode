class Solution {
    public int longestOnes(int[] nums, int k) {
        int start = 0 , end = 0 , maxLen = 0 , zeroCount = 0 ;  // define prerequisite varibale 
        while ( end < nums.length ) {                   // making sliding window 
            
            if ( nums[end] == 0 ) k-- ;          // checking if ele is 0 reduce the window 
            while ( k < 0 ) {
                if(nums[start] == 0 ) k++ ;          // slink the window
                start++ ;
            }
            maxLen = Math.max ( maxLen , end - start  + 1 ) ;        // calculating total len 
            end++ ;                                                // increase the window 
        }
        return maxLen  ; // return ans 
    }
}