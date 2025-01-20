class Solution {
    public int minSwaps(int[] nums) {
       int countOne = 0 ;        // Total count of one for making window  
       int countZero = 0 ;       // count number of zero in window (for update minimum swap)
       int start = 0 ; 
       int end = 0 ; 
       int minSwap = 0 ; 

       // counting one 
       for ( int ele : nums ) {
        if ( ele == 1) countOne++ ; 
       }
       end = countOne ; 
        
       // count zero in window 
       for ( int i = 0 ; i < end ; i++ ) {
        if(nums[i] == 0 ) countZero++ ; 
       }
       minSwap = countZero ; 
       
       // Applying sliding window 
       for ( start = 0 ; start < nums.length ; start++ ) {
        if(nums[(end)%nums.length] == 0 ){
             countZero++;
        }
        if ( nums[start] == 0 ) {
            countZero--;
        }
        minSwap = Math.min(minSwap , countZero);
        end++;

       }
       return minSwap ; 
    }
}