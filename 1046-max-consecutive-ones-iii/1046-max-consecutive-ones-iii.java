class Solution {
    public int longestOnes(int[] nums, int k) {
        int start = 0 , end = 0 , maxLen = 0 , zeroCount = 0 ;
        for ( int ele : nums ) if ( ele == 0 ) zeroCount++ ; 
        if ( zeroCount <=  k ) return nums.length ; 
        while ( end < nums.length ) {
            
            if ( nums[end] == 0 ) k-- ;
            while ( k < 0 ) {
                if(nums[start] == 0 ) k++ ;
                start++ ;
            }
             maxLen = Math.max ( maxLen , end - start  + 1 ) ;
            end++ ; 
        }
        return maxLen  ; 
    }
}