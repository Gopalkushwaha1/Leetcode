class Solution {
    public boolean isValid (long mid , long n  , int[] bt  ) {
        long req = mid * n ;
        long totalSum = 0 ;
        for ( int ele : bt ) {
            totalSum += Math.min ( ele , mid ) ;
        }
        return totalSum >= req ;
    }
    public long maxRunTime(int n, int[] bt) {
        long min = 1*1L ; 
        long max = 1 ; 

        for ( int ele : bt ) {
            min = Math.min (min , ele ) ;
            max += ele ;
        }

        // max = 

        while ( min <= max ) {
            long mid = (max + min ) / 2 ;

            if ( isValid( mid , n , bt )) {
                min = mid + 1 ;
            }
            else {
                max = mid -1 ;
            }
        }

        return max ;
    }
}