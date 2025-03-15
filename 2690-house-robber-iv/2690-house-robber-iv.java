class Solution {
    public boolean isPossible( int mid , int[] nums , int k ) {
        int i = 0 , count = 0 ; 
        while ( i < nums.length ) {
            if ( nums[i] <= mid ) {
                count++;
                i += 2 ; 
            }
            else i++ ; 
            if ( count >= k ) return true ; 
        }
        return false ; 
    }
    public int minCapability(int[] nums, int k) {
        int min = Integer.MAX_VALUE , max = 0 ; 
        for ( int ele : nums ) {
            min = Math.min(ele , min ) ; 
            max = Math.max( ele , max ) ; 
        } 
        // if ( k == 1 ) return  min; 
        while ( min <= max ) {
            int mid = min + (max - min)/2 ; 
            if ( isPossible(mid , nums , k )) max = mid - 1 ; 
            else  min = mid + 1 ;
        }
        return min ; 
    }
}