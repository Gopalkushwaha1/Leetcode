class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length ; 
        int[] leftravelMax = new int[n] ;
        int[] rightravelMax = new int[n] ;
        int[] result = new int[ n - k + 1 ] ;

        for ( int i = 0 ; i < n ; i++ ) {
            
            if ( i % k == 0 ) leftravelMax[i] = nums[i] ;

            else leftravelMax[i] = Math.max(leftravelMax[i - 1] , nums[i]) ; 

        }
        for ( int i = n -1  ; i >= 0  ; i-- ) {
            
            if ( (i + 1 ) % k == 0 || i == n - 1 ) rightravelMax[i] = nums[i] ;

            else rightravelMax[i] = Math.max(rightravelMax[i + 1] , nums[i]) ; 

        }
        for ( int i = 0 ; i < result.length ; i++ ) {
            
            result[i] = Math.max(rightravelMax[i] , leftravelMax[i+k-1] ) ;

        }
        return result ; 
    }
}