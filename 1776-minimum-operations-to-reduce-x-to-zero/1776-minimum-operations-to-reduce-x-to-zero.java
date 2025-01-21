class Solution {
    public int minOperations(int[] nums, int x) {
        x = -x ;                                      

        for ( int ele : nums ) {                   // calculate sum 
            x += ele ; 
        }

        if ( x < 0  ) return -1 ;               // if sum less than 0 return -1 (not possible )
        else if ( x == 0 ) return nums.length ; // if sum == 0 then return full len 

        int start = 0 , end = 0 , len = 0 ;     // define prerequisties variable 
        while ( end < nums.length  ) {

            x -= nums[end] ;                

            while ( x < 0 ) x += nums[start++] ; 

            if( x == 0 ) len = Math.max( len , end - start + 1 ) ; 

            end++ ; 
        }
        return len == 0 ?  -1 : nums.length - len ; 
    }
}