class Solution {

    //Swap function 
    public void swap ( int[] nums  , int start , int end ) {
        int temp = nums[start] ; 
        nums[start] = nums[end] ; 
        nums[end] = temp ; 
    }

    // reverse function 
    public void reverse( int[] nums , int start , int end ) {

        while ( start < end ) {
            swap ( nums , start , end ) ;
            start ++ ; end-- ;  
        }
    }
    public void nextPermutation(int[] nums) {
        int start = nums.length - 2  ; 

        while ( start >= 0 && nums[start] >= nums[start + 1 ]) start -- ;

        if ( start == -1 ) {

            reverse ( nums , 0 , nums.length-1 ) ; 
            return ; 
        }

        int end = start ; 

        while ( end < nums.length - 1 && nums[end + 1] > nums[start]) end++ ; 

        swap(nums , start  , end ) ; 

        reverse( nums , start + 1 , nums.length - 1 ) ; 
    }
}