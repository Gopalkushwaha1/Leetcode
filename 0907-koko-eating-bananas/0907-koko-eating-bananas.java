class Solution {
    public boolean isPossible(int[] arr , long mid , int h ) {
        int count = 0  ; 

        for ( int ele : arr ) {
            count += ele%mid == 0 ? ele/mid : (ele/mid) + 1 ; 
        }
        return (int)count <= h ; 
    }
    public int minEatingSpeed(int[] piles, int h) {
        long start = 1 ; 
        long end = 0 ; 
        // long count = 0 ; 
        for ( int ele : piles ) {
            end += ele ;  
        }
        // if(start == end ) {
        //     return (int)count += start%h == 0 ? start/h : (start/h)+1 ; 
        // }

        while ( start <= end ) {
            long mid = start + (end-start)/2 ; 
            if(isPossible(piles , mid , h)){
                end = mid - 1 ; 
            }
            else {
                start = mid + 1 ; 
            }
        }
        return (int)start ; 
    }
}