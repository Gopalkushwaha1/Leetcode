class Solution {
    public int maximumCount(int[] nums) {
        int zero = 0 , one = 0 , ans = 0 ;

        for ( int ele : nums ) {
            if ( ele < 0 ) zero++;
            if ( ele > 0 ) one++ ; 
        } 

        return Math.max(zero , one ) ; 
    }
}