class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if ( k == 1 ) return nums ; 
        int n = nums.length ; 
        int[] leftSum = new int[n] ;
        int[] rightSum = new int[n] ; 
        int[] result = new int[n-k+1] ;

        // Filling left sum 
        for ( int i = 0 ; i < n ; i++ ) {
            if( i % k == 0 ) {
                leftSum[i] = nums[i] ; 
            } 
            else {
                leftSum[i] = Math.max ( leftSum[i-1] , nums[i] ) ;
            }
        }
        // Filling right sum 
        for ( int i = n-1 ; i >= 0  ; i-- ) {
            if( i == n-1 ||  (i+1) % k == 0 ) {
                rightSum[i] = nums[i] ; 
            } 
            else {
                rightSum[i] = Math.max ( rightSum[i+1] , nums[i] ) ;
            }
        }
        // Filling result 
        for ( int i = 0 ; i < result.length ; i++ ) {
            result[i] = Math.max( leftSum[i+k-1] , rightSum[i]);
        }
        return result ; 
    }
}