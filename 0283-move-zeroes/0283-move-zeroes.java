class Solution {
    public void moveZeroes(int[] nums) {
      if ( nums.length <= 1 ) return ; 

      int i = 0 , j = 0 ; 

      while ( j < nums.length ) {
        if ( i == j && nums[i] != 0  && nums[j] != 0 ) {
            i++ ; j++ ; 
        }
        else if ( nums[j] == 0 ) {
            j++ ; 
        }
        else {
            nums[i] = nums[j] ; 
            nums[j] = 0 ; 
            i++ ; j++ ; 
        }
      }  
    }
}