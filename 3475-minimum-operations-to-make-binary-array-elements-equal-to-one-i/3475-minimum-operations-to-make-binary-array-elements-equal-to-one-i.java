class Solution {
    public int minOperations(int[] nums) {
         int count = 0 , j = 0 ; 

         while ( j < nums.length - 2  ) {
            if ( nums[j] == 0  ) {
                count++; 
                for ( int i = j ; i <= j + 2 ; i++ ) {
                    if ( i >= nums.length ) break ; 
                    if(nums[i] == 0 ) {
                        nums[i] = 1 ; 
                    }
                    else {
                        nums[i] = 0 ; 
                    }
                }
            }
            j++ ; 
         }
         if ( nums[nums.length-1] == 0 || nums[nums.length-2] == 0 ) return -1 ; 
         return count ; 
    }
}