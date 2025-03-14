class Solution {
    public boolean isPossible(int mid , int[] candies , long k ) {
        if ( mid == 0 ) return false ; 
        long check = 0 ; 
        for ( int ele : candies ) {
            check += ele/mid ; 
        }
        return check >= k ; 
    } 
    public int maximumCandies(int[] candies, long k) {

        int start = 0 , end = 0 , sum = 0 ; 
        for ( int ele : candies ) {
            end = Math.max ( ele , end ) ;
            sum += ele ;  
        }
        if ( sum >= k && sum <= 2* k ) return 1 ; 
        if ( k == 1 ) return end ; 

        while ( start <= end ) {
            int mid = (start + end ) / 2 ; 

            if ( isPossible(mid , candies , k )) {
                start = mid + 1 ; 
            }
            else {
                end = mid - 1 ; 
            }
        }
        return end <= -1 ? 0 : end  ; 
    }
}