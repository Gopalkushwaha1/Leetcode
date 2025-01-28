class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
       if ( k == 0 ) return 0 ; 
       int product = 1 , count = 0 , start = 0 , end = 0 ; 

       while ( end  < nums.length &&  product * nums[end] < k ) {

            count += end - start + 1  ;
            product *= nums[end] ;  
            end++ ; 
       } 
       if ( end == nums.length ) return count ;

       while ( end < nums.length ) {

        product *= nums[end] ; 

        while ( product >= k && start <= end  ) {
            product /= nums[start++] ; 
        }
        count += end - start + 1 ;
        end++ ; 
       }

       return count ; 
    }
}