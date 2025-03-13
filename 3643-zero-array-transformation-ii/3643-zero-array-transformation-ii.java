class Solution {
    public boolean isPossibleZero(int[] nums , int[][] queris , int k ) {
        int sum = 0 ; 
        int[] prefix = new int[nums.length+1] ; 

        for ( int i = 0 ; i < k ; i++ ) {
            int start = queris[i][0] ; 
            int end = queris[i][1] ; 
            int val = queris[i][2] ; 

            prefix[start] += val ; 
            prefix[end+1] -= val ; 
        }

        for ( int i = 0 ; i < nums.length ; i++ ) {
            sum += prefix[i] ; 

            if ( sum < nums[i] ) return false ; 
        }

        return true ; 
    }
    public int minZeroArray(int[] nums, int[][] queries) {
        int start = 0 , end = queries.length ; 

        if ( !isPossibleZero(nums , queries , queries.length )) return -1 ; 

        while ( start <= end ) {
            int mid = (start + end ) / 2 ; 

            if ( isPossibleZero(nums , queries , mid )) {
                end = mid - 1 ; 
            }
            else {
                start = mid + 1 ; 
            }
        }

        return start ; 
    }
}