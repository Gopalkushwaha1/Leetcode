class Solution {
    public double maxAvarge(int[] arr , int k ) {
       int start = 0 , end = 0  ;
       double maxAverage = Integer.MIN_VALUE , sum = 0 ;


       for ( end = 0 ; end < k ; end++ ) {
           sum += arr[end] ;
       }
       maxAverage = sum/k ;
       while ( end < arr.length ) {
           sum = sum + arr[end];
           sum = sum - arr[start];
           maxAverage = Math.max(maxAverage , sum/k);
           start++ ; end++;
       }
       return maxAverage ;
   }

    public double findMaxAverage(int[] arr, int k) {
        if ( k == 1 ) {
           int max = Integer.MIN_VALUE;
           for ( int ele : arr) {
               max = Math.max(max , ele);
           }
           return max;
       }
       return maxAvarge(arr , k ) ;
    }
}