class Solution {
    public boolean isPossible(long time , int height , int[] worker ) {
        // now check 
        for ( int i = 0 ; i < worker.length ; i++ ) {
            long j = 1L ; 
            long curr = 0 ; 

            while ( height > 0 && curr + j * worker[i] <= time ) {
                curr += j * worker[i] ; 
                j++ ; 
                height--  ; 
            }
            // ealry check 
            if(height == 0 ) return true ; 
        }
        return height == 0 ; 
    }
    public long minNumberOfSeconds(int mountainHeight, int[] workerTimes) {
        // take min max 
        long min = 1L ; 
        long max = 0 ; 

        long dummy = 1L ; 

        // find max 
        for ( int ele : workerTimes ) {
            dummy = Math.max(ele , dummy ) ; 
        }

        // find range 
        for ( int i = 1 ; i <= mountainHeight ; i++ ) {
            max += dummy * i ; 
        }

        // Apply binary search 

        while ( min < max ) {
            // find mid 

            long mid = (min+max)/2 ; 
            if(isPossible(mid , mountainHeight , workerTimes )) {
                max = mid ; 
            }
            else {
                min = mid + 1 ; 
            }
        }

        return min ; 
    }
}