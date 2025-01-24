class Solution {
    public void reverse( int[] nums , int start , int end ) {
        while ( start < end ) {
            int temp = nums[start] ;
            nums[start] = nums[end] ;
            nums[end] = temp ;
            start++ ; end-- ;
        }
    }
    public void nextPermutation(int[] nums) {
        int j = nums.length - 2 ; 

        while ( j >= 0 && nums[j] >= nums[j+1]) j-- ; 

        if ( j == -1 ) {
            reverse( nums , 0 , nums.length - 1 ) ; 
            return ; 
        }

        int i = j ; 

        while ( i < nums.length -1 && nums[i+1] > nums[j] ) i++ ; 

         

        int temp = nums[i] ;
        nums[i] = nums[j] ;
        nums[j] = temp ; 

        reverse( nums , j + 1 , nums.length - 1 );
    }
}