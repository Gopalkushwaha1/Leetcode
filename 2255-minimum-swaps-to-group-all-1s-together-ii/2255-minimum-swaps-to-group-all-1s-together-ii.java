class Solution {
    public int minSwaps(int[] nums) {
        int oneCount = 0  , start = 0 , i = 0  ;
        for ( int ele : nums ) {
            if ( ele == 1 ) oneCount++ ; 
        }

        int zeroCount = 0 , minSwap = 0 ; 

        for ( start = 0 ; start < oneCount ; start++ ) {
            if(nums[start] == 0 ) zeroCount++ ; 
        }
        minSwap = zeroCount ; 

        while ( start < nums.length + oneCount - 1 ) {
            if ( nums[start % nums.length] == 0 ) zeroCount++;
            if ( nums[i] == 0 ) zeroCount--;
            minSwap = Math.min ( minSwap , zeroCount) ; 
            start++ ; i++ ; 
        } 
        return minSwap ; 
    }
}