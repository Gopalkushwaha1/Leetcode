class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
       int ans = 0 ; 
       int[] count = new int[nums.length + 1 ] ; 
       count[0] = 1 ; 
       int total = 0 ;

       // Travel each ele 
       for ( int ele : nums ) {
        total += ele & 1 ;  // if ele is odd then update total odd count by 1 

        // check if conditon true ( we get k odd number ) update the ans 
        if ( total - k >= 0 ) {
            ans += count[total- k ] ; 
        }
        count[total]++ ; 
       } 
       return ans ;  
    }
}