class Solution {
    public boolean isPossible(int[] rank , int cars , long time ) {
        long total = 0 ; 

        for ( int ele : rank ) {
            total += (long)Math.sqrt(time/ele) ;  
            if ( total >= cars ) return true ; 
        }
        return false ; 
    }
    public long repairCars(int[] ranks, int cars) {
        long start = 1 , end = (long)1e14 + 1 ; 

        // for ( int ele : ranks ) {
        //     end = Math.max(ele , end ) ; 
        // }
        // end = cars*cars * end ;

        while ( start <= end ) {
            long mid = start + (end - start)/2 ; 

            if ( isPossible(ranks , cars , mid )) {
                end = mid - 1 ; 
            }
            else {
                start = mid + 1 ; 
            }
        } 
        return start  ; 
    }
}