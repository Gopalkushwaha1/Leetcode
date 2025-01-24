class Solution {
    public void reverse( int[] nums , int start , int end ) {
        while ( start < end ) {
            int temp = nums[start] ;
            nums[start] = nums[end] ;
            nums[end]  = temp ; 
            start++ ; end-- ; 
        }
    }

    public void nextPermutation(int[] nums) {
        int i = nums.length - 2  ; 

        while (i >= 0 &&  nums[i] >= nums[i+1]) i-- ; 

        if ( i == -1 ) {
            reverse(nums , 0 , nums.length - 1 ) ;
            return ;  
        }

        int j = i ; 
        System.out.print(j) ; 
        while ( j < nums.length - 1  && nums[j+1] > nums[i]) j++ ; 

        // j = j - 1 ;

        int temp = nums[i] ; 
        nums[i] = nums[j] ;
        nums[j] = temp ; 

        reverse(nums , i + 1 , nums.length - 1 );
    }
}