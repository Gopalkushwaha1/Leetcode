class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count = 0 ;  // to store number of count variable 
        int start = 0 ;
        int end   = 0 ; 
        int sum   = 0 ;
        // Making Sliding window of kth size 
        for ( end = 0 ; end < k ; end++ ) {
            sum += arr[end] ; 
        } 
        if ( sum >= k * threshold ) {
                count++ ; 
            }   

        // Moving Sliding window 
        while ( end < arr.length ) {
            sum += arr[end] ;
            sum -= arr[start] ;
            if ( sum >= k * threshold ) {
                count++ ; 
            }
            end++ ;  
            start++ ; 
        }
        return count ; 
    }
}