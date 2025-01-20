class Solution {
    public int minSwaps(int[] nums) {
        int countOne = 0 , countZero = 0 , minSwap = Integer.MAX_VALUE ; 
        
        for ( int ele : nums ) if ( ele == 1 ) countOne++ ; // counting total occurence of 1 
        for ( int i = 0 ; i < countOne ; i++ ) if ( nums[i] == 0 ) countZero++ ; // count 0 in window

        minSwap = countZero ; 
        // Sliding window to count minSwap
        for ( int start = 0 , end = countOne ; start < nums.length ; start++ , end++ ) {
            if ( nums[(end) % nums.length] == 0 ) countZero++ ;  // increase window
            if ( nums[start] == 0 ) countZero--;                 // slink window
            minSwap = Math.min(minSwap , countZero ) ;           // calculate min swap
        }
        return minSwap ; // return min swap
    }
}