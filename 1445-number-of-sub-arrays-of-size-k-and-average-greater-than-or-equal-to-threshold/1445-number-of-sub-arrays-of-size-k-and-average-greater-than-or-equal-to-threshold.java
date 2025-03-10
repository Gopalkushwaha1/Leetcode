class Solution {
    public int numOfSubarrays(int[] arr, int k, int t) {
        int count = 0 ; 
        int end = 0 ; 
        int start = 0 ;
        int sum = 0 ; 
        // creating window of len k 
        for ( end = 0 ; end < k ; end++ ) {
            sum += arr[end] ; 
        }
        if ( sum >= t * k ) count++ ; // if first window satisfy the condition update count 
        // Applaying sliding window 
        while ( end < arr.length ) {
            sum += arr[end] - arr[start] ;
            if ( sum >= t * k) count++ ;
            end++; start++;
        }
        return count ; 
    }
}